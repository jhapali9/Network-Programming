package _2_InetAddress;

import java.io.IOException;
import java.net.InetAddress;

public class _1_FindIPAddresses {

	public static void main(String[] args) throws IOException{
		
		InetAddress addresses[] = InetAddress.getAllByName("www.example.com");
		for(InetAddress a: addresses) {
			System.out.println(a.getHostAddress());
		}

	}

}
