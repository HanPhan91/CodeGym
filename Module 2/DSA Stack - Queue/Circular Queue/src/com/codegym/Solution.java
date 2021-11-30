package com.codegym;

public class Solution {
    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front, rear;

        public Queue() {
            front = rear = null;
        }
    }

    static void enQueue(Queue q, int data) { //Thêm phần tử vào cuối
        Node temp = new Node();
        temp.data = data;
        if (q.front == null) //Nếu hàng đợi rỗng thì đầu = cuối = data thêm vào
            q.front = q.rear = temp;
        else
            q.rear.link = temp; //Gán liên kết phần tử cuối bằng temp
        q.rear = temp; // Đặt lại phần tử cuối
        q.rear.link = q.front; // Nối phần tử cuối với phần tử đầu
    }

    static int deQueue(Queue q) { // Lấy ra phần tử đầu tiên
        if (q.front == null) {
            System.out.println("Queue null");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = q.rear = null;
        }
        else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link= q.front;
        }
        return value;
    }
    static void showQueue(Queue q){
        Node temp= q.front;
        System.out.println("Element on Queue: ");
        while (temp.link != q.front){
            System.out.printf("%d \n", temp.data);
            temp =temp.link;
        }
        System.out.printf("%d", temp.data);
    }
}
