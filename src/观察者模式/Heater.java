package �۲���ģʽ;
/*
 * ��ˮ�����۲���
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
            this.setTemperature(temperature);   //�����µ��¶�  
            this.notifyAllObservers(Integer.toString(temperature)); //֪ͨ����ע��Ĺ۲���  
        }  
    }  
}
