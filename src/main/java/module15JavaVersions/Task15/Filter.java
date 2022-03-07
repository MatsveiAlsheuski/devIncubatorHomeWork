package module15JavaVersions.Task15;

@FunctionalInterface
public interface Filter<T> {
    boolean apply(T o);
}
