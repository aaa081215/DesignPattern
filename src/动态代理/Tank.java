package ¶¯Ì¬´úÀí;

import java.util.Random;

public class Tank implements Moveable{

	@Override
	public void move() {
		System.out.println("moving---");
	    try {
		Thread.sleep(new Random().nextInt(10000));
		}catch (Exception e) {}
	}

}
