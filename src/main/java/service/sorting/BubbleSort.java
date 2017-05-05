package service.sorting;


import java.util.List;

@Sort(type = SortType.BUBBLE_SORT)
public class BubbleSort<T extends Comparable<T>> implements Sorting<T>{


    public List<T> sort(List<T> toSort) {

        T tmp;

        for (int i = 0; i < toSort.size() - 1; i++) {
            for (int j = 1; j < toSort.size() - i; j++) {
                if (toSort.get(j - 1).compareTo( toSort.get(j)) == 1) {
                    tmp = toSort.get(j - 1);
                    toSort.set(j - 1, toSort.get(j));
                    toSort.set(j,tmp);
                }
            }
        }
        return toSort;
    }




}
