import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class Runner {//https://github.com/Denskyi/ru.javarush.golf.ivanov_denis.cryptoanalizer.git
    public static void main(String[] args) {
        int offset = 0;
            System.out.println("Выбор действия:");
            System.out.println("1. Шифровать файл шифром цезаря");
            System.out.println("2. Расшифровать файл после шифра цезаря");
            System.out.println("3. Режим bruteforce");
        switch (reading_number()) {
            case 1 -> {
                System.out.println("Теперь число для шифрования");
                offset = reading_number();
                System.out.println("Шифруем");
                Encoder encoder = new Encoder(offset);
            }
            case 2 -> {
                System.out.println("Теперь число для расшифровки");
                offset = reading_number();
                System.out.println("Расшифруем");
                Decoder decoder = new Decoder(offset);
            }
            case 3 -> {
                System.out.println("Поиск решения ещё не реализован");

            }
        }
    }

    public static int reading_number() {//пытаемся получить число с клавиатуры
        int read = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число");
            String str = scanner.nextLine();
            if (!str.isEmpty()) {
                Pattern pat = Pattern.compile("\\d");//Регулярное выражение \d выдаёт true если находит только числа
                Matcher mat = pat.matcher(str);//Тут проверяем текст на наличие там чисел
                boolean found = mat.matches();//здесь получим true если в полученном тексте были только числа
                if (found) {
                    read = (Integer.parseInt(str) % 99999);//%99999 Должен убрать возможность выйти из диапазона UTF8 более одного раза
                    break;//выход из бесконечного цикла, если число соответствует требованием
                } else {System.out.println("Это не подходит :_(");}
            } else {System.out.println("Это не подходит :_(");}
        }
        return read;
    }
    public static String pathFile() {
        try (Scanner scanner = new Scanner(System.in)) {

        }
        return "";
    }
}
