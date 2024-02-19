package task_5;

// Создаём класс PenDemo.
public class PenDemo {
    public static void main(String[] args) {

        // Создаём объекты (ссылочные) типа Pen.
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();

        // Создаём массив из 3х элементов.
        Pen[] pens = new Pen[3];

        // Сохраняем объекты (ссылочные) в массиве.
        pens[0] = pen1;
        pens[1] = pen2;
        pens[2] = pen3;

        // Задаем каждому объекту свой цвет.
        pens[0].setColor("Green");
        pens[1].setColor("Red");
        pens[2].setColor("Black");

        // Проходим по массиву циклом for для того, чтобы его распечатать.
        for (int i = 0; i < pens.length; i++) {
            // Печатаем массив.
            System.out.println("Pen " + (i + 1) + " color is: " + pens[i].getColor());
        }
    }
}
