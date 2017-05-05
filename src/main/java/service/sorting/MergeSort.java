package service.sorting;

import java.util.Arrays;
import java.util.List;

@Sort(type = SortType.MERGE_SORT)
public class MergeSort<T extends Comparable<T>> implements Sorting<T> {

    private List<T> result = null;

    private void merge(T[] firstHalf, T[] secondHalf, T[] full) {
        int i = 0;
        int j = 0;
        while (i + j < full.length) {
            if (j == secondHalf.length || (i < firstHalf.length && firstHalf[i].compareTo(secondHalf[j]) < 0))
                full[i + j] = firstHalf[i++];
            else
                full[i + j] = secondHalf[j++];
        }
    }

    ///∗∗ Merge-sort contents of array S. ∗/
    private void sorting(List<T> fullList) {
        T[ ] full = toArray(fullList);
        int n = full.length;
        if (n < 2) return;
        int mid = n/2;
        T[ ] S1 = Arrays.copyOfRange(full, 0, mid);
        T[ ] S2 = Arrays.copyOfRange(full, mid, n);
        sort(Arrays.asList(S1));
        sort(Arrays.asList(S2));
        merge(S1, S2, full);
        result = Arrays.asList(full);
        }
    public List<T> sort(List<T> fullList){
        sorting(fullList);
        return result;
    }

    private static <T> T[] toArray(List<T> list) {
        T[] toR = (T[]) java.lang.reflect.Array.newInstance(list.get(0)
                .getClass(), list.size());
        for (int i = 0; i < list.size(); i++) {
            toR[i] = list.get(i);
        }
        return toR;
    }

}


