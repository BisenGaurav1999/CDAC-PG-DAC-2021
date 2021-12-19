import java.util.Scanner;

public class BillingSys {
	
	static void billing(){
		    System.out.println("===============================================================");
			System.out.println("**** Welcome to Snack Center ****");
	        System.out.println("===============================================================");
			System.out.println(String.format("1. --> Tea (Rs. 10)"));
	        System.out.println(String.format("2. --> Green Tea (Rs. 15)"));
	        System.out.println(String.format("3. --> Samosa (Rs. 20)"));
	        System.out.println(String.format("4. --> Sandwitch (Rs. 50)"));
	        System.out.println(String.format("5. --> Generate Bill & Exit"));
	      	}

	public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        boolean shouldContinue = true;
        int qnt = 0;
        int tea = 0;
        int gt = 0;
        int samosa = 0;
        int sd = 0;
        int total = 0;
        
        do {
			billing();
			System.out.println("Enter Your Choice :");
	        int choice = sc.nextInt();
			switch (choice) {
			case 1:
				 System.out.println("You Have Selected Tea ");
				 System.out.println("Enter Quantity :");
			         qnt = sc.nextInt();
			         tea = tea + qnt;
			    break;
			case 2:
				System.out.println("You Have Selected Green Tea ");
				System.out.println("Enter Quantity :");
			         qnt = sc.nextInt();
			         gt = gt + qnt;
				break;
			case 3:
				System.out.println("You Have Selected Samosa ");
				System.out.println("Enter Quantity :");
			         qnt = sc.nextInt();
			         samosa = samosa + qnt;
				break;
			case 4:
				System.out.println("You Have Selected Sandwich ");
				System.out.println("Enter Quantity :");
			         qnt = sc.nextInt();
			         sd = sd + qnt;
				break;
			case 5: 
				System.out.println("You Have Selected for billing and Exit");
			    total = tea*10 + gt*15 + samosa*20 + sd*50;
			       System.out.println("*****BILL*****");
			       if(tea>0)
			       System.out.println("Tea         --> " + tea +"   RS "+ tea*10);
			       if(gt>0)
			       System.out.println("Green Tea   --> " + gt +"   RS "+ gt*15);
			       if(samosa>0)
			       System.out.println("Samosa      --> " + samosa +"   RS "+ samosa*20);
			       if(sd>0)
			       System.out.println("Sandwitch   --> " + sd +"   RS "+ sd*50);
			       
			       System.out.println("------------------------------");
			       System.out.println("Total = " + total);
			       shouldContinue = false;
				break;
			default:
				System.out.println("You Have Entered Wrong input retry");
			}
		} while (shouldContinue);
        
       sc.close();
	}

}
