package com;

import com.models.Lists;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static Lists.Node getIntersectionNode(Lists.Node headA, Lists.Node headB) {
        List<Lists.Node> first = new ArrayList<>();
        List<Lists.Node> second = new ArrayList<>();
//        if (headA == headB) {
//            return headA;
//        }
//        if (headA != null && headA.next == null) {
//            first.add(headA);
//        }
//        if (headB != null && headB.next == null) {
//            second.add(headB);
//        }
        do{first.add(headA);
            if(headA.next == null){
                break;
            }
        headA = headA.next;}
        while (headA.next != null);

        do{second.add(headB);
            if(headB.next == null){
                break;
            }
            headB = headB.next;}
        while (headB.next != null);

        for (Lists.Node i : first) {
            if(second.contains(i)){
                return i;
            }
        }
        return null;
    }
}

