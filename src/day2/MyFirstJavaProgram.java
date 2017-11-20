package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	System.out.println("Hello World");
	Robot fred = new Robot("batman");
	fred.setPenColor(55, 100, 100);
		fred.penUp();
		fred.setAngle(0);
		fred.setSpeed(1000);
		fred.turn(90);
		fred.sparkle();
		fred.penDown();
		fred.move(200);
		fred.turn(90);
		fred.move(200);
		fred.turn(90);
		fred.setPenColor(255, 0, 0);
		fred.move(200);
		fred.turn(90);
		fred.setPenColor(0, 255, 0);
		fred.move(200);
		fred.unSparkle();
		fred.penUp();
		fred.move(900);
	
	
	}
}
