package Seminar04;
/*
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
 */
public class Task5 {
    public static void main(String[] args) {
                MyStack myStack = new MyStack();
                myStack.push(1);
                myStack.push(2);
                myStack.push(3);
                myStack.push(4);

                while (!myStack.empty()){
                    System.out.println(myStack.pop());
                }
    }
}
