package 动态代理.动态代理应用;

public class RealSubject implements Subject{
    @Override
    public void method01()
    {
        System.out.println("method01");
    }
    
    @Override
    public void method02(String str)
    {
        System.out.println("method02" + str);
    }
}
