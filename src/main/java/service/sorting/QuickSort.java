package service.sorting;


import model.EquityModel;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Sort(type = SortType.QUICK_SORT)
public class QuickSort<T extends Comparable<T>> implements Sorting<EquityModel> {

    public QuickSort() {
    }

    public List<EquityModel> sort(List<EquityModel> values) {
        if (values ==null || values.isEmpty()){
            return Collections.emptyList();
        }
        List<EquityModel> numbers;

        numbers = values;
        quickSort(numbers, 0, values.size() - 1);
        return numbers;
    }

    private  void quickSort(List<EquityModel> numbers, int low, int high) {
        int i = low;
        int j = high;
        EquityModel pivot = numbers.get(low + (high-low)/2);

        while (i <= j) {
            while (numbers.get(i).compareTo(pivot) < 0) {
                i++;
            }
            while (numbers.get(j).compareTo(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchange(numbers, i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quickSort(numbers, low, j);
        if (i < high)
            quickSort(numbers, i, high);
    }

    private void exchange(List<EquityModel> numbers, int i, int j) {
        EquityModel temp = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, temp);
    }



}
