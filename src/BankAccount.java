public class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
            System.out.println("Депозит на " + sum + " успешно выполнен.");
        } else {
            System.out.println("Неверная сумма для депозита.");
        }
    }

    public void withdraw(int sum) throws LimitException {
        if (sum > 0) {
            if (sum <= amount) {
                amount -= sum;
                System.out.println("Снятие " + sum + " успешно выполнено.");
            } else {
                System.out.println("Недостаточно средств на счете.");
                throw new LimitException("Недостаточно средств на счете",0);
            }
        } else {
            System.out.println("Неверная сумма для снятия.");
        }
    }


}
