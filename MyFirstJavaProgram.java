package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Robocop= new Robot();
Robocop.setSpeed(70);
Robocop.setPenColor(Color.blue);
Robocop.sparkle();
Robocop.move(100);
Robocop.penDown();
Robocop.turn(90);
Robocop.move(300);
Robocop.turn(90);
Robocop.move(300);
Robocop.turn(90);
Robocop.move(300);
Robocop.turn(90);
Robocop.move(300);
Robocop.setWindowColor(Color.GREEN);

	
	
	}
}
