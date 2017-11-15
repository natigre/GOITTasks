package com.mazurnata.hometasks.module09;

import com.mazurnata.hometasks.module09.arrayList.MyArrayList;
import com.mazurnata.hometasks.module09.hashMap.MyHashMap;
import com.mazurnata.hometasks.module09.linkedList.MyLinkedList;
import com.mazurnata.hometasks.module09.queue.MyQueue;
import com.mazurnata.hometasks.module09.stack.MyStack;

public class Main {
    public static void main(String[] args) {
        System.out.println("MyArrayList:");
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");
        myArrayList.show();
        System.out.println(myArrayList.size());
        myArrayList.remove(0);
        myArrayList.get(0);
        myArrayList.clear();
        System.out.println(myArrayList.size());
        System.out.println("-------");
        System.out.println();

        System.out.println("MyLinkedList:");
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("one");
        myLinkedList.add("two");
        myLinkedList.add("three");
        myLinkedList.add("four");
        myLinkedList.add("five");
        myLinkedList.show();
        System.out.println(myLinkedList.size());
        myLinkedList.get(1);
        myLinkedList.remove(3);
        myLinkedList.clear();
        myLinkedList.show();
        myLinkedList.get(3);
        System.out.println(myLinkedList.size());
        myLinkedList.show();
        System.out.println("-------");
        System.out.println();

        System.out.println("MyQueue:");
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("one");
        myQueue.add("two");
        myQueue.add("three");
        myQueue.add("four");
        myQueue.show();
        myQueue.poll();
        myQueue.peek();
        myQueue.remove();
        myQueue.peek();
        System.out.println(myQueue.size());
        myQueue.clear();
        myQueue.show();
        System.out.println(myQueue.size());
        System.out.println("-------");
        System.out.println();

        System.out.println("MyStack: ");
        MyStack<String> myStack = new MyStack<>();
        myStack.push("one");
        myStack.push("two");
        myStack.push("three");
        myStack.push("four");
        myStack.show();
        System.out.println(myStack.size());
        myStack.peek();
        myStack.pop();
        myStack.peek();
        myStack.show();
        myStack.clear();
        myStack.show();
        System.out.println(myStack.size());
        System.out.println("-------");
        System.out.println();


        System.out.println("MyHashMap");
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("0", "Zero");
        myHashMap.put("1", "One");
        myHashMap.put("2", "Two");
        myHashMap.show();
        myHashMap.put("222", "New");
        myHashMap.show();
        System.out.println(myHashMap.get("111"));
        myHashMap.clear();
        myHashMap.show();
    }
}
