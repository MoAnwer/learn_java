package exersices.chapter_10;

public class StackOfIntergers 
{
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntergers()
    {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntergers(int capacity)
    {
        this.size = capacity;
        this.elements = new int[this.size];
    }

    public boolean isEmpty()
    {
        return size > 0;
    }

    public int peek()
    {
        return size < elements.length ? this.elements[size++] : -1;
    }

    public int pop()
    {
        return size < elements.length ? this.elements[size++] : -1;
    }

    public void push(int ele)
    {
        if (isEmpty()) {
            this.elements[--size] = ele;
        }
    }

    public int getSize()
    {
        return this.elements.length;
    }

    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < elements.length; i++) {
            s.append(elements[i]);
            if (elements.length - i != 1) {
                s.append(", ");
            }            
        }
        s.append("]");
        return s.toString();
    }

    public static void main(String[] args) {
        StackOfIntergers s = new StackOfIntergers(4);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        IO.println(s.toString());


    }
}
