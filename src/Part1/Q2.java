package Part1;

public class Q2 {
	public static void main(String args[]) {
		int score[] = {67,89,87,69,90,100,75,90} ;		// 使用静态初始化声明数组
		for(int i=1;i<score.length;i++){
			for(int j=0;j<score.length;j++){
				if(score[i]<score[j]){	// 交换位置
					int temp = score[i] ;	// 中间变量
					score[i] = score[j] ;
					score[j] = temp ;
				}
			}
			System.out.print("第" + i + "次排序的结果：") ;
			for(int j=0;j<score.length;j++){	// 循环输出
				System.out.print(score[j]+"\t") ;
			}
			System.out.println("") ;
		}
		for(int i=0;i<score.length;i++){	// 循环输出
			System.out.print(score[i]+"\t") ;
		}
	}
}
