package encapsulation.task_1;
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Сумма " + amount + " успешно внесена ");
        } else {
            System.out.println("Недопустимая сумма для депозита ");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Сумма успешно списана с вашего счёта");
        } else {
            System.out.println("У Вас недостаточно средств для снятия");
        }
    }
}
