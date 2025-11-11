package malta;

public class N3 {
    public static void main(String[] args) {

        StringOperations processor = new ProcessStrings();
        String testString = "HelloWorld";
        System.out.println("--- Тестируем ProcessStrings ---");
        System.out.println("Исходная строка: \"" + testString + "\"");
        int count = processor.countChars(testString);
        System.out.println("а) Количество символов: " + count);
        String oddChars = processor.getOddChars(testString);
        System.out.println("б) Символы на нечетных позициях (1,3,5...): \"" + oddChars + "\"");
        String inverted = processor.invert(testString);
        System.out.println("в) Инвертированная строка: \"" + inverted + "\"");
    }
}
