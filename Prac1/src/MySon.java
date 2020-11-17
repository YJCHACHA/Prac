
public class MySon extends MyFather{
	public void sayFatherNames() {
		System.out.println(name);
		//System.out.println(nickname); //에러 발생
		System.out.println(getNickName());
	}

	public static void main(String[] args) {
		MySon m = new MySon();
		m.sayFatherNames();
	}
}
