package 观察者模式;

public class Alerm implements Observer{

	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		System.out.println("ok");
		Boolean flag=Boolean.parseBoolean(state);
		if(flag){
			System.out.println("Alert!");
		}
		
	}

}
