public class Main {
    public static void main(String[] args) {
        // Создание новой книги только с автором и названием
        Book book1 = new Book("А.Н.Васильев", "Программирование на JAVA для начинающих");

        // Создание новой книги со всеми параметрами
        Book book2 = new Book("Кэти Сьерра и Берт Бейтс", "Изучаем Java", 718, 2, "На моих руках");
        Book book3 = new Book("Генри Форд", "Моя жизнь, мой бизнес", 416, 3,"На месте");

        // Редактирование книги
        book1.setCatalogNumber(1);
        book1.setPageCount(702);
        book1.setLocation("У меня дома => в хранилище");

        // Вывод информации о книгах
        book1.printInfo();
        System.out.println("-".repeat(80));
        book2.printInfo();
        System.out.println("-".repeat(80));
        book3.printInfo();
    }
}