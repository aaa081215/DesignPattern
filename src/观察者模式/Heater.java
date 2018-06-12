package 观察者模式;
/*
 * 热水器被观察者
 */
public class Heater extends Subject{
	private int temperature;  
	  
    public int getTemperature() {  
        return temperature;  
    }  
  
    public void setTemperature(int temperature) {  
        this.temperature = temperature;  
    }  
      
    public void boilWater(){  
        for(int i=95;i<105;i++){  
        	System.out.println(i);
            temperature = i;  
            this.setTemperature(temperature);   //设置新的温度  
            this.notifyAllObservers(Integer.toString(temperature)); //通知所有注册的观察者  
        }  
    }  
}
