public class Ex {
    private int[] data;

    public Ex(int[] values) {
        this.data = values;
    }

    public void printData() {
        IO.println("Data: " + java.util.Arrays.toString(data));
    }
}