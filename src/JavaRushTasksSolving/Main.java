package src.JavaRushTasksSolving;

import java.io.*;
import java.nio.file.Path;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        String str = "Java";
        File file = new File("C:/Users/user/Desktop/Test2.txt/");
        try {
            fileWriter = new FileWriter(file, false);
            fileWriter.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        FileInputStream fis = null;
//        InputStreamReader isr = null;
//        int b = 0;
//        try {
//            fis = new FileInputStream("C:/Users/user/Desktop/Test.txt/");
//            isr = new InputStreamReader(fis, "UTF-8");
//            while ((b = isr.read()) != -1) {
//                System.out.println((char) b);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally{
//            try {
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                isr.close();
//            }
//            catch (IOException e){
//                e.printStackTrace();
//            }
//    }
    }
}
