package malta;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double base, double exponent) {
        // Используем стандартный метод Math.pow()
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imag) {
        // Реализуем формулу sqrt(a^2 + b^2)
        return Math.sqrt(real * real + imag * imag);
    }

    public double circleCircumference(double radius) {
        return 2 * PI * radius;
    }
}