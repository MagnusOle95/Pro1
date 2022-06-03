package Stak;

import java.util.NoSuchElementException;

public class ArrayDropOutStack implements StackI {

    private Object[] stack;
    private int top;
    private int stackstørrelse;

    public ArrayDropOutStack(int stackstørrelse){
        top = -1;
        stack = new Object[stackstørrelse];
        this.stackstørrelse = stackstørrelse;
    }

    @Override
    public void push(Object element) {

        if (top == stackstørrelse - 1){
            for (int i = 0; i <= top - 1; i++){
                stack[i] = stack[i + 1];
            }
            stack[top] = element;
        }else{
            top++;
            stack[top] = element;
        }
    }

    @Override
    public Object pop() {
        if (top < 0){
            throw new NoSuchElementException();
        }
        Object element = stack[top];
        stack[top] = null;
        top--;
        return element;
    }

    @Override
    public Object peek() {
        if (top < 0){
            throw new NoSuchElementException();
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}
