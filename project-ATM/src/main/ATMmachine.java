package main;
import java.util.HashMap;
import java.util.Scanner;
import accountSuper.Accounts;

public class ATMmachine {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String,Accounts> db = new HashMap<String,Accounts>();
		
		// Make Accounts
		Accounts acc1 = new Accounts("0001",1234,"Jango");
		db.put(acc1.getAccnum(), acc1);
		Accounts acc2 = new Accounts("0002",0000,"MunTaek");
		db.put(acc2.getAccnum(), acc2);
		Accounts acc3 = new Accounts("0003",4321,"Java");
		db.put(acc3.getAccnum(), acc3);
		
		try {
			// Login using Account Number and Password
			System.out.println("Account Number : ");
			String msg = scanner.nextLine();
			int pw = db.get(msg).getPassword();
			
			System.out.println("Password : ");
			int pwmatch = scanner.nextInt();

			
			if (pw == pwmatch) {
				int sel;
				int amount;
				int exit = 0;
				while(true) {
					System.out.println("<Menu : 1.Deposit 2.Withdraw 3.Check Balance 4.Exit>");
					System.out.println("Type number : ");
					sel = scanner.nextInt();
					switch(sel) {
						case 1:
							System.out.println("Deposit Amount : ");
							amount = scanner.nextInt();
							db.get(msg).deposit(amount);
							System.out.println("Deposit Complete - Your Balance : "+ db.get(msg).getBalance()); break;
						case 2:
							System.out.println("Withdraw Amount : ");
							amount = scanner.nextInt();
							if (db.get(msg).getBalance() - amount >= 0) {
								db.get(msg).withdraw(amount);
								System.out.println("Withdraw Complete - Your Balance : "+ db.get(msg).getBalance()); break;
							}else {System.out.println("Not enough money on balance."); break;}
						case 3: 
							System.out.println("Your Balance : " + db.get(msg).getBalance()); break;
						case 4:
							exit = 1; break;
						default:
							System.out.println("Wrong Number.");
					}
					if(exit == 1) break;
				}
			} else {System.out.println("Wrong Password");}
		} catch (Exception e) {
			System.out.println("No Acoount in Database.");
		}

		System.out.println("Good Bye.");
		
		scanner.close();
		
		
		
		
		
		
		
	}
	
}
