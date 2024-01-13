package com.dsa.linkedlist.nodes;

public class DoubleLinkedNode {
    private int value;
    private DoubleLinkedNode nextNode;
    private DoubleLinkedNode prevNode;

    public DoubleLinkedNode(int value, DoubleLinkedNode nextNode, DoubleLinkedNode prevNode) {
        this.value = value;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }

    public DoubleLinkedNode(int value, DoubleLinkedNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public DoubleLinkedNode(int value) {
        this.value = value;
    }

    public int getVal() {
        return this.value;
    }

    public DoubleLinkedNode getNextNode() {
        return this.nextNode;
    }

    public DoubleLinkedNode getPrevNode() {
        return this.prevNode;
    }

    public void setVal(int value) {
        this.value = value;
    }

    public void setNextNode(DoubleLinkedNode node) {
        this.nextNode = node;
    }

    public void setPrevNode(DoubleLinkedNode node) {
        this.prevNode = node;
    }
}
