package com.company;

import com.company.MyQueue.MyQueue;
import com.company.MyStack.MyStack;

public class Main {

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        System.out.println(q.empty());
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(4);
        q.deQueue();
        q.deQueue();
        System.out.println(q.empty());
        q.show();
        System.out.println(q.size());
	// write your code here
    }
}
