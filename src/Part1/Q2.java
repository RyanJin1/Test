package Part1;

public class Q2 {
	public static void main(String args[]) {
		int score[] = {67,89,87,69,90,100,75,90} ;		// ʹ�þ�̬��ʼ����������
		for(int i=1;i<score.length;i++){
			for(int j=0;j<score.length;j++){
				if(score[i]<score[j]){	// ����λ��
					int temp = score[i] ;	// �м����
					score[i] = score[j] ;
					score[j] = temp ;
				}
			}
			System.out.print("��" + i + "������Ľ����") ;
			for(int j=0;j<score.length;j++){	// ѭ�����
				System.out.print(score[j]+"\t") ;
			}
			System.out.println("") ;
		}
		for(int i=0;i<score.length;i++){	// ѭ�����
			System.out.print(score[i]+"\t") ;
		}
	}
}
