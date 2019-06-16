package Part1;

public class Q1 {
	public static void main(String args[]) {
		System.out.print("水仙花数有:");
		for(int i = 0;i<1000;i++) {
			int sum = 0;
			int tmp = i;
			while(tmp!=0) {
				int a = tmp%10;
				sum += a*a*a;
				tmp /=10 ;
			}
			if(sum==i) {
				System.out.print(i+"\t");
			}
		}
	}

}
