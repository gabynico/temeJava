package homework7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ns on 2/13/2016.
 */
//[ZP] scanner is not part of nio. see package java.nio
//[ZP] the result should be I og emoh. not I og .emoh
//[ZP] 0
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
