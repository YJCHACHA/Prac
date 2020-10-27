/*생성자 오버로딩*/
public class DirectCons {
	private String name = null;
	private String address = null;
	private int age = 0;
	
	//매개변수 없는 생성자
	public DirectCons() {
		name = "이름없음";
		address = "주수없음";
		age = 0;
	}
	//매개변수 있는 생성자
	public DirectCons (String n, String a, int g) {
		name = n;
		address = a;
		age = g;
	}
	public String getData() {
		return name + "," + address + "," + age;
	}

	public static void main(String[] args) {
		//매개변수 없는 생성자의 사용
		DirectCons dc1 = new DirectCons();
		String s1 = dc1.getData();
		System.out.println(s1);
		//매개변수 있는 생성자의 사용
		DirectCons dc2 = new DirectCons("홍길동", "서울시 중구", 25);
		String s2 = dc2.getData();
		System.out.println(s2);

	}

}
