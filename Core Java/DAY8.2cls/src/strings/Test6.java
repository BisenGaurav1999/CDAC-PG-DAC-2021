package strings;

public class Test6 {
	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("content " +sb+"len "+sb.length()+"capa "+sb.capacity());//hello,5 21
		sb.append(true);
		sb.append(12.145);
		sb.append(5550);
		System.out.println(sb);//hellotrue12.1455550
		sb.append(34).append(false).append(new char[] {'a','d'});
		System.out.println(sb);//hellotrue12.145555034falsead
		sb.append("12113115151558484844");
		System.out.println(sb.capacity()+" "+sb.length());
		StringBuilder sb2 = sb.insert(0, 'z');
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb==sb2);//true: 
		System.out.println(sb.equals(sb2));//true: ref equality
		StringBuilder sb3=new StringBuilder("123456");
		StringBuilder sb4=new StringBuilder("123456");
		System.out.println(sb3==sb4);//f : different addr
		System.out.println(sb3.equals(sb4));//f : resolves it by ref eq

	}
}
