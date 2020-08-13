package ch0;

class Bank {

    double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositMoney(double amount) {
        balance += amount;
    }

    public void withDrawMoney(double amount) {
        balance -= amount;
    }

    public String showBalance() {
        return "Current Balance in Account is ::" + balance;
    }
}

class RunBank {

    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.showBalance());

        bank.depositMoney(100.00);
        System.out.println(bank.showBalance());

        bank.withDrawMoney(50.00);
        System.out.println(bank.showBalance());

        bank.depositMoney(100.00);
        System.out.println(bank.showBalance());
    }
}



