package src.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList arrayList1=new ArrayList();
        arrayList1.add("Kamal");
        arrayList1.add("Brad Pitt");
        arrayList1.add(8);
        arrayList1.add(new Car());
        System.out.println(arrayList1);

        ArrayList<String> arrayList2=new ArrayList<>(200);
        arrayList2.add("Kamal");
        arrayList2.add("Brad Pitt");
        List<String> arraylist3=new ArrayList<>();

        ArrayList<String> arraylist5=new ArrayList<>(arrayList1);
        System.out.println(arraylist5);
    }
}
class Car{

}