package stackSort;

import java.util.Stack;

public class DemoStackSort {
    public static void stackSort(Stack<Integer> integerStack){
        Stack<Integer> tempStack = new Stack<>();

        while (!integerStack.isEmpty()) {
            int temp = integerStack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() < temp){
                integerStack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        while (!tempStack.isEmpty()){
            integerStack.push(tempStack.pop());
        }
    }
    public static void printStack (Stack<Integer> stack){
        for (int i : stack){
            System.out.print(i + " / ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(6);
        integerStack.push(1);
        integerStack.push(4);
        integerStack.push(7);
        integerStack.push(2);
        integerStack.push(9);

        System.out.println("Не отсортированный стек:");
        printStack(integerStack);
        System.out.println("-".repeat(24));
        stackSort(integerStack);

        System.out.println("Отсортированный стек:");
        printStack(integerStack);
        System.out.println("=".repeat(24));
    }
}
