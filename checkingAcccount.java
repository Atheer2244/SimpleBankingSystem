
class CheckingAccount extends BankSystem {

    private String CardNo;

    public CheckingAccount(String name, String accountType, double amount) {
        super(name, accountType, amount);

    }

//    
public void withdraw(double amount) {
        double a = getAmount();
        amount = a - amount;
        setAmount(amount);
    }
	
 // retrieve the carde number in the object
    public String getCardNo() {
        return CardNo;

    }
	//set the carde number in the object
    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }
//Get and display the user's bank information and return it as a string
    public String toString() {

        return "Name:" + getName() + "\nID:" + getID() + "\nAccount Type:" + getAccountType() + "\nAmount:" + (int) getAmount() + "\nSerial:" + CardNo;

    }
	
	

}
