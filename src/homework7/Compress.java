package homework7;

import java.io.*;
import java.util.zip.DeflaterOutputStream;

public class Compress {

    public static void main(String[] args){
        try {
            String fileNameIn = "src" + File.separator + "homework7" + File.separator + "in.txt";
            String fileNameOut = "src" + File.separator + "homework7" + File.separator + "out.txt";

            FileInputStream fin = new FileInputStream(fileNameIn);
            FileOutputStream fout = new FileOutputStream(fileNameOut);

            DeflaterOutputStream out = new DeflaterOutputStream(fout);

            int i;
            while((i=fin.read())!=-1){
                out.write((byte)i);
                out.flush();
            }


            float ratio = getFileSizeInMB(fileNameIn)/ getFileSizeInMB(fileNameOut);

            System.out.println("Ratio:" + ratio);

            fin.close();
            fout.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static float getFileSizeInMB(String fileName) {
        float ret = fileName.length();
        ret = ret / (float) (1024 * 1024);
        return ret;
    }
}
