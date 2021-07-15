
class SavingAccount extends BankSystem{
    private String SerialNo;

    public SavingAccount(String name, String accountType, double amount) {
        super(name, accountType, (int)amount);
        
    }

    public String getSerialNo() {
        return SerialNo;

    }

    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    
    public String toString() {
     
        return "Name:" + getName() + "\nID:" + getID() + "\nAccount Type:" + getAccountType() + "\nAmount:" +(int)getAmount() + "\nSerial:" + SerialNo;
    }
	

	
}
