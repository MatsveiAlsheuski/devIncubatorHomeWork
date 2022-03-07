package module14HeshAndMap;

import java.util.*;

public class MyHashSet<K> implements Set<K> {

    private HashMap<K, Object> map;
    private static final Object PRESENT = new Object();

    @Override
    public Iterator<K> iterator() {
        return map.keySet().iterator();
    }

    public MyHashSet() {
        map = new HashMap<>();
    }

    @Override
    public boolean add(K e) {
        return map.put(e, PRESENT) == null;
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    @Override
    public int size() {
        return map.size();
    }

    /**
     * Методы по умолчанию
     */

    @Override
    public boolean isEmpty() {
        return false;
    }


    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends K> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
