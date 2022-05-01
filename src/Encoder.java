import java.io.*;

public class Encoder{
    private String unencryptedFile = "/home/denskyi/IdeaProjects/ru.javarush.golf.ivanov_denis.cryptoanalizer/src/unencryptedFile";
    private String encryptedFile = "/home/denskyi/IdeaProjects/ru.javarush.golf.ivanov_denis.cryptoanalizer/src/encryptedFile";
    public Encoder() throws FileNotFoundException {
        try (FileInputStream readFile = new FileInputStream(unencryptedFile);
             FileOutputStream writeFile = new FileOutputStream(encryptedFile);){

        } catch (IOException e) {
            System.out.println("Exceptions");
        }
    }



}

