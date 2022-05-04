import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Decoder {
    private String unencryptedFile = "/home/denskyi/IdeaProjects/ru.javarush.golf.ivanov_denis.cryptoanalizer/src/unencryptedFile";
    private String encryptedFile = "/home/denskyi/IdeaProjects/ru.javarush.golf.ivanov_denis.cryptoanalizer/src/encryptedFile";

    public Decoder(int offset) {
        try (FileReader readFile = new FileReader(encryptedFile);
             FileWriter writeFile = new FileWriter(unencryptedFile);) {
            while (readFile.ready()) {//Дешифруется по выбранному параметру offset абсолютно любой символ
                int read = readFile.read() - offset;
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