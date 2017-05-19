package AdvancedJava.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    public void example() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //create new instance
        final Constructor< String > constructor = String.class.getConstructor( String.class );
        final String str = constructor.newInstance( "sample string" );
        final Method method2 = String.class.getMethod( "length" );
        final int length = ( int )method2.invoke( str );


        final Method[] methods = String.class.getMethods();
        final Field[] fields = String.class.getFields();
        for( final Method method: methods ) {
            System.out.println( method.getName() );
        }
        for( final Field field: fields ) {
            System.out.println( field.getName() );
        }
    }
}
