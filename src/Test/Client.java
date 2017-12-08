package Test;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		CityTree c = new CityTree();
		handler h = new handler(c);
		C dc = (C) Proxy.newProxyInstance(h.getClass().getClassLoader(), c.getClass().getInterfaces(), h);
		dc.cb();
		for (Class<?> string : dc.getClass().getInterfaces()) {
			System.out.println(string.getName());
		}
		
		System.out.println(dc==dc.cb());
		
	}
}
