package xxx;

import java.util.Scanner;

public class Lottery2 {
	public static void main(String[] args) {
		System.out.println("請輸入不要的數字:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[49];
		int out[]=new int[6];
		int j=0;
		int z=0;
		int c=0;
		
		for(int i=0; i< b.length; i++ ) {
			if(j%7==0) {
				System.out.println();
			}j++;
			
			
			b[i]=i+1;
			
			
			if(b[i]%10==a) {
				b[i]=0;
			}else if(b[i]/10==a) {
				b[i]=0;
			}else{
				System.out.print(b[i]+" ");
				z++;
			}
		}		System.out.println();
				System.out.println("總數"+z);
		while(c<6) {
			int Ch=(int) (Math.random()*49);
			if(b[Ch]==0) {
				c--;
				
			}else {
				out[c]=b[Ch];
				System.out.print(out[c]+" ");
			}c++;
			b[Ch]=0;
			
		}
	}		
}	