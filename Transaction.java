
public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * contructor.
     * 
     * @param operation : loai giao dich
     * @param amount    : tien giao dich
     * @param balance   : so du
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    public void setOperation(String o) {
        this.operation = o;
    }

    public String getOperation() {
        return this.operation;
    }

    public void setAmount(double a) {
        this.amount = a;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setBalance(double b) {
        this.balance = b;
    }

    public double getBalance() {
        return this.balance;
    }

}