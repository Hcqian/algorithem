package Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class handler implements InvocationHandler{
	private Object c=null;
	public handler(Object o) {
		// TODO Auto-generated constructor stub
		this.c=o;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before"+proxy.getClass());
		method.invoke(c, args);
		System.out.println("after");
		
		return proxy;
	}

}
