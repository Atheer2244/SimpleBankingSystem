
class CheckingAccount extends BankSystem {

    private String CardNo;

    public CheckingAccount(String name, String accountType, double amount) {
        super(name, accountType, amount);

    }

    public void withdraw(double amount) {
        double a = getAmount();
        amount = a - amount;
        setAmount(amount);
    }

    public String getCardNo() {
        return CardNo;

    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    public String toString() {

        return "Name:" + getName() + "\nID:" + getID() + "\nAccount Type:" + getAccountType() + "\nAmount:" + (int) getAmount() + "\nSerial:" + CardNo;

    }
	
	

}
