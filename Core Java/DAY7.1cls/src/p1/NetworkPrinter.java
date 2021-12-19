package p1;

public class NetworkPrinter implements Printer{
	//can implementation cls access i/f const. ? YES
	//How ? using i/f name.memberName OR directly ? : DIRECTLY
	@Override
	public void print(String msg) {
		System.out.println("Sending a msg on the socket to the server : "+msg);
		System.out.println(DATA);
	}
}
