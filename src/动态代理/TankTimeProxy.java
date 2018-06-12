package 动态代理;import java.lang.reflect.Method;
public class TankTimeProxy implements 动态代理.Moveable{
	
动态代理.InvocationHandler h;    public TankTimeProxy(InvocationHandler h) {
	super();
	this.h = h;
    }
@Override	public void move() {try{ Method md=动态代理.Moveable.class.getMethod("move");h.invoke(this,md);}catch(Exception e){}	}}
