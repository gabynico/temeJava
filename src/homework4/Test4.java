package homework4;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Test4 {

    public static void main(String[] args) {
        try
        {
            Runtime rt = Runtime.getRuntime();

            Process proc1 = rt.exec("javac Test3.java");
            proc1.waitFor();

            String line;

            Process proc2 = rt.exec("java Test3");
            BufferedReader in = new BufferedReader(new InputStreamReader(proc2.getInputStream()));

            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

            BufferedReader err = new BufferedReader(new InputStreamReader(proc2.getErrorStream()));

            while ((line = err.readLine()) != null) {
                System.out.println(line);
            }

            proc2.waitFor();
            System.out.println("run Test3 -> " + " exitValue() = " + proc2.exitValue());


        } catch (Throwable t)
        {
            t.printStackTrace();
        }

    }
}
