package _01_Olympic_Rings;

import java.awt.Graphics2D;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.

	public static void main(String[] args) {

		Robot r1 = new Robot();
		Robot r2 = new Robot();
		Robot r3 = new Robot();
		Robot r4 = new Robot();
		Robot r5 = new Robot();

		r1.moveTo(100, 150);
		r1.penDown();

		r2.moveTo(150, 100);
		r2.penDown();

		r3.moveTo(200, 150);
		r3.penDown();

		r4.moveTo(250, 100);
		r4.penDown();

		r5.moveTo(300, 150);
		r5.penDown();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r1.move(1);
				r1.turn(1);
			}
			r1.hide();
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r2.move(1);
				r2.turn(1);
			}
			r2.hide();
		});
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r3.move(1);
				r3.turn(1);
			}
			r3.hide();
		});
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r4.move(1);
				r4.turn(1);
			}
			r4.hide();
		});
		Thread t5 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r5.move(1);
				r5.turn(1);
			}
			r5.hide();
		});

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
