package Part1;

public class Q3 {
	public static void main(String args[]) {
		String str="want you to know one thing";
		Countletter c=new Countletter(str);
		System.out.println("n的出现次数:"+c.count('n'));
		System.out.println("n的出现次数:"+c.count('o'));
	}
}
class Countletter{
	String str;
	public Countletter(String str) {
		this.str=str;
	}
	public int count(char letter) {
		int count=0;
		char tmp[]=this.str.toCharArray();
		for(int i=0;i<tmp.length;i++) {
			if(tmp[i]==letter)
				count++;
		}
		return count;
	}
}
