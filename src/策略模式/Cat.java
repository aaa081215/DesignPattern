package ²ßÂÔÄ£Ê½;

public class Cat implements Comparables{
private int high;
private int weight;
private Comparators com=new CatHigh();
public int getHigh() {
	return high;
}

public void setHigh(int high) {
	this.high = high;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

public Cat(int high, int weight) {
	super();
	this.high = high;
	this.weight = weight;
}

@Override
public int compareto(Object o) {
	// TODO Auto-generated method stub
return com.compareto(this, o);
}

@Override
public String toString() {
	return "Cat [high=" + high + ", weight=" + weight + "]";
}


}
