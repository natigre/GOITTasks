package com.mazurnata.practice.module09;

public class NodeExampleMain {
    public static void main(String[] args) {
        NodeExample node1 = new NodeExample();
        NodeExample node2 = new NodeExample();
        NodeExample node3 = new NodeExample();

        node1.next = node2;
        node3.next = node3;

        node1.value = "c";
        node1.next.value = "b";
        node1.next.next.value = "a";
    }
}
