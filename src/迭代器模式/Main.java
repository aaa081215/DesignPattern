package 迭代器模式;

import java.util.HashMap;
import java.util.Map;

public class Main {
public static void main(String[] args) {
	/*
	 * 自定义ArrayList
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
	 * 自定义LinkList
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
