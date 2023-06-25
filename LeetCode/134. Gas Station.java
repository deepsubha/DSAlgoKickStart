Problem: https://leetcode.com/problems/gas-station/description/
Difficulty: Medium
Tags: Circular Singly Linked List
---------------------------------------------------------------
class Solution {
    Node first = null;
    Node last = null;
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i=0; i<gas.length; i++) {
            createNode(i, gas[i], cost[i]);
        }
        int startIndex = -1;
        Node start = this.first;
        while(start.next != this.first) {
            if (start.isStart == true){ startIndex = findStartIndex(start); }
            if (startIndex != -1) return startIndex;
            start = start.next;
        }
        if(start.gas < start.cost) return -1;
        else return findStartIndex(start);
    }

    /**create circular linkedlist */
    private void createNode(int i, int gas, int cost) {
        Node newNode = new Node(i, gas, cost);
        if (this.last == null) {
           newNode.next = newNode;
           this.first = this.last = newNode;
        }else{
            this.last.next = newNode;
            newNode.next = this.first;
            this.last = newNode; 
        }
        if(gas > cost) {
            newNode.isStart = true;
        }
    }

    /**find start */
    private int findStartIndex(Node start) {
        if(start == null) return -1;
        Node currNode = start;
        /* *used `gasData` as a buffer so that actual node.gas doestnot get updated with incorrect data in the next iteration(i.e. isStart = true)*/
        int gasData = currNode.gas;  
        while(currNode.next != start) {
            /*
            if(currNode.gas < currNode.cost) return -1;
            currNode.next.gas = (currNode.gas - currNode.cost) + currNode.next.gas;
            currNode = currNode.next;
            */
            if(gasData < currNode.cost) return -1;
            gasData = (gasData - currNode.cost) + currNode.next.gas;
            currNode = currNode.next;
        }
        if(gasData < currNode.cost) return -1;
        else return start.index;
    }
    /** Node each element of gas and cost */
    private class Node {
        int index;
        int gas;
        int cost;
        Node next;
        Boolean isStart = false;
        public Node(int index, int gas, int cost) {
            this.index = index;
            this.gas = gas;
            this.cost = cost;
        }
    }
}
