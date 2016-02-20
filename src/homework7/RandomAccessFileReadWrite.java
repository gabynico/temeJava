package homework7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileReadWrite {

    public static void main(String[] args){
        String fileName = "src" + File.separator + "homework7" + File.separator + "randomaccessfile.txt";
        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");

            initialWrite(raf);

            readSomethingFromFile(raf);

            raf.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void readSomethingFromFile(RandomAccessFile raf) {
        try {
            // Move the file pointer to the beginning of the file
            raf.seek(0);

            int i = 0;
            int n ;
            while (raf.getFilePointer() < raf.length() ) {
                n = raf.readInt();
                if (i > 1) {
                    System.out.println(n);
                }
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialWrite(RandomAccessFile raf) {
        int numbers[] = new int[4];
        numbers[0] = 555;
        numbers[1] = 1234;
        numbers[2] = 9;
        numbers[3] = 67;

        try {

            raf.seek(0);
            for(int i =0; i<4; i++) {
                raf.writeInt(numbers[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
