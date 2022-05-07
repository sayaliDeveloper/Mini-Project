package atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class OptionMenu extends Account
{
	Scanner sc = new Scanner(System.in);
	Account acc = new Account();
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer, Account> data = new HashMap<Integer, Account>();
    
	public void getLogin() throws IOException {
		boolean end = false;
		int customerNumber = 0;
		int pinNumber = 0;
		while (!end) {
			try {
				System.out.print("\nEnter your customer number: ");
				customerNumber = sc.nextInt();
				System.out.print("\nEnter your PIN number: ");
				pinNumber = sc.nextInt();
			//	Iterator it = data.Iterator();
			//	Iterator  it = data.iterator();
			//	while (it.hasNext()) 
			//	{
				//	Map.Entry pair = it.next();
				//	Account acc = (Account) pair.getValue();
					//if (data.containsKey(customerNumber) && pinNumber == acc.getPinNumber())
					{
						getAccountType();
					//	end = true;
					//	break;
					}
			//	}
				if (!end) {
					System.out.println("\nWrong Customer Number or Pin Number");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nInvalid Character(s). Only Numbers.");
			}}//}
		}
	//}//

	public void getAccountType() {
		boolean end = false;
		while (!end) {
			try {
				System.out.println("\nSelect the account you want to access: ");
				System.out.println(" Type 1 - Checkings Account");
				System.out.println(" Type 2 - Savings Account");
				System.out.println(" Type 3 - Exit");
				System.out.print("\nChoice: ");

				int selection = sc.nextInt();

				switch (selection) {
				case 1:
					acc.getCheckingWithdrawInput();
					break;
				case 2:
					acc.calcSavingWithdraw(selection);
					break;
				case 3:
					end = true;
					break;
				default:
					System.out.println("\nInvalid Choice.");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nInvalid Choice.");
				sc.next();
			}
		}
	
      }
	
	}
