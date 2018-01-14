package day.tech.dojo.redundancylinkedlist;

import java.util.HashSet;

public class Solution {
  class LinkedListNode {
    int val;
    LinkedListNode next;
  };
  
  static LinkedListNode distinct(LinkedListNode head) {
    HashSet<Integer> nodeValues = new HashSet<Integer>();
 
    LinkedListNode current = head;
    LinkedListNode prev = null;
  
    while (current != null) {
        int curval = current.val;
         
        if (nodeValues.contains(curval)) {
            prev.next = current.next;
        } else {
            nodeValues.add(curval);
            prev = current;
        }
        current = current.next;
    }
    
    return head;
  }
}
