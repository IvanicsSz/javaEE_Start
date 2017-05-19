package AdvancedJava;

public @interface ExampleAnnotation {
    String name();
    int value() default 0;
}
