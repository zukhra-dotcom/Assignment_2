package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
//    System.out.print(heap.empty());
//    System.out.print(heap.size());
        heap.insert(15);
        heap.insert(7);
        heap.insert(5);
        heap.insert(12);
        heap.insert(20);
        heap.insert(13);

        heap.print();

    }
}



