package malta;

public class N2 {
    public static void main(String[] args) {

        MathCalculable mc1 = new MathFunc();
        System.out.println("--- Тестируем методы из интерфейса ---");

        double powerTest = mc1.power(2, 10); // 2 в 10-й степени
        System.out.println("2^10 = " + powerTest);
        double modulusTest = mc1.complexModulus(3, 4);
        System.out.println("Модуль (3 + 4i) = " + modulusTest);

        MathFunc mcFunc = new MathFunc();

        double radius = 10;
        double circumference = mcFunc.circleCircumference(radius);
        System.out.println("Длина окружности (r=10) = " + circumference);
        System.out.println("(Использовано PI = " + mcFunc.PI + ")"); // PI доступен
    }
}