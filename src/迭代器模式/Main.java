package ������ģʽ;

import java.util.HashMap;
import java.util.Map;

public class Main {
public static void main(String[] args) {
	/*
	 * �Զ���ArrayList
	 */
	Collection al=new MyArrayList();
	for(int i=0;i<15;i++){
		al.add(i);
	}
   
	 MyIterator iterator=al.iterator();
	 while(iterator.hasNext()){
		 Object o=iterator.next();
		 System.out.println(o);
	 }
	/*
	 * �Զ���LinkList
	 */
	Collection li=new MyLinkList();
	for(int i=0;i<15;i++){
		li.add(i);
	}
	for(int i=0;i<15;i++){
		System.out.println(li);
	}

	
}
}
