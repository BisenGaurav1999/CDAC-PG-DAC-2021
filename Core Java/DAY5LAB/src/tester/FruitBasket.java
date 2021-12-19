package tester;

import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {
	public static int count;

	public static void main(String[] args) {
		System.out.println("Enter Basket Size");
		Scanner sc = new Scanner(System.in);
		Fruit[] fr = new Fruit[sc.nextInt()];
		boolean exit = false;
		count = 0;

		while (!exit) {
			System.out.println(
					"\n\nSupply  Options \n1. Add Mango\n2. Add Orange\n3. Add Apple \n4. Display names of all fruits in the basket\n5. Display name,color,weight,test of fruits in basket\n6. Mark a fruit as Stale\n7. Mark all sour fruits stale\n8. Invoke Fruit Specific Functionality\n100. exit");

			switch (sc.nextInt()) {
			case 1:
				if (count < fr.length) {
					System.out.println("Enter : Colour And Weight");
					fr[count++] = new Mango(sc.next(), sc.nextDouble());
				} else
					System.out.println("basket is full");
				break;
			case 2:
				if (count < fr.length) {
					System.out.println("Enter : Colour And Weight");
					fr[count++] = new Orange(sc.next(), sc.nextDouble());
				} else
					System.out.println("basket is full");
				break;
			case 3:
				if (count < fr.length) {
					System.out.println("Enter : Colour And Weight");
					fr[count++] = new Apple(sc.next(), sc.nextDouble());
				} else
					System.out.println("basket is full");
				break;
			case 4:
				if (fr[0] == null)
					System.out.println("No Fruits in Basket");
				else {
					for (int i = 0; i < fr.length; i++) {
						if (fr[i] != null) {
							System.out.println(i + 1 + "  " + fr[i].getName());
						}
					}
				}
				break;
			case 5:
				if (fr[0] == null)
					System.out.println("No Cart content");
				else {
					for (int i = 0; i < count; i++) {
						System.out.println(fr[i].toString() + " Condition : " + (fr[i].isFresh() ? "fresh" : "stale")
								+ "\n" + "Taste : " + fr[i].taste());

					}
				}
				break;
			case 6:
				System.out.println("Enter The index of fruit in basket");
				int index = sc.nextInt();
				if (index >= 0 && index < fr.length) {
					if (fr[index - 1] != null) {
						fr[index - 1].setFresh(false);
					} else
						System.out.println("No fruit exist on this index");
				} else
					System.out.println("Entered index out of limit");
				break;
			case 7:
				for (int i = 0; i < fr.length; i++) {
					if (fr[i] instanceof Orange || fr[i] instanceof Apple) {
						fr[i].setFresh(false);
					}
				}
				break;
			case 8:
				for (Fruit ele : fr) {
					if (ele != null) {
						if (ele instanceof Orange)
							System.out.println(((Orange) ele).taste());
						else if (ele instanceof Apple)
							System.out.println(((Apple) ele).taste());
						else
							System.out.println(((Mango) ele).taste());
					}
				}
				break;
			case 100:
				exit = true;
				break;
			}
		}
		sc.close();
	}

}
