import java.util.HashMap;
import java.util.Scanner;

public class Runner {//https://github.com/Denskyi/ru.javarush.golf.ivanov_denis.cryptoanalizer.git
    public static void main(String[] args) {
        int offset = reading_number();
        LetterMap map = new LetterMap();
        HashMap<Character, Character> map1 = map.getMap(offset);
        try {

        } catch (Exception e) {
        }

    }

    public static int reading_number() {
        while (true) {
            System.out.println("Введите число от 1 до 31");
            int read;
            try (Scanner scanner = new Scanner(System.in);) {
                read = Integer.parseInt(scanner.nextLine());
                if (read > 0 && read < 32) {break;
                } else {System.out.println("Число вне диапазона");}
            } catch (Exception e) {
                System.out.println("Введено не число");}
        }
        return 1;
    }
}
