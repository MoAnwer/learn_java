package exersices.chapter_02;

public class ShowCurrentTime {
    public static void main(String[] args) {
        int offset = Integer.parseInt(IO.readln("Enter the time zone offset to GMT: "));
        time(offset);
    }

    public static void time(int offset) {
        
        long totalMilliseconds = System.currentTimeMillis();
        
        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        String minute = currentMinute < 10 ? "0" + currentMinute : "" + currentMinute;
        String second = currentSecond < 10 ? "0" + currentSecond : "" + currentSecond;

        IO.println("current time " + hour((currentHour + offset), false) + ":" +  minute + ":" +  second);
    }

    public static String hour(long n, boolean is24) 
    {
        if (n > 24) {
            throw new IllegalArgumentException("hour must be less than 24");
        }

        if (n < 0) {
            throw new IllegalArgumentException("hour can not be negative");
        }
        
        if (!is24 && n >= 12) {
            n -= 12;
        } 
        
        if (n < 10) return "0" + n;

        return "" + n;
    }
}
