package AdvancedJava.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class ParameterizedTypeExample {
    private List<String> strings;


    public List<String> getStrings() {
        return strings;
    }
    private String name;
    public String getName() {
        return name;
    }

    public void type() throws NoSuchFieldException {

        final Type type = ParameterizedTypeExample.class.getDeclaredField("strings").getGenericType();
            if( type instanceof ParameterizedType) {
                final ParameterizedType parameterizedType = ( ParameterizedType )type;
                for( final Type typeArgument: parameterizedType.getActualTypeArguments() ) {
                    System.out.println( typeArgument );
                }
            }
    }

    public void visability() throws NoSuchFieldException, IllegalAccessException {
        final ParameterizedTypeExample instance = new ParameterizedTypeExample();
        final Field field = ParameterizedTypeExample.class.getDeclaredField( "name" );
        field.setAccessible( true );
        field.set( instance, "sample name" );
        System.out.println( instance.getName() );
    }

    public void parameter() throws NoSuchMethodException {
        final Method method = ParameterizedTypeExample.class
                .getDeclaredMethod( "performAction", String.class, Runnable.class );
        Arrays.stream( method.getParameters() )
                .forEach( p -> System.out.println( p.getName() ) );
    }
}
