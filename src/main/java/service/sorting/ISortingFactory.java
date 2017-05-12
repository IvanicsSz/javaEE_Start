package service.sorting;


public class ISortingFactory<T extends Comparable<T>> {

    public Sorting<T> getSortingType(SortType sortType) throws Exception{

        switch (sortType.name()){
            case "BUBBLE_SORT":
                return new BubbleSort();
            case "MERGE_SORT":
                return new MergeSort();
            case "QUICK_SORT":
                return new QuickSort();
            default:
                throw new Exception("can't be sort with " + sortType.name());
        }

    }
}
