package homework7;

import java.io.*;

public class AccountTest {

    public static void main(String[] args) {
        // Create objects
        Account a1 = new Account("1", "pws1");
        Account a2 = new Account("2", "pws2");
        Account a3 = new Account("3", "pws3");
        Account a4 = new Account("4", "pws4");

        // The output file
        File fileObjectOut = new File( "src" + File.separator + "homework7" + File.separator + "account_test_serializable.txt");
        FileOutputStream fileOutputStream = null;
        try {

            fileOutputStream = new FileOutputStream(fileObjectOut);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(a1);
            objectOutputStream.writeObject(a2);
            objectOutputStream.writeObject(a3);
            objectOutputStream.writeObject(a4);

            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // The input file
        File fileObjectIn = new File("src" + File.separator + "homework7" + File.separator + "account_test_serializable.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileObjectIn);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Read (or deserialize) the objects
            Account a5 = (Account) objectInputStream.readObject();
            Account a6 = (Account) objectInputStream.readObject();
            Account a7 = (Account) objectInputStream.readObject();
            Account a8 = (Account) objectInputStream.readObject();

            fileInputStream.close();

            // Let's display the objects that are read
            System.out.println(a5);
            System.out.println(a6);
            System.out.println(a7);
            System.out.println(a8);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
