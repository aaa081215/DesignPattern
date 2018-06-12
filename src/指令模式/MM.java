package Ö¸ÁîÄ£Ê½;

public class MM {
private String name;

public void order(Boy bb) {
	Command c1=new ShoppingCommad();
	Command c2=new ShoppingCommad();
	bb.addCommand(c1);
	bb.addCommand(c2);
	bb.executeCommand();
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
