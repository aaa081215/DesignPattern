package �۲���ģʽ;

public class View extends Subject implements Observer{

    private boolean isBoiled = false;   //��ʾˮ�Ƿ��տ���  
    private int displayTemperature;     //������ʾ�����¶�  
    
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
        System.out.println("��ǰ��ʾ����ʾ���¶��ǣ�"+displayTemperature);  
        this.displayTemperature(displayTemperature);  
		
	}
    private void displayTemperature(int temperature){  
        if(temperature>100){  
            this.setBoiled(true);  
            this.notifyAllObservers(Boolean.toString(isBoiled));  
        }  
    } 

}
