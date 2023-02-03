import java.util.*;

/*
 * 
 *  1. A DATA STRUCTURE defines the way data is stored, organized, and manipulated (Arrays, Trees, Graphs)
 *  2. ARRAYs(collections) are elements stored at contiguous memory locations. Elements are same type.
 *  3. LINKED LIST are linear data structures not always stored contiuously each node points to the next node.
 *  4. LIFO = last in first out
 *  5. A STACK is a linear data structure, storing data in LIFO order
 *  6. FIFO = first in first out
 *  7. QUEUE is a linear data structure that acts in a FIFO manner
 *  8. A BINARY TREE is an extension of th elinked list. Each node has two child nodes
 *  9. RECURSION is a function that calls itself using LIFO with a STACK data structure
 *  10. OOP = OBJECT ORIENTED PROGRAMMING (Object, classes, inheritance)
 *  11. Concepts in OOP : OBJECTS having properties and behaviors, CLASSES having a blueprint
 *          INHERITANCE objects gain properties of parent objects, POLYMORPHISM having tasks
 *          being performed in different ways(method overloading/overriding), ABSTRACTION Having
 *          hidden internal details with access to functinality only, ENCASULATION wrapping code
 *          and data together.
 * 12. BINARY TREE SEARCH is used to retrieve data efficiently
 * 13. DOUBLY LINKED LISTS: a special kind of list. transversal can be done on data from both directions
 * 14. GRAPH is a data structure containing ordered pairs of data (edges connect nodes)
 * 15. Linear data is adjacent, non-linear datacan connect over two adjacent elements
 * 16. DEQUE is a double ended queue. data can be inserted or removed from either end
 *  
 */



public class InterviewQuestions {
    public static void main(String[] args) {
        String str = "Joseph DeCommer";
        String reverse = "";
        for(int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }
}
