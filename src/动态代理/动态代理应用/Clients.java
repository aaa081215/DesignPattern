package ��̬����.��̬����Ӧ��;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Clients {
public static void main(String[] args) {
	 //    ����Ҫ�������ʵ����
    Subject realSubject = new RealSubject();

    //    ����Ҫ�����ĸ���ʵ���󣬾ͽ��ö��󴫽�ȥ�������ͨ������ʵ�����������䷽����
    InvocationHandler handler = new DynamicProxy(realSubject);
    /*
     * ͨ��Proxy��newProxyInstance�������������ǵĴ��������������������������
     * ��һ������ handler.getClass().getClassLoader() ����������ʹ��handler������ClassLoader�������������ǵĴ������
     * �ڶ�������realSubject.getClass().getInterfaces()����������Ϊ��������ṩ�Ľӿ�����ʵ������ʵ�еĽӿڣ���ʾ��Ҫ������Ǹ���ʵ���������Ҿ��ܵ�������ӿ��еķ�����
     * ����������handler�� �������ｫ������������������Ϸ��� InvocationHandler ���������
     */
    Subject subject = (Subject)Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject
            .getClass().getInterfaces(), handler);
    
    subject.method01();

}
}
