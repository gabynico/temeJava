package homework7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by ns on 2/13/2016.
 */
public class FileChannelSimple {

    private static final int SIZE = 1024;
    private static final String FILE_NAME = "simpleFile.txt";

    public static void main(String[] args) throws Exception {
        FileChannel fc = new FileOutputStream(FILE_NAME).getChannel();
        ByteBuffer buff = ByteBuffer.allocate(SIZE);
        buff.asCharBuffer().put("Content of a simple file. Persnliche Informationen.");
        fc.write(buff);
        fc.close();

        fc = new FileInputStream(FILE_NAME).getChannel();
        //ByteBuffer buff = ByteBuffer.allocate(SIZE);
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
        fc.close();


    }
}
