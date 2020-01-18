

import java.util.Scanner;

public class Lottery {
		private String name;
		private Double sal;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("不喜歡的數字:");
		int a = sc.nextInt();
		int b = 0;
		for(int c =0;c <=4; c++) {if(c==a) {continue;}
		for(int d =0;d <=9;d++) {if(d==a) {continue;}
		else if(d==0 && c==0) {continue;}
		System.out.print(c+""+d+"\t");
			b++;}System.out.println();
			}
		System.out.println("總共有"+b+"個可選");
	}
  }

