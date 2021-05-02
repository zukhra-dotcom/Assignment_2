package com.company;

public class MaxHeap {
    private int[] theHeap;
    private int size = 0;
    private int capacity = 10;
    int pos;

    public MaxHeap(){
        pos = 1;
        theHeap = new int[capacity];
    }

    public void insert(int value){
        if(pos == capacity){
            //Increase the capacity
        }else{
            theHeap[pos++] = value;

            int child = pos - 1;
            int parent = child / 2;

            while (theHeap[parent]<theHeap[child] && parent>0){
                int tmp = theHeap[parent];
                theHeap[parent] = theHeap[child];
                theHeap[child]=tmp;

                child = parent;
                parent = child / 2;
            }
        }
    }
    public void print(){
        for(int i = 1; i< pos; i++){
            System.out.print(theHeap[i] + " ");
        }
    }

    public boolean empty() {
        if(!heap.empty){
            System.out.print("Not empty");}
        else{
            return true;
        }
        return true;
    }

    public char size(){
        size();
        return 0;
    }

    public T getMax(){
        return get(0);
    }

    private T get(int index) {
        return(T) array[index];
    }


    private int[] Heap;


    public int extractMax()
    {
        int popped = Heap[1];
        Heap[1] = Heap[size--];
        return popped;
    }

}
