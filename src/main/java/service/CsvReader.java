package service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@CsvRead
public class CsvReader {

    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';


    public CsvReader() {
    }


    public List<String> reader(String path) throws Exception{

        Scanner scanner = new Scanner(new File(path));
        List<String> result = new ArrayList<>();
        while(scanner.hasNext()){
            List<String> line = parseLine(scanner.nextLine(), DEFAULT_SEPARATOR, DEFAULT_QUOTE);
            result.add(line.get(0));
            result.add(line.get(1));
        }
        scanner.close();
        return result;
    }

    private List<String> parseLine(String csvLine, char separators, char customQuote){

        List<String > result = new ArrayList<>();

        if (csvLine == null){
            return result;
        }

        StringBuilder curVal = new StringBuilder();
        boolean inQuotes = false;

        char[] chars = csvLine.toCharArray();

        for (char ch: chars){

            if (inQuotes){
                if (ch == customQuote){
                    inQuotes = false;
                } else{
                    curVal.append(ch);
                }
            } else {

                 if ( ch == separators){
                    result.add(curVal.toString());
                    curVal = new StringBuilder();
                } else if(ch == '\n'){
                    break;
                } else if(ch == DEFAULT_QUOTE ){
                    inQuotes = true;
                    continue;
                }
                else{
                    curVal.append(ch);
                }
            }
        }
        result.add(curVal.toString());

        return result;
    }

}
