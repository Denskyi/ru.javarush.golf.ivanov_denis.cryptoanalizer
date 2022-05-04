import java.util.HashMap;
import java.util.Scanner;

public class Runner {//https://github.com/Denskyi/ru.javarush.golf.ivanov_denis.cryptoanalizer.git
    public static void main(String[] args) {
        /*Запасной не кодированный текст
Мы созданы нашими генами.
Мы, животные, существуем, чтобы сохранить их, и служим лишь машинами, обеспечивающими их выживание.
Мир эгоистичного гена — это мир жестокой конкуренции, безжалостной эксплуатации и обмана.
Ну а как же акты альтруизма, наблюдаемые в природе: пчелы, совершающие самоубийство, когда они жалят врага, чтобы защитить улей, или птицы, рискующие жизнью, чтобы предупредить стаю о приближении ястреба?
Противоречит ли это фундаментальному закону об эгоистичности гена?
Ни в коем случае! Докинз показывает, что эгоистичный ген — это еще и хитрый ген.
И он лелеет надежду, что вид Homo sapiens — единственный на всем земном шаре — в силах взбунтоваться против намерений эгоистичного гена.
Перевод сверен по юбилейному английскому изданию 2006 года.
         */
        System.out.println("Введите число от 0 до 99999");
        int offset = reading_number();
        Encoder encoder = new Encoder(offset);
        Decoder decoder = new Decoder(offset);
        LetterMap map = new LetterMap();
        HashMap<Character, Character> map1 = map.getMap(offset);

    }

    public static int reading_number() {
        int read;
        while (true) {
            try (Scanner scanner = new Scanner(System.in);) {
                read = (Integer.parseInt(scanner.nextLine()) % 99999);//%99999 Должен убрать возможность выйти из диапазона UTF8 более одного раза
                break;
            } catch (Exception e) {
                System.out.println("Введено не число");}
        }
        return read;
    }
}
