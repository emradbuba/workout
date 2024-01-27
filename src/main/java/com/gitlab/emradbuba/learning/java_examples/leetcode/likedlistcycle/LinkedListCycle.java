package com.gitlab.emradbuba.learning.java_examples.leetcode.likedlistcycle;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        List<ListNode> visited = new ArrayList<>();
        if(head.next == null) return false;
        visited.add(head);
        while(head.next != null) {
            head = head.next;
            for(ListNode visitedNode : visited) {
                if(visitedNode == head) return true;
            }
            visited.add(head);
        }
        return false;
    }
}
