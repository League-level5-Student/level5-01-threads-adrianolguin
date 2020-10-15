package _02_Advanced_Robot_Race;

import java.awt.Window;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.

	static int amnt = 5;
	static int finishLineY = 100;
	static boolean finished = false;

	public static void main(String[] args) {
		MyRobot[] robots = new MyRobot[amnt];

		for (int i = 0; i < robots.length; i++) {
			robots[i] = new MyRobot((100 * i) + 100, 700);
		}

		while (!finished) {
			for (MyRobot r : robots) {
				r.startThread();
			}

			for (MyRobot r : robots) {
				try {
					r.thread.join();
					r.initializeThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			for (MyRobot r : robots) {
				if (r.robot.getY() <= finishLineY) {
					finished = true;
				}
			}
		}
	}
}
