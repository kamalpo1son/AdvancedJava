package src.JavaRushTasksSolving;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
Лонг дринк
*/

public class Solution2 {

    public static void main(String[] args) {
        Map<String, Integer> screwdriverIngredients = makeScrewdriver();
        String screwdriver = screwdriverIngredients.keySet().stream()
                .map(key -> key + "=" + screwdriverIngredients.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(screwdriver);
    }

    static Map<String, Integer> makeScrewdriver() {
        Map<String, Integer> ingredients = new TreeMap<>();
        addIce(ingredients);
        addVodka(ingredients);
        addJuice(ingredients);
        addOrange(ingredients);
        return ingredients;
    }

    static void addIce(Map<String, Integer> ingredients) {
        StackTraceElement[] e1 = Thread.currentThread().getStackTrace();
        try {
            ingredients.put("ice cubes", 7);
        } catch (Exception e) {
            printBugMethodName(e1);
        }

    }

    static void addVodka(Map<String, Integer> ingredients) {
        StackTraceElement[] e1 = Thread.currentThread().getStackTrace();
        try {
            ingredients.put("vodka", 50);
        } catch (Exception e) {
            printBugMethodName(e1);
        }
    }

    static void addJuice(Map<String, Integer> ingredients) {
        StackTraceElement[] e1 = Thread.currentThread().getStackTrace();
        try {
            ingredients.put(null, 100);
        } catch (Exception e) {
            printBugMethodName(e1);
        }
    }

    static void addOrange(Map<String, Integer> ingredients) {
        StackTraceElement[] e1 = Thread.currentThread().getStackTrace();
        try {
            ingredients.put("orange slice", 1);
        } catch (Exception e) {
            printBugMethodName(e1);
        }
    }

    public static void printBugMethodName(StackTraceElement[] stackTraceElements) {
        StackTraceElement stackTraceElement = stackTraceElements[1];
        System.out.println(stackTraceElement.getMethodName());
    }
}
