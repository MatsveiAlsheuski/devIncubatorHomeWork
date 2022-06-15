package module13ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> warriors = new MyArrayList<>();
        int n = 41;                                      // сколько войнов
        int everyDie =2;                                //через сколько умирает
        for (int i = 1; i <= n; i++) {
            warriors.add(i);
        }
        System.out.println(warriors.size());
        int i = 0, j = 0;
        while (n > 1) {
            j = (++j) % everyDie;
            if (j == 0) {
                n--;
                warriors.remove(i);
            } else {
                i = (++i) % n;
            }
        }
        System.out.println(warriors.get(0));
    }


}
