package com.algorithm;

public class Solution {
    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(10);
        customLinkedList.add(20);
        customLinkedList.add(30);
//        customLinkedList.print();
        customLinkedList.addFirst(300);
        customLinkedList.delete(30);
        customLinkedList.print();
    }
}
