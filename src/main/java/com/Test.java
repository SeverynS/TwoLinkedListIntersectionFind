package com;

import com.models.Lists;

public class Test {
    public static void main(String[] args) {
        Lists.Node listA = new Lists().generateList(1);
        Lists.Node listB = new Lists().generateList(1);
        //Lists.makeIntersect(listA, listB);
        //Lists.makeIntersectManual(listA, listB);
        listA.value = 3;
        listA.next = null;
        listB = listA;

        while(listA.next != null){
            System.out.println(listA.next + " " + listA.value);
            listA = listA.next;
        }

        System.out.println("*****************");

        while(listB.next != null){
            System.out.println(listB.next + " " + listB.value);
            listB = listB.next;
        }

        System.out.println(Solution.getIntersectionNode(listA, listB));
    }
}
