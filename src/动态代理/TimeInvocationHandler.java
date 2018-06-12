package 动态代理;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeInvocationHandler implements InvocationHandler{
	private Object tar;
	public TimeInvocationHandler(Object tar) {

		super();
		System.out.println("TimeInvocationHandler("+tar+")");
		this.tar = tar;
	}
	@Override
	public void invoke(Object o,Method m) {
		System.out.println("TimeInvocationHandler.invoke"+o+":"+m);
		// TODO Auto-generated method stub
		System.out.println("计时开始");
		long st=System.currentTimeMillis();
      try {
		m.invoke(tar);
	} catch (Exception e) {} 
		System.out.println("计时结束"+(System.currentTimeMillis()-st));
	}

}
