package 观察者模式;

public class Main {
public static void main(String[] args) {
	Heater heater=new Heater();
	View view=new View();
	Alerm alerm=new Alerm();
	heater.registerObserver(view);
	view.registerObserver(alerm);
	heater.boilWater();
}

}
