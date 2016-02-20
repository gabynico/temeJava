package homework7;

import java.io.*;

public class ReadFileByLine {

    public static void main(String[] args) {
        File file = new File( "src" + File.separator + "homework7" + File.separator + "problem1.txt");

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = null;
        if (fileReader != null) {
            bufferedReader = new BufferedReader(fileReader);
        }

        String info = null;
        try {
            if (bufferedReader != null) {
                info = bufferedReader.readLine();
            }

            while(info != null){

                System.out.println(info);

                info = bufferedReader.readLine();
            }

            if (bufferedReader != null) {
                bufferedReader.close();
            }


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
        String s, s2 = "";
        try {
            if (in != null) {
                while((s = in.readLine())!= null)
                    s2 += s + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(s2);
    }

}//End class
