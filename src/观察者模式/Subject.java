package �۲���ģʽ;

import java.util.ArrayList;
import java.util.List;
/** 
 * ���۲��߽�ɫ 
 */
public class Subject {
	    private List<Observer> list = new ArrayList<Observer>();  
	    /** 
	     * ע��۲��߶��� 
	     * @param observer  �۲��� 
	     */  
	    public void registerObserver(Observer observer){  
	        list.add(observer);  
	        System.out.println("ע����һ���۲��߽�ɫ��");  
	    }  
	    /** 
	     * ɾ���۲��߶��� 
	     * @param observer  �۲��� 
	     */  
	    public void removeObserver(Observer observer){  
	        list.remove(observer);  
	    }  
	    /** 
	     * ֪ͨ����ע��Ĺ۲��߶����ҵ�״̬�ı俩 
	     * @param newState 
	     */  
	    public void notifyAllObservers(String newState){  
	        for(Observer observer : list){  
	            observer.update(newState);  
	        }  
	    }  
}
