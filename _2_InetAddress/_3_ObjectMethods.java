package _2_InetAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Objects;

public class _3_ObjectMethods {
	
	InetAddress add;
	
	_3_ObjectMethods(String add) throws IOException{
		this.add = InetAddress.getByName(add);
	}
	
	@Override
	public boolean equals(Object obj) {
		_3_ObjectMethods objAddressTwo = (_3_ObjectMethods) obj;
		return Objects.equals(add, objAddressTwo.add);
	}
	
	@Override
	public String toString() {
		return "Host addresss in string representation: "+this.add.getHostName();
	}

	public static void main(String[] args) throws IOException{
		
		_3_ObjectMethods addressOne = new _3_ObjectMethods("example.com");
		_3_ObjectMethods addressTwo = new _3_ObjectMethods("www.example.com");
		_3_ObjectMethods addressThree = new _3_ObjectMethods("www.google.com");
		System.out.println(addressOne.equals(addressTwo));
		System.out.println(addressTwo.equals(addressThree));
		System.out.println(addressOne.hashCode());
		System.out.println(addressOne.toString());

	}

}
