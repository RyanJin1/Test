package Part1;

public class Q4 {
	public static void main(String args[]) {
		User user1=new User();
		User user2=new User("sidongxu");
		User user3=new User("sidongxu","sidongxu");
		System.out.println(User.getNum());
	}
}
class User{
	private static int num;
	private String name;
	private String passwd;
	public User() {
		num++;
	}
	public User(String name) {
		this.name=name;
		num++;
	}
	public User(String name,String passwd) {
		this.name=name;
		this.passwd=passwd;
		num++;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setPasswd(String passwd) {
		this.passwd=passwd;
	}
	public String  getPasswd() {
		return this.passwd;
	}
	public static int getNum() {
		return num;
	}
}
