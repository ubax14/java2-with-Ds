package Chabter10;

import java.util.Stack;

public class Reverse {
    public static String reverse(String input) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++)
            stack.push(input.charAt(i));
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty())
            reversed.append(stack.pop());
        return reversed.toString();

    }

    public static void main(String[] args) {
        System.out.println(reverse("Ubah"));
    }
}
