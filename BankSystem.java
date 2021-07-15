
public class BankSystem {
	private final String AccountType;
    private final String Name;
    private double Amount;
    private long ID = 3000;

    public BankSystem(String name, String accountType, double amount) {
        this.Name = name;
        this.AccountType = accountType;
        this.Amount = amount;

    }

    public void deposit(double amount) {
        this.Amount = this.Amount + amount;

    }

    public String getName() {

        return Name;

    }

    public String getAccountType() {

        return AccountType;

    }

    public double getAmount() {

        return Amount;

    }

    public long getID() {

        return ID;

    }

    public void setID(long id) {

        this.ID = id;

    }

    public void setAmount(double amount) {

        this.Amount = amount;
    }

   
    public String toString() {

        return "Name:" + Name + "\nID:" + ID + "\nAccount Type:" + Amount + "\nAmount:" + AccountType + "\nSerial:";
    }

	
}
