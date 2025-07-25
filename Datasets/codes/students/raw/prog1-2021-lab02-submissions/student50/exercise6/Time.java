package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 * Class for Exercise 6
 */
public class Time {

	int h = 0;
	int m = 0;
	int s = 0;
	boolean ampm;

	public void advanceTime() {
		if (s == 60) {
			s = 0;
			m++;
			if (m == 60) {
				m = 0;
				h++;
				if (ampm && h == 13) {
					h = 1;
				} else if (!ampm && h == 24) {
						h = 0;
				}

			}
		}
	}

	public void tick() {
		s++;
	}

	public void display() {
		System.out.printf("%02d:%02d:%02d\n", h, m, s);
	}
		

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Time t = new Time();
		
//		System.out.print("AM/PM ? (0 for no - 1 for yes): ");
//		t.ampm = scanner.nextBoolean();
//
//		System.out.print("Enter Hour   : ");
//		t.h = scanner.nextInt();
//		
//		System.out.print("Enter Minute : ");
//		t.m = scanner.nextInt();
//		
//		System.out.print("Enter Second : ");
//		t.s = scanner.nextInt();
		
		t.ampm = false;
		t.h = 12;
		t.m = 59;
		t.s = 58;

		// tick
		for (int i = 0; i < 5; i++) {
			t.display();
			t.tick();
			t.advanceTime();
		}

		scanner.close();
	}
}