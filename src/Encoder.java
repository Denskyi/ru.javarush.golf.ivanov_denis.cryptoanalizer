import java.io.*;
import java.util.Scanner;

public class Encoder{
    private String unencryptedFile = "/home/denskyi/IdeaProjects/ru.javarush.golf.ivanov_denis.cryptoanalizer/src/unencryptedFile";
    private String encryptedFile = "/home/denskyi/IdeaProjects/ru.javarush.golf.ivanov_denis.cryptoanalizer/src/encryptedFile";
    public Encoder(int offset) {
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
            System.out.println("Exceptions");
        }
    }



}

