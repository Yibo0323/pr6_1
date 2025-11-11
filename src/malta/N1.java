package malta;

public class N1 {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(0, 10, 10, 0, 2, 2);

        System.out.println("--- Начальное состояние ---");
        System.out.println(rect); // Вызов rect.toString()

        System.out.println("Тест скорости (должен быть true): " + rect.speedTest());
        System.out.println("\n... Двигаем вправо и вниз ...");
        rect.moveRight();
        rect.moveDown();

        System.out.println("--- Конечное состояние ---");
        System.out.println(rect);
    }
}
