package AdvancedJava.Enums;

public enum DaysOfTheWeekFieldsInterfaces implements DayOfWeek{

    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean isWeekDay;

    private DaysOfTheWeekFieldsInterfaces(final boolean isWeekDay){
        this.isWeekDay = isWeekDay;
    }

    @Override
    public boolean isWeekDay(){
        return isWeekDay;
    }


}

