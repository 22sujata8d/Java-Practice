package com.dsa.linkedlist.nodes;

public class SingleLinkedNode {
    private int value;
    private SingleLinkedNode nextNode;

    public SingleLinkedNode(int value, SingleLinkedNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public int getVal() {
        return this.value;
    }

    public SingleLinkedNode getNextNode() {
        return this.nextNode;
    }

    public void setVal(int value) {
        this.value = value;
    }

    public void setNextNode(SingleLinkedNode node) {
        this.nextNode = node;
    }
}
