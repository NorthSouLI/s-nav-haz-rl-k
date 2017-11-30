package ybs_111_week9;

import java.util.Scanner;

public class takvim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		readInput();
	}
	
	public static void readInput () {
		int sene, ay;
		Scanner input = new Scanner (System.in);
		System.out.println("seneyi giriniz");
		sene = input.nextInt();
		System.out.println("ayi giriniz");
		ay = input.nextInt();
		printMonth(sene,ay);
	}
	public static void printMonth (int sene, int ay) {
		System.out.println("ayin hepsini bas");
		printMonthTittle(sene, ay);
		printMonthBody(sene,ay);
		
	}
	public static void printMonthTittle ( int sene, int ay) {
		//System.out.println("ayin basligi");
		System.out.println("\t\t" + getMonthName(ay) + " " + sene);
		System.out.println("______________________________________");
		System.out.println("Paz\tSali\tCar\tPer\tCuma\tCmt\tPzr");
	}
	public static void printMonthBody(int sene, int ay) {
		System.out.println("iceregini bas");
		getStartDay(sene, ay);
	}
	
	public static String getMonthName (int ay) {
		switch (ay) {
		case 1: return "Ocak"; 
		case 2: return "Þubat"; 
		case 3: return "Mart";
		case 4: return "Nisan";
		case 5: return "Mayis";
		case 6: return "Haziran";
		case 7: return "Temmuz"; 
		case 8: return "Aðustos";
		case 9: return "Eylül";
		case 10: return "Ekim";
		case 11: return "Kasim";
		case 12: return "Aralik"; 
		}
		return null;
		
	}
	public static int getStartDay (int sene, int ay) {
		getTotalNumOfDays(sene, ay);
		return 3;
	}
		public static int getTotalNumOfDays (int sene, int ay) {
			System.out.println("ayin icindeki günler sayisi " + getNumOfDaysInMonth(sene, ay));
			return 1;
		}
		//bitti
		public static int getNumOfDaysInMonth (int sene, int ay) {
		if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay ==12 )
			return 31;
		if (ay == 4 || ay == 6 || ay == 9 || ay == 11 )
			return 30;
		if (ay == 2)
			if (isLeapYear())
				return 29;
			else
				return 28;
		else return 30;
		}
		//bitti
		private static boolean isLeapYear() {
			// TODO Auto-generated method stub
			if ((sene %4 == 0 && sene/100 != 0) || sene %400 == 0)
			return true;
			else
				return false;
				
		}
		
}
