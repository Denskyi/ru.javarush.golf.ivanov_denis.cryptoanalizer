import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Decoder {
    public Decoder(int offset, String unencryptedFile, String encryptedFile) {
        System.out.println("Расшифруем");
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
            System.out.println(e.getStackTrace());
        }
    }
}