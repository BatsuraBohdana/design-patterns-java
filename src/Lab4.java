import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class Lab4 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 5, 9, 25, 18, 5, 25, 4);
        List<Double> decimals = List.of(1.5, 3.2, 6.8, 9.1);
        List<String> words = List.of("orange", "Apple", "grape", "Mango", "", "peach");
        String text = "Дефолтний текст для перевірки";

        System.out.println("1. Тільки непарні: " + extractOddValues(integers));

        System.out.println("2. Середнє арифметичне: " + computeMean(decimals));

        System.out.println("3. За алфавітом: " + sortStringsAlphabetically(words));

        System.out.println("4. Сума парних: " + addEvenNumbers(integers));

        System.out.println("5. Факторіал 6: " + getFactorial(6));

        var result = calculateTotalAndProduct(List.of(3, 4, 5));
        System.out.println("6. Підсумок: " + result.totalSum() + ", Добуток: " + result.totalProduct());

        System.out.println("7. Квадрати чисел: " + mapToSquares(integers));

        System.out.println("8. За зростанням довжини: " + sortByStringLength(words));

        System.out.println("9. Слів у реченні: " + getWordCount(text));

        System.out.println("10. Перший рядок з текстом: " + getFirstValidString(words));

        System.out.println("11. Чи всі з великої літери: " + checkAllCapitalized(words));

        System.out.println("12. Друге найбільше: " + getSecondMax(integers));

        System.out.println("13. Максимальне парне: " + getMaxEven(integers));
    }

    public static List<Integer> extractOddValues(List<Integer> list) {
        return list.stream()
                .filter(val -> val % 2 != 0)
                .toList();
    }

    public static double computeMean(List<Double> list) {
        return list.stream()
                .mapToDouble(v -> v)
                .average()
                .orElse(0.0);
    }

    public static List<String> sortStringsAlphabetically(List<String> list) {
        return list.stream()
                .sorted(String::compareToIgnoreCase)
                .toList();
    }

    public static int addEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum);
    }

    public static long getFactorial(int number) {
        return LongStream.rangeClosed(1, number)
                .reduce(1L, (x, y) -> x * y);
    }

    public static CalculationResult calculateTotalAndProduct(List<Integer> list) {
        int sum = list.stream().reduce(0, Integer::sum);
        long prod = list.stream().mapToLong(i -> i).reduce(1L, (a, b) -> a * b);
        return new CalculationResult(sum, prod);
    }

    public record CalculationResult(int totalSum, long totalProduct) {}

    public static List<Integer> mapToSquares(List<Integer> list) {
        return list.stream()
                .map(num -> num * num)
                .toList();
    }

    public static List<String> sortByStringLength(List<String> list) {
        return list.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .toList();
    }

    public static long getWordCount(String str) {
        if (str == null || str.isBlank()) return 0;
        return Arrays.stream(str.trim().split(" +")).count();
    }

    public static String getFirstValidString(List<String> list) {
        return list.stream()
                .filter(str -> str != null && !str.isBlank())
                .findFirst()
                .orElse("Не знайдено");
    }

    public static boolean checkAllCapitalized(List<String> list) {
        return list.stream()
                .filter(item -> item != null && !item.isBlank())
                .allMatch(word -> Character.isUpperCase(word.charAt(0)));
    }

    public static Integer getSecondMax(List<Integer> list) {
        return list.stream()
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    public static Integer getMaxEven(List<Integer> list) {
        return list.stream()
                .filter(val -> val % 2 == 0)
                .reduce(Integer::max)
                .orElse(null);
    }
}