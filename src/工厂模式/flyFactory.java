package 工厂模式;

public class flyFactory extends VehicleFactory{

	@Override
	Moveable cre() {
		// TODO Auto-generated method stub
		return new fly();
	}

}
