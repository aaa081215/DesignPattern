package ¶¯Ì¬´úÀí;

public class Main {
	public static void main(String[] args) throws Exception {
		Tank t=new Tank();
		InvocationHandler h=new TimeInvocationHandler(t);
		Moveable m=(Moveable)Proxy.newProxyInstance(Moveable.class,h);
		m.move();
	}
	
}
