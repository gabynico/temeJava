package homework7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordsWithScanner {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("src" + File.separator + "homework7" + File.separator + "wordsWithScanner.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (sc != null) {
            while(sc.hasNext()){
                String s = sc.next();

                StringBuffer buffer = new StringBuffer(s);
                buffer.reverse();

                System.out.println(buffer);
            }
        }
    }
}
