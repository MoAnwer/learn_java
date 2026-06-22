package enums;

enum Season {
    WINTER,
//  WINTER, // Compile Time Error : Duplicate Constants
    SPRING,
    SUMMER,
    FALL
}

enum Time {
    morning, night
}

public class Day {
    private Season season;
    private Time time;

    public String getSeason() {
        return season.name();
    }

    public void setTime(String time) {
        this.time = Time.valueOf(time);
    }

    public String getTime() {
        return time.toString();
    }

    public void setSeason(String season) {
        this.season = Season.valueOf(season);
    }

    public static void main(String[] args) {
        Day day = new Day();
        day.setSeason("WINTER");
        IO.println(day.getSeason());
        day.setTime("morning");
        IO.println(day.getTime());
    }
}
