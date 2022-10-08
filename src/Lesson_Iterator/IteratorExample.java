package src.Lesson_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Kamal");
        arrayList1.add("Joker");
        arrayList1.add("Batman");
        arrayList1.add("Bane");
        arrayList1.add("Harley");

        Iterator<String> it = arrayList1.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        System.out.println(arrayList1);


    }
}
