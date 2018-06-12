package Ö¸ÁîÄ£Ê½;

import java.util.ArrayList;
import java.util.List;

public class Boy {
	private String name;
    private List<Command> commands=new ArrayList<Command>();
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void dosomething() {
		// TODO Auto-generated method stub
		
	}

	public void addCommand(Command c1) {
		// TODO Auto-generated method stub
		this.commands.add(c1);
		
	}
	public void executeCommand() {
		// TODO Auto-generated method stub
		for(Command c:commands){
			c.execute();
		}	
	}
}
