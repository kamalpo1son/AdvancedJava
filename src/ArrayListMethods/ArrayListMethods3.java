package src.ArrayListMethods;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {
//        StringBuilder sb1 = new StringBuilder("A");
//        StringBuilder sb2 = new StringBuilder("B");
//        StringBuilder sb3 = new StringBuilder("C");
//        StringBuilder sb4 = new StringBuilder("D");
//        StringBuilder[] array = {sb1, sb2, sb3, sb4};
//        List<StringBuilder> list = Arrays.asList(array);
//        System.out.println(list);
//        array[0] = new StringBuilder("F");
//        array[0].append("!!!");
//        System.out.println(list);
//
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Kamal");
        arrayList1.add("Joker");
        arrayList1.add("po1son");

        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);

//        System.out.println(arrayList1);
//        List<String> subList = arrayList1.subList(0, 2);
//        System.out.println(subList);
//        subList.add("Fedor");
//        System.out.println(subList);
//        System.out.println(arrayList1);

//        arrayList1.add("Vika");
//        System.out.println(arrayList1);
//
//        System.out.println(subList);
//
//        Object[] arrayo = arrayList1.toArray();
//        String[] arrays = arrayList1.toArray(new String[0]);
//
//        for (String s : arrays) {
//            System.out.println(s);
//        }
//        System.out.println(arrayList1);
//
//      arrayList1.removeAll(arrayList2);
//
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1.containsAll(arrayList2));
//
//        System.out.println(arrayList1);


    }
}
