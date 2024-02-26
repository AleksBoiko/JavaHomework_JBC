package encapsulation.task_2;

public class User extends DemoUser {
    private String login;
    private String password;
    private String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String oldPassword, String newPassword){
        if (oldPassword.equals(password)){
            if (newPassword.length() >= 8){
                this.password = newPassword;
                return true;
            } else {
                System.out.println("Новый пароль не соответствует требованиям безопасности");
                return false;
            }
        } else {
            System.out.println("Старый пароль неверный");
            return false;
        }
    }
}
