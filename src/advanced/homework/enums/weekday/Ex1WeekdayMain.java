package advanced.homework.enums.weekday;

public class Ex1WeekdayMain {

    public static void main(String[] args) {

        System.out.println("Sunday is holiday: " + Weekday.SUNDAY.isHoliday());
        System.out.println("Monday is weekday: " + Weekday.MONDAY.isWeekDay());

        Weekday.TUESDAY.whichIsGreater(Weekday.FRIDAY);
    }
}
