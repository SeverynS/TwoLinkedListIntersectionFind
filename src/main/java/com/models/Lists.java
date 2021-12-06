package com.models;

public class Lists {
    public static class Node {
        public Node(int value) {
            this.value = value;
        }

        public Node next;
        public int value;


    }

    public Node generateList(int listLength) {
        Node[] nodes = new Node[listLength];
        Node head = randomNode();
        Node tail = head;
        for (int i = 0; i < listLength; i++) {
            nodes[i] = tail;
            tail.next = randomNode();
            tail = tail.next;
        }
        return head;
    }

    private Node randomNode() {
        return new Node((int) (Math.random() * 100));
    }

    public static void makeIntersect(Node a, Node b){
        int rnd = (int) (Math.random() * 3);
        int counter = 0;
        while(a.next != null){
            if(counter == rnd){
                a.next = b;
                break;
            }
            a = a.next;
            counter++;
        }
    }

    public static void makeIntersectManual(Node a, Node b){
        
        }
    }

