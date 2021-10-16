package day3.typy_generyczne2;

import java.util.Arrays;
import java.util.Objects;

public class MyList<E> {

    protected E[] genericArray;
    protected int n;


    public MyList(int n) {
        this.n = n;
        genericArray = (E[]) new Object[n];

    }

    public boolean ifContains(E element) {
        for (int i = 0; i < genericArray.length; i++) {
            if (element.equals(genericArray[i])) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        int counter = 0;
        for (E e : genericArray) {
            if (e != null) {
                counter++;
            }
        }
        return counter;
    }

    public boolean addElement(E element) {
        for (int i = 0; i < genericArray.length; i++) {
            if (genericArray[i] == null) {
                genericArray[i] = element;
                return true;
            }
        }
        return false;
    }

    public E getElement(E element) {
        if(n <= this.n) {
            return genericArray[n];
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "[" + Arrays.toString(genericArray) + "]";
    }
}

