/*
 * 5. Crie uma função que receba como parâmetro uma lista, com valores de qualquer tipo.
 * A função deve imprimir todos os elementos da lista, enumerando-os.
 */
import java.util.List;

public class EnumerateList {
    public static <T> void printEnumeratedList(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, list.get(i)); }
    }
    
    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "cherry");
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        printEnumeratedList(stringList);
        printEnumeratedList(integerList);
    }
}
