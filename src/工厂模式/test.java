package 工厂模式;

public class test {
public static void main(String[] args) {
Moveable f=new fly();
flyFactory factory=new flyFactory();
factory.cre().run();
}
}
