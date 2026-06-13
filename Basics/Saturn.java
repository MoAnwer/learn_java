
/**
 * Static code blocks are used to initialise static variables. These blocks are
 * executed immediately after declaration of static variables.
 */
public class Saturn {
    public static final int MOON_COUNT;

    static {
        MOON_COUNT = 62;
    }

    public static class Inner {
        public Inner() {
            System.out.println("Inner class constructor");
        }
    }

    public static void main(String[] args) {
        IO.println(Saturn.MOON_COUNT);
        Saturn.Inner inner = new Saturn.Inner();
    }
}
