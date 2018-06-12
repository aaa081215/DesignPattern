package 观察者模式;

public class View extends Subject implements Observer{

    private boolean isBoiled = false;   //表示水是否烧开了  
    private int displayTemperature;     //定义显示器的温度  
    
	public boolean isBoiled() {
		return isBoiled;
	}
	public void setBoiled(boolean isBoiled) {
		this.isBoiled = isBoiled;
	}
	public int getDisplayTemperature() {
		return displayTemperature;
	}
	public void setDisplayTemperature(int displayTemperature) {
		this.displayTemperature = displayTemperature;
	}
	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
        displayTemperature = Integer.parseInt(state);  
        System.out.println("当前显示器显示的温度是："+displayTemperature);  
        this.displayTemperature(displayTemperature);  
		
	}
    private void displayTemperature(int temperature){  
        if(temperature>100){  
            this.setBoiled(true);  
            this.notifyAllObservers(Boolean.toString(isBoiled));  
        }  
    } 

}
