package Week12;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

       animals.push("dog");
       animals.push("goat");
       animals.push("chicken");
       animals.push("lizard");

       String element = animals.pop();
       String element1 = animals.peek();
       int position = animals.search("goat");
       boolean result = animals.empty();

        System.out.println("Stack: " + animals);
        System.out.println("The pop method returns: " + element);
        System.out.println("The peek method returns: " + element1);
        System.out.println("The position method returns: " + position);
        System.out.println("Is the stack empty? " + result);

    }
}
