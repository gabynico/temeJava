package homework7;

import java.io.*;
import java.util.Date;

public class BufferedAndUnbuffered {

    public static void main(String[] args) {


        //////////////////////OutputStream
        FileOutputStream unbufFile;
        FileOutputStream bufFile;

        BufferedOutputStream buf;
        ObjectOutputStream unbuf;

        try {
            unbufFile = new FileOutputStream( "src" + File.separator + "homework7" + File.separator + "BufferedAndUnbuffered.unbuf");
            unbuf = new ObjectOutputStream(unbufFile);

            bufFile = new FileOutputStream( "src" + File.separator + "homework7" + File.separator + "BufferedAndUnbuffered.buf");
            buf = new BufferedOutputStream(bufFile);


            System.out.println("OutputStream -Write file unbuffered: " + time(unbuf) + "ms");
            System.out.println("OutputStream - Write file  buffered: " + time(buf) + "ms");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /////////////////////Writer

        BufferedWriter bufW;
        PrintWriter unbufW;

        try {
            FileWriter unbufFileW = new FileWriter("src" + File.separator + "homework7" + File.separator + "BufferedAndUnbufferedWriter.unbuf");
            unbufW = new PrintWriter(unbufFileW);

            FileWriter bufFileW = new FileWriter("src" + File.separator + "homework7" + File.separator + "BufferedAndUnbufferedWriter.unbuf");
            bufW = new BufferedWriter(bufFileW);

            System.out.println("Writer - Write file unbuffered: " + timeW(unbufW) + "ms");
            System.out.println("Writer - Write file  buffered: " + timeW(bufW) + "ms");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    static int time(OutputStream os) throws IOException {
        Date then = new Date();
        for (int i = 0; i < 500000; i++) {
            os.write(i);
        }
        os.close();
        return (int) ((new Date()).getTime() - then.getTime());
    }


    static int timeW(Writer os) throws IOException {
        Date then = new Date();
        for (int i = 0; i < 500000; i++) {
            os.write(i);
        }
        os.close();
        return (int) ((new Date()).getTime() - then.getTime());
    }
}
