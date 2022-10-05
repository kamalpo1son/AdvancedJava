package src.ArrayListMethods;

import java.util.ArrayList;

public class ArrListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrList =new ArrayList<>();
        arrList.add("Kamal");
        arrList.add("Batman");
        arrList.add("Joker");
        arrList.add(2,"Bane");
        for(String s:arrList){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(arrList.get(2));

        arrList.set(3,"Sausage");
        System.out.println(arrList);

        arrList.remove("Sausage");
        System.out.println(arrList);
    }
}
