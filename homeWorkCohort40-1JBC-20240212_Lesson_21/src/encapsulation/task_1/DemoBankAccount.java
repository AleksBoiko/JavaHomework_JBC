package encapsulation.task_1;

public class DemoBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1_000_000);
        System.out.println("Ваш текущий баланс: = " + account.getBalance());

        account.deposit(5_000.85);
        System.out.println("Ваш текущий баланс после внесения денежных средств: = " + account.getBalance());

        account.withdraw(28_800.65);
        System.out.println("Ваш текущий баланс после снятия денежных средств: = " + account.getBalance());
    }
}
