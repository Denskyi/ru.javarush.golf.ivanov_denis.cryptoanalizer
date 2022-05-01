import java.util.HashMap;

public class LetterMap {//Унивирсальный метод, может вернуть карту ключ - значение для шифровки / дишифровки
    private HashMap<Character, Character> map = new HashMap<>();
    public HashMap<Character, Character> getMap(int offset) {//offset определяет выбранное смещение для шифрования
        for (int i = 0; i < 32; i++) {
            if (1072 + offset + i < 1104) {
                int a = 1072 + i;
                int b = 1072 + i + offset;
                map.put((char) a, (char) b);
            } else {
                int a = 1072 + i;
                int b = 1072 + i + offset - 32;
                map.put((char) a, (char) b);
            }
        }
        map.put((char)1105,map.get((char)1077));//Бува ё, сидит в таблице UTF-8 отдельно, забирает значение от е
        return map;
    }
}
