package encapsulation.task_2;

public class DemoUser {
    public static void main(String[] args) {
        User user = new User("john_doe", "password123", "john.doe@example.com");

        // Пример смены пароля
        System.out.println("Смена пароля:");
        System.out.println("Старый пароль: " + user.getPassword());
        if (user.setPassword("password123", "newPassword")) {
            System.out.println("Новый пароль: " + user.getPassword());
        }

        // Пример доступа к логину и email
        System.out.println("Логин: " + user.getLogin());
        System.out.println("Email: " + user.getEmail());
    }
}
