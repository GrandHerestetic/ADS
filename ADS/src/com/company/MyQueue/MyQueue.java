package com.company.MyQueue;

public class MyQueue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        queue[rear] = data;
        rear = (rear + 1) % 5;
        size++;
    }

    public int deQueue(){
        int data = queue[front];
        front = (front + 1) % 5;
        size--;
        return data;
    }
    public void show(){
        for (int i = 0; i < size; i++){
            System.out.println(queue[(front + i) % 5] + " ");
        }
    }

    public int size(){
        return size;
    }

    public boolean empty(){
        return size == 0;
    }

    public int peek(){
        return queue[front];
    }
}
