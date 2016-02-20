package homework7;

import java.io.*;

/**
 * Created by ns on 2/10/2016.
 */
//[ZP] 1 - 10
public class ReadFileByLine {

    public static void main(String[] args) {
        File file = new File( "src" + File.separator + "homework7" + File.separator + "problem1.txt");

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String info = null;
        try {
            info = bufferedReader.readLine();

            while(info != null){

                System.out.println(info);

                info = bufferedReader.readLine();
            }

            bufferedReader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        //exercise 5
        BufferedReader in =
                null;
        try {
            in = new BufferedReader(
                    new FileReader("src" + File.separator + "homework7" + File.separator + "problem1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s, s2 = new String();
        try {
            while((s = in.readLine())!= null)
                s2 += s + "\n";
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(s2);
    }

}//End class
