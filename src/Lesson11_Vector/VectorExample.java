package src.Lesson11_Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector1 = new Vector<>();
        vector1.add("Kamal");
        vector1.add("Oleg");
        vector1.add("Katya");
        vector1.add("Misha");
        System.out.println(vector1);
        System.out.println(vector1.firstElement());
        System.out.println(vector1.lastElement());
        vector1.remove("Kamal");
        System.out.println(vector1);
        System.out.println(vector1.get(2));
    }
}
