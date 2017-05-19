package AdvancedJava.Enums;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class DaysOfTheWeek{

    public< T extends Enum < ? > > void performAction( final T instance ) {
// Perform some action here
    }
    final Set< DaysOfTheWeekFieldsInterfaces > enumSetAll = EnumSet.allOf(DaysOfTheWeekFieldsInterfaces.class);
    final Set< DaysOfTheWeekFieldsInterfaces > enumSetSome = EnumSet.of(
            DaysOfTheWeekFieldsInterfaces.SUNDAY,
            DaysOfTheWeekFieldsInterfaces.SATURDAY
    );

    final Map< DaysOfTheWeekFieldsInterfaces, String > enumMap = new EnumMap<>( DaysOfTheWeekFieldsInterfaces.class );
//        enumMap.put( DaysOfTheWeekFieldsInterfaces.MONDAY, "Lundi" );
//        enumMap.put( DaysOfTheWeekFieldsInterfaces.TUESDAY, "Mardi" );
// Other declarations here
}