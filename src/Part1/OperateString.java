package Part1;

public class OperateString {
	public static void main(String args[]) {
		String str1="Javaºº ı—ßœ∞∞‡20070326";
		String str2="MLDN JAVA";
		String str3=str2.replaceAll("JAVA","J2EE");
		String str[]=str1.split("0");
		String str4;
		
		
		System.out.println(str1.substring(9));
		System.out.println(str3);
		System.out.println(str1.charAt(7));
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
	}
}
class Book{
	private String name;
	private String no;
	private float price;
	private static int memnum;
	
}
