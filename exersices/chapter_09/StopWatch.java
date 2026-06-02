package exersices.chapter_09;

import java.util.Date;

public class StopWatch 
{
    private double startTime;    
    private double endTime;

    public StopWatch() {
        this.startTime = (double) (new Date()).getTime();
    }

    public double getStartTime()
    {
        return this.startTime;
    }

    public double getEndTime()
    {
        return this.endTime;
    }

    public double start()
    {
        this.startTime = (double) (new Date()).getTime();
        return this.startTime;
    }

    public double end()
    {
        this.endTime = (double) (new Date()).getTime();
        return this.endTime;
    }

    public double getElapsedTime()
    {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch s = new StopWatch();

        char heart = '\u2764';
        String.valueOf(heart);

        s.start();
        int[][] arr = new int[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = i; j < 100; j++) {
                arr[i][j] = j;
            }
        }
        s.end();
        IO.println(s.getElapsedTime());
    }
}
