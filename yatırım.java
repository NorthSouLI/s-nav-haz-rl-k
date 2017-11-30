package ybs_111_week9;

import java.util.Scanner;

public class yatýrým {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double yatmik, faizorani;
		Scanner input = new Scanner (System.in);
		System.out.println("yatýrým miktarýný giriniz");
		yatmik = input.nextDouble();
		System.out.println("faiz miktari");
		faizorani = input.nextDouble();
		System.out.println(futureInvestmentValue (yatmik, faizorani/1200, 1));
		for (int sene = 1; sene <= 30; sene ++) {
			System.out.println("kar "+sene+" " + "="  + (int) futureInvestmentValue (yatmik, faizorani/1200, sene));
				
			}
	}
	
	public static double futureInvestmentValue (double investmentAmount, double montlyInterestRate, int years){
		double hesaplanan;
		hesaplanan = investmentAmount * ( Math.pow((1+montlyInterestRate), (years * 12)));
		return hesaplanan;
	}
}
