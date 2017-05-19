package AdvancedJava.Generic;

import com.sun.istack.internal.NotNull;
import service.sorting.Sort;
import service.sorting.SortType;

import javax.inject.Named;
import javax.xml.ws.Action;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;

public class GenericMethods< T > {


    public< R > R performAction( final T action ) {
        final R result = null;
// Implementation here
        return result;
    }
    public< U, R > R performAnotherAction( final U action ) {
        final R result = null;
// Implementation here
        return result;
    }
    public< J > GenericMethods( final T initialAction, final J nextAction ) {
// Implementation here
    }
    public< T > void performAction( final T action, final Class< T > clazz ) {
// Some implementation here
    }

}
