package tester;
import java.util.Date;
import com.app.vehicles.Vehicle;

public class TestVehicle {
	public static void main(String[] args) {
Vehicle v1 = new Vehicle(12345, "red", 34564, new Date());
		Vehicle v2 = new Vehicle(12345, "red", 34564, new Date());
		System.out.println(v1==v2);//ref equality : false
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.equals(v2));//true using equals method from vehicle class =>
		System.out.println(v1.hashCode()+" "+v2.hashCode());//diff hashcodes
		
	}
}
