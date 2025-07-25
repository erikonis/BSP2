package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

public class Time {
	static int h,m,s;
	static int advance = 5;
	static int action;
	static int modulo;
	static boolean isAM;
	static String amORpm;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		AskTheUser();
	}
	public static void AskTheUser(){
		System.out.println(
				"Please select the format : \n" +
				"1 - 24H \n" +
				"2 - 12H"
		);
		action = scanner.nextInt();
		setAction(action);
	}

	public static int setAction(int action) {
		switch(action){
			case 1:
			case 2:
				ScanHrs();
				break;

			default:
				throw new Error("Invalid mode, operation aborted.");
		}
		return action;
	}

	public static void ScanHrs(){
		System.out.println("Please input an hour :");
		h = scanner.nextInt();
		System.out.println("Please input a minute :");
		m = scanner.nextInt();
		System.out.println("Please input an second :");
		s = scanner.nextInt();
		CheckErrors(h,m,s);
	}

	public static void AdvanceTime(int h, int m, int s){
		switch(action){
			case 1:
				s += advance;
				if(s >= 56){
					modulo = s % 60;
					s = 0 + modulo;
					m+=1;
					while (m >= 59){
						h+=1;
						m = 0;
						while (h >= 23){
							h = 0;
							m = 0;
						}
					}
				}
				System.out.println("Advanced time : " + h + "h:" + m + "m:" + s + "s");
				break;
			case 2:
				s+=advance;
				while (m > 59){
					h++;
					m -= 60;
					if(h > 12){
						h -= 12;
					}
					else return;
				}
				if(h == 11) isAM = false; //am to pm
				if(h == 23) isAM = true; //pm to am

				if(h >= 12){
					h -= 12;
					if(m > 59){
						m -= 60;
						s+=advance;
					}
					amORpm = "PM";
				}
				else{
					amORpm = "AM";
				} // without switching

				if(s >= 56) {
					modulo = s % 60;
					s = modulo; //s = O
					m += 1;
					while (m >= 59) {
						m -= 60;
						h += 1;
						while (h >= 12) {
							h -= 12;
							if(!isAM){
								amORpm = "PM";
							}
							else{
								amORpm = "AM";
							}
						}
					}
				}
				System.out.println("Advanced time : " + h + "h:" + m + "m:" + s + "s" + "("+amORpm+")");
				break;
		}
	}
		private static void CheckErrors(int h, int m, int s){
			if(h >= 24) throw new Error("Invalid hour length : (" + h + " of 24)");
			else if(m > 60) throw new Error("Invalid minute length : (" + m + " of 60)");
			else if(s > 60) throw new Error("Invalid second length : (" + s + " of 60)");
			else
			AdvanceTime(h,m,s);
		}
	}

