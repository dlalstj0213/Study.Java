package _01_tree.heap;

import jdk.internal.util.ArraysSupport;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// ArrayHeap [배열 고정]
// TODO: ArrayListHeap [배열 가변]
//
public abstract sealed class AbstractHeap<T> implements Heap<T> permits ArrayHeap {

    public AbstractHeap() {}

    protected int parent(int pos) {
        return pos / 2;
    }

    protected int leftChild(int pos) {
        return pos * 2;
    }

    protected int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    protected boolean isLeaf(int pos) {
        return (pos > (size() / 2) && pos <= size());
    }
}
