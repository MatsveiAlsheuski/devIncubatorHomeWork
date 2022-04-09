package module21Cuncurrency;

import java.util.Objects;

public class MySingleton {
    private int a;
    private int b;
    private int c;

    private /*volatile*/ static MySingleton instance;

    private MySingleton() {
        this.a = 1;
        this.b = 2;
        this.c = 3;
    }

    public static MySingleton instance() {
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MySingleton that = (MySingleton) o;
        return a == that.a &&
                b == that.b &&
                c == that.c;
    }

   /* @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }*/

    @Override
    public String toString() {
        return "MySingleton{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}' + instance.hashCode();
    }
}

