import java.util.ArrayList;
	import java.util.Scanner;
public class TestBankSystem {
    static long IDCounter;
	public static void main(String[] args) {
	        //1
	        //creating a saving account for "Ahmad" with 10,000$ and print account info
	        SavingAccount SavingObject1 = new SavingAccount("Ahmad", "saving", 10000);
	        SavingObject1.setSerialNo("43");
	        IDCounter = SavingObject1.getID();
	        System.out.println(SavingObject1.toString());
	        System.out.println();

	        //2
	        //deposit 50000 to ahmad account.and print account info
	        int deposit = 50000;
	        String depositing = "Account Information after depositing: ";
	        System.out.println(depositing + deposit);
	        SavingObject1.deposit(deposit);
	        System.out.println(SavingObject1.toString());
	        System.out.println();

	        //3
	        //creating a checking account for "Ali" with 20,000$
	        CheckingAccount CheckingObject1 = new CheckingAccount("Ali", "checking", 20000);
	        CheckingObject1.setCardNo("0021");
	        IDCounter++;
	        CheckingObject1.setID(IDCounter);
	        CheckingObject1.getID();
	        //4 
	        //creating a checking account for "Mona" with 15,000$
	        CheckingAccount CheckingObject2 = new CheckingAccount("Mona", "checking", 15000);
	        CheckingObject2.setCardNo("0033");
	        IDCounter++;
	        CheckingObject2.setID(IDCounter);
	        CheckingObject2.getID();
	        //5
	        //printing the information of the checking account of Ali
	        System.out.println(CheckingObject1.toString());
	        System.out.println();

	        //6
	        //Deposite 70000 to Ali account and print account information
	        deposit = 70000;
	        System.out.println(depositing + deposit);
	        CheckingObject1.deposit(deposit);
	        System.out.println(CheckingObject1.toString());
	        System.out.println();

	        //7
	        //withdraw(3000) from Ali account and print account information
	        int withdraw = 3000;
	        String withdrawal = "Account Information after withdrawal: ";
	        System.out.println(withdrawal + withdraw);
	        CheckingObject1.withdraw(withdraw);
	        System.out.println(CheckingObject1.toString());
	        System.out.println();

	        //8
	        //printing the information of the saving account
	        System.out.println(SavingObject1.toString());
	        System.out.println();

	        //9
	        //Create an ArrayList of Account
	        ArrayList<BankSystem> BankSystem = new ArrayList<>();

	        //10
	        //Add the accounts of Ahmad, Ali and Mona to the ArrayList
	        BankSystem.add(SavingObject1);
	        BankSystem.add(CheckingObject1);
	        BankSystem.add(CheckingObject2);

	        //11
	        //Add a new SavingsAccount object for "Lama" with an amount of 1500$ and serialNo 64 to the ArrayList
	        SavingAccount SavingObject2 = new SavingAccount("Lama", "saving", 1500);
	        SavingObject2.setSerialNo("64");
	        IDCounter++;
	        SavingObject2.setID(IDCounter);
	        SavingObject2.getID();
	        BankSystem.add(SavingObject2);

	        //12
	        //Add a new SavingsAccount object for “Amani” with an amount of 1500$ and serialNo 55 to the ArrayList
	        SavingAccount SavingObject3 = new SavingAccount("Amani", "saving", 1500);
	        SavingObject3.setSerialNo("55");
	        IDCounter++;
	        SavingObject3.setID(IDCounter);
	        SavingObject3.getID();
	        BankSystem.add(SavingObject3);

	        //13
	        //Print all objects in the ArrayList using the "print" method
	        Print(BankSystem);

	        //14
	        //Withdraw 100$ from all checking accounts.
	        withdraw = 1000;
	        System.out.println(withdrawal + withdraw);
	        CheckingObject1.withdraw(withdraw);
	        System.out.println(CheckingObject1.toString());
	        System.out.println();

	        System.out.println(withdrawal + withdraw);
	        CheckingObject2.withdraw(withdraw);
	        System.out.println(CheckingObject2.toString());
	        System.out.println();

	        //15
	        //check the availability of clients by its ID and aske the user if he want check about the availability
	        ID(BankSystem);

	        //16
	        // make report about the clients depending on their account type (Make menu for the user as in the sample output)
	        AccountType(BankSystem);
	    }

	    //13
       public static void Print(ArrayList<BankSystem> BankSystem) {
	        for (int i = 0; i < BankSystem.size(); i++) {
	            System.out.println(BankSystem.get(i));
	            System.out.println();
	        }
	    }

	    //15
	    public static void ID(ArrayList<BankSystem> BankSystem) {

	        Scanner input = new Scanner(System.in);
	        String output = "do you want to check the availability of client ID? (y\\n)";
	        String output1 = "enter ID to check about availability:";
	        String output2 = "this ID is found and its information as follow";
	        String output3 = "Invalid Choice!! Please Try Again";
	        System.out.println(output);
	        long IDInput;
	        long IDInArray;
	        String Choose;
	        do {
	            Choose = input.next();

	            if (Choose.equalsIgnoreCase("Y")) {
	                System.out.println(output1);
	                IDInput = input.nextLong();
	                for (int i = 0; i < BankSystem.size(); i++) {
	                    IDInArray = BankSystem.get(i).getID();
	                    if (IDInArray == IDInput) {
	                        System.out.println(output2);
	                        System.out.println(BankSystem.get(i).toString());
	                        break;
	                    }

	                }
	                break;
	            } 
	        } while (!Choose.equalsIgnoreCase("N"));
	    }

	    //16
	    public static void AccountType(ArrayList<BankSystem> BankSystem) {

	        Scanner input = new Scanner(System.in);
	        int Number;
	        String output = "do you want to make report about the clinets?(y\\n)";
	        String output1 = "Which clints do you want to print\n" + "1- saving account clients\n" + "2- chacking account clients";
	        String output2 = "Invalid Choice!! Please Try Again";
	        System.out.print(output);
	        String Choose;
	        do {
	            Choose = input.next();

	            if (Choose.equalsIgnoreCase("y")) {
	                System.out.println(output1);
	                do {
	                    Number = input.nextInt();

	                    switch (Number) {
	                        case 1:
	                            for (int i = 0; i < BankSystem.size(); i++) {
	                                if (BankSystem.get(i).getAccountType().equals("saving")) {
	                                    System.out.println(BankSystem.get(i).toString());
	                                    System.out.println();

	                                }
	                            }
	                            break;
	                        case 2:
	                            for (int i = 0; i < BankSystem.size(); i++) {
	                                if (BankSystem.get(i).getAccountType().equals("checking")) {
	                                    System.out.println(BankSystem.get(i).toString());
	                                    System.out.println();

	                                }
	                            }

	                            break;
	                        default:
	                            System.out.println(output2);
	                            break;

	                    }

	                } while (Number != 1 && Number != 2);
	                break;
	            }

	        } while (!Choose.equalsIgnoreCase("N"));

	    }
}


