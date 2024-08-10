package _2_InetAddress;

import java.io.IOException;
import java.net.InetAddress;

public class _2_GetterMethods {

	public static void main(String[] args) throws IOException{
		
		InetAddress address = InetAddress.getByName("www.example.com");
		System.out.println(address.getCanonicalHostName());
		System.out.println(address.getHostAddress());
		System.out.println(address.getHostName());
		System.out.println(address.isReachable(0));
		System.out.println(address.hashCode());

	}

}
