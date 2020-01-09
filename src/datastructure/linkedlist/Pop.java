package datastructure.linkedlist;

import java.util.LinkedList;

public class Pop {

    public static void main(String[] args) {

       LinkedList<String> stack = new LinkedList<>();
       stack.push("First");
       stack.push("Second");
       stack.push("Third");
       stack.push("Forth");
       String s = stack.pop();
       System.out.println(s);

       stack.push("Fifth");
        System.out.println(stack);
    }
}
