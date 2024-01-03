package _01_tree.heap;

import java.util.Comparator;

public class MaxHeap<T extends Number & Comparable<T>> extends ArrayHeap<T> {

    public MaxHeap() {
        super((Comparable::compareTo));
    }

    public MaxHeap(Comparator<T> comparator) {
        super(comparator);
    }

    public MaxHeap(int maxSize, Comparator<T> comparator) {
        super(maxSize, comparator);
    }

}
