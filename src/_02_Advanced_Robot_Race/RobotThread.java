package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RobotThread implements Runnable {

	Robot r;
	Random rand;

	RobotThread(Robot r) {
		this.r = r;
		rand = new Random();
	}

	@Override
	public void run() {
		r.move(rand.nextInt(50));
	}

}
