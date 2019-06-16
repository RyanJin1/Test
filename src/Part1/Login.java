package Part1;

public class Login {
	public static void main(String args[]) {
		Operate operate=new Operate(args);
		System.out.println(operate.login());
	}
}
class Check{
	public boolean valiDate(String name, String passwd) {
		if(name.equals("jinyichao")&&passwd.equals("123456")) 
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}

class Operate{
	private String info[];
	public Operate(String info[]) {
		this.info=info;
	}
	public String login() {
		String name=info[0];
		String passwd=info[1];
		Check check=new Check();
		this.isExit();
		String str;
		if(check.valiDate(name, passwd)) {
			str="欢迎光临"+name;
		}
		else
		{
			str="登录失败";
		}
		return str;
	}
	public void isExit() {
		if(this.info.length!=2)
			System.out.println("输入格式不正确！");
			System.exit(1);
	}
		
		
		
	
	
	
	
}
