
/*5. Write a program to concatenate two arrays (merge two array to new one)?
    a[] = {1,2,3}
	b[] = {4,5}
	c[] = {1,2,3,4,5}
*/
public class Quest5_8 {

	public static void main(String[] args) {
		int[] a = new int[]{1,2,3};
		int[] b = new int[]{4,5};
		int[] c = new int[a.length+b.length];
		int count = 0;
		int n = 0;
		for (; count < c.length; count++) {
			if (count<a.length) {
				c[count] = a[count];
			}
			else if (n<b.length) {
					c[count] = b[n];
					n++;
				}
			}
		System.out.println("Array A is ");
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+ " ");
		}
		System.out.println("\nArray B is ");
		for (int i = 0; i < b.length; i++) {
			
			System.out.print(b[i]+ " ");
		}
		System.out.println("\nArray C is ");
		for (int i = 0; i < c.length; i++) {
			
			System.out.print(c[i]+ " ");
		}

	}

}
