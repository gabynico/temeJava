package homework7;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class CopyFileToDest {

    private static final int SIZE = 1024;
    private static final String FILE_NAME_FROM = "simpleFile_from.txt";
    private static final String FILE_NAME_TO = "simpleFile_to.txt";

    public static void main(String[] args) throws Exception{
        String[] args_file = new String[2];
        args_file[0] = "src" + File.separator + "homework7" + File.separator + FILE_NAME_FROM;
        args_file[1] = "src" + File.separator + "homework7" + File.separator + FILE_NAME_TO;

        copy(args_file);

    }

    public static void copy(String[] args) {
        FileChannel in = null;
        FileChannel out = null;
        ByteBuffer buffer = ByteBuffer.allocate(SIZE);
        try {
            in = new FileInputStream(args[0]).getChannel();
            out = new FileOutputStream(args[1]).getChannel();

            while(in.read(buffer) != -1) {
                buffer.flip();
                out.write(buffer);
                buffer.clear();
            }

            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
