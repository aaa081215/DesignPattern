package 工厂模式.抽象工厂;

public class DefaultFacyory {
	public fly createfly(){
		return new fly();
	}
	public apple createapple(){
		return new apple();
	}
}
