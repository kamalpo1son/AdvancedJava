package src.Lesson13_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Mustafayev Kamal");
        map1.put(3568, "Zeynalov Ayxan");
        map1.put(6578, "Mammedov Samir");
        map1.put(15879, "Mammedova Samira");
        map1.putIfAbsent(1000, "Binnetov Raul");
        System.out.println(map1);
        System.out.println(map1.get(1000));
        map1.remove(3568);
        System.out.println(map1);
        System.out.println(map1.containsKey(6578));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

    }
}
