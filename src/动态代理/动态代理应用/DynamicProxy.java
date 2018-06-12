package 动态代理.动态代理应用;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class DynamicProxy implements InvocationHandler{

	private Object subject;
	
	public DynamicProxy(Object subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before......");
		System.out.println("Method:" + method);
		method.invoke(subject, args);
		System.out.println("after......");
		return null;
	}



}
