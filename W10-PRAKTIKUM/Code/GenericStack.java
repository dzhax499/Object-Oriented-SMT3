import java.util.ArrayList;

public class GenericStack<T> { // Menjadi generik

    private ArrayList<T> itemsList;

    // Pengecualian tetap sama
    public static class ArrayStackException extends RuntimeException {
        public ArrayStackException(String message) {
            super(message);
        }
    }

    public GenericStack() {
        // Inisialisasi ArrayList
        itemsList = new ArrayList<T>();
    }

    public void push(T item) {
        itemsList.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new ArrayStackException("Underflow Error");
        }
        // Last-In, First-Out (LIFO)
        int lastIndex = itemsList.size() - 1;
        return itemsList.remove(lastIndex);
    }

    public boolean isEmpty() {
        // Stack kosong jika ukurannya 0
        return (itemsList.size() == 0);
    }

    public static void main(String[] args) {
        // Menguji dengan Integer, seperti aslinya
        GenericStack<Integer> stack = new GenericStack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 

    }
}
