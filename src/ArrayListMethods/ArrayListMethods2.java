package src.ArrayListMethods;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Kamal");
        arrayList1.add("Ivan");
        arrayList1.add("Homelander");
        System.out.println(arrayList1.toString());
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("???");
        arrayList2.add("???");
        arrayList2.add("!!!");
        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);

        arrayList1.clear();
        System.out.println(arrayList1);

        int index = arrayList2.indexOf("???");
        System.out.println(index);

        int index2 = arrayList2.lastIndexOf("???");
        System.out.println(index2);

        System.out.println(arrayList2.size());

        System.out.println(arrayList1.isEmpty());

        System.out.println(arrayList2.contains("!!!"));
    }
}
