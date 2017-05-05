package test;

import javax.enterprise.inject.Default;

public interface Hello<T extends Comparable<T>> {

    T hello();
}
