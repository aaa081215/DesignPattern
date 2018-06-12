package ²ßÂÔÄ£Ê½;

public class CatHigh implements Comparators{

	@Override
	public int compareto(Object o1,Object o2) {
	Cat c1=(Cat)o1;
	Cat c2=(Cat)o2;
	if(c1.getHigh()>c2.getHigh()){return 1;}
	else if(c1.getHigh()<c2.getHigh()){return -1;}
	else return 0;
	}

}
