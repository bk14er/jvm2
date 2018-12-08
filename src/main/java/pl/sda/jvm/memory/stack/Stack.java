package pl.sda.jvm.memory.stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Random;

public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAUT_INITIAL_CAPACITY = 16;

    public Stack(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();

        elements[size] = null;

        return elements[--size];
    }

    /**
     * Zapewnienie miejsca na co najmniej jeden element, przy dwukrotnym
     * zwiększeniu rozmiaru tablicy za każdym razem, gdy musi być ona powiększona.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }


    public static void main(String[] args) {
        Stack stack = new Stack(10);


        while (true) {
            stack.push("Hi" + new Random().nextInt());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            stack.pop();
            System.out.println("Available memory: " + Runtime.getRuntime().freeMemory() / 1024 + "k");

        }


    }

}
