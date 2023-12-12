package hw10;

public enum Weekday {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    static boolean isWeekDay(Weekday weekday) {
        return true;
    }

    static boolean isHoliday(Weekday weekday) {
        if (isWeekDay(weekday)) {
            return false;
        }
        return true;
    }
}
