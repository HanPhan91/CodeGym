package com.codegym;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution.Queue q = new Solution.Queue();
        Solution.enQueue(q, 12);
        Solution.enQueue(q, 22);
        Solution.enQueue(q, 42);
        Solution.enQueue(q, 62);
        Solution.showQueue(q);
        Solution.deQueue(q);
        Solution.showQueue(q);
    }
}
