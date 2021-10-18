package Occurance;

import java.util.Scanner;

public class OccuranceOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int low,upper,dig;
		low=sc.nextInt();
		upper=sc.nextInt();
		dig=sc.nextInt();
		System.out.println("The occuranc of "+dig+" in "+low+" to "+upper+" is "+occurance(low,upper,dig));
sc.close();
	}

	private static int occurance(int low, int upper, int dig) {
		int count=0,temp;
		for(int i=low;i<upper;i++) {
			temp=i;
			while(temp>0) {
				if(temp%10==dig) 
					count++;
				temp/=10;
			}
		}
		return count;
	}

}
