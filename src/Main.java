public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);
        account.deposit(20000);

        System.out.println("Текущий баланс на счете: " + account.getAmount());
        while (true) {
            try {
                account.withdraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        System.out.println("Текущий баланс на счете: " + account.getAmount());
    }
}
