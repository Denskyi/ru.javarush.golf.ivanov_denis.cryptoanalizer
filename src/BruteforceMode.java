import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BruteforceMode {
    private String unencryptedFile = "/home/denskyi/IdeaProjects/ru.javarush.golf.ivanov_denis.cryptoanalizer/src/unencryptedFile";
    private String encryptedFile = "/home/denskyi/IdeaProjects/ru.javarush.golf.ivanov_denis.cryptoanalizer/src/encryptedFile";
    private int offset;//результирующий сдвиг

    public int BruteforceMode() {
        this.offset = 0;
        try (FileReader readFile = new FileReader(encryptedFile)) {
            int previousСharacter = 0;//код предыдущего символа
            int intendedShift = 0; //предполагаемый сдвиг
            int currentShift = 0; //текущий сдвиг
            int numberMatches = 0; //число совпадений
            while (readFile.ready()) {//Дешифруется по выбранному параметру offset абсолютно любой символ
                int read = readFile.read();
                if (numberMatches > 3) {
                    offset = intendedShift;
                    System.out.println(offset);
                    break;
                } else {
                    currentShift = read - 32;//вычисляем разницу с позицией пробела
                    if ((previousСharacter - currentShift) == 44) {//если предыдущий символ получив разницу сдвига становиться запятой, то скорее всего это и есть искомое значние
                        numberMatches++;
                        intendedShift = currentShift;
                    }
                }
                previousСharacter = read;//записываем код позиции предыдущего символа
            }
        } catch (IOException e) {
            System.out.println("Exceptions");
        }
        return offset;
    }

}
