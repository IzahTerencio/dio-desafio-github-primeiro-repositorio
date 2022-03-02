package one.digitalinnovation.model;

public abstract class objTree<T> implements Comparable<T>{

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T other);
    public abstract String toString();

}
