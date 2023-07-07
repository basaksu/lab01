import java.util.Arrays;

public class IntBag {
    private int[] bag;
    private int size;

    public IntBag() {
        bag = new int[4];
        size = 0;
        bag[size] = -1; 
    }

    public void add(int value) {
        if (size == bag.length - 1) {
            expand();
        }
        bag[size] = value;
        bag[size + 1] = -1;
        size = size + 1;
    }    

    public int getLength(){
        return bag.length;
    }

    public void add(int index, int value) {
        if (size == bag.length) {
            expand();
        }
        if (index >= 0 && index <= size) {
            for (int i = size; i > index; i--) {
                bag[i] = bag[i - 1];
            }
            bag[index] = value;
            size++;
        } 
        else {
            System.out.println("There is no such index exists");
        }
    }

    public int getSize() {
        return size;
    }

    public void expand() {
        int[] newArray = new int[bag.length * 2]; //If there is no room for another value
        System.arraycopy(bag, 0, newArray, 0, bag.length);
        bag = newArray;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                bag[i] = bag[i + 1];
            }
            size--;
        } 
        else {
            System.out.println("There is no such value exists");
        }
    }

    public int getValue(int index) {
        return bag[index];
    }

    public void removeAll(int value) {
        int[] newArray = new int[bag.length];
        int newSize = 0;
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (bag[i] != value) {
                newArray[newSize++] = bag[i];
            }
            else {
                found = true;
            }
        }
        bag = newArray;
        size = newSize;

        if (!found) {
            System.out.println("There is no such value exists");
        }
    }

    public String toString() {
        int[] elements = Arrays.copyOf(bag, size); 
        return Arrays.toString(elements);
    }
}
