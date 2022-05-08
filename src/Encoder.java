import java.io.*;
import java.util.Scanner;

public class Encoder{
    public Encoder(int offset, String unencryptedFile, String encryptedFile) {
        System.out.println("Шифруем");
        try (FileReader readFile = new FileReader(unencryptedFile);
             FileWriter writeFile = new FileWriter(encryptedFile);) {
            while (readFile.ready()) {//шифруется абсолютно любой символ
                int read = readFile.read() + offset;
                if (read > 99999) {
                    read -= 99999;
                } else if (read < 0) {
                    read += 99999;
                } else {
                    writeFile.write((char) read);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }



}

