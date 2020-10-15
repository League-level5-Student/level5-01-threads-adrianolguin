package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class MyRobot {

	Robot robot;
	Thread thread;
	int counter = 0;

	MyRobot(int x, int y) {
		robot = new Robot(x, y);
		thread = new Thread(new RobotThread(robot));
	}

	void startThread() {
		System.out.println("started thread #" + counter);
		counter++;
		thread.start();
	}

	void initializeThread() {
		thread = new Thread(new RobotThread(robot));
	}

}
