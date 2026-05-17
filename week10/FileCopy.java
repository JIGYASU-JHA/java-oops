import java.io.*;
import java.util.*;

public class FileCopy {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source file name: ");
        String sourceFile = sc.nextLine();
        System.out.print("Enter the destination file name: ");
        String destinationFile = sc.nextLine();
        copyUsingCharacterStream(sourceFile, destinationFile);
        copyUsingByteStream(sourceFile, destinationFile);
        sc.close();
    }

    public static void copyUsingCharacterStream(String source, String destination) {
        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(destination)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("File copied successfully using Character Stream");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void copyUsingByteStream(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully using Byte Stream");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

