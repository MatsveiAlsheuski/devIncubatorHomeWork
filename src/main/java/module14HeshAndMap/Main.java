package module14HeshAndMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("Milk", 20);
        myHashMap.put("Bread", 30);
        myHashMap.put("Salad", 5);
        myHashMap.put("Broccoli", 10);
        myHashMap.put("Pears", 20);
        myHashMap.put("Pineapples", 40);
        myHashMap.put("Butter", 15);
        myHashMap.put("Butter", 25);

        int mostFrequent = 0;
        for (MyHashMap.Node node : myHashMap.getTable()) {
            if (!(node == null)) {
                if (mostFrequent < (int) node.value) mostFrequent = (int) node.value;
            }
        }
        for (MyHashMap.Node node : myHashMap.getTable()) {
            if (!(node == null)) {
                if (mostFrequent == (int) node.value) System.out.println(node);
            }
        }


        Set<String> myHashSet = new MyHashSet<>();
        for (MyHashMap.Node node : myHashMap.getTable()) {
            if (!(node == null)) {
                myHashSet.add((String) node.key);
            }
        }
        myHashSet.add("Sweat");
        myHashSet.add("Chocolate");
        myHashSet.add("Cookies");
        myHashSet.add("Marmalade");

        System.out.println(myHashSet.contains("Chocolate"));

        Iterator<String> i = myHashSet.iterator();
        while (i.hasNext())
            System.out.println(i.next());


/*
        for (String i : myHashSet)
            System.out.println(i);*/

    }


}
