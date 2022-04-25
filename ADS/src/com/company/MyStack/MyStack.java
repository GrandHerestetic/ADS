package com.company.MyStack;
import java.util.ArrayList;

public class MyStack {
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data){
        if (size() == capacity){
            expand();
        }
        stack[top] = data;
        top++;
    }

    public void expand(){
        int length = size();
        int newStack[] = new int [capacity * 2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity = capacity * 2;
    }

    public boolean empty(){
        return top <= 0;
    }

    public int size(){
        return top;
    }

    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public void peek(){
        int data;
        data = stack[top];
        System.out.println(data);
        return;
    }
}
