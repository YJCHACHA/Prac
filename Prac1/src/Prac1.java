public class Prac1 {
	private String name = null;
	private String address = null;
	private int age = 0;
	//디폴트 생성자 다시 만든다.
	public Prac1() {
		name = "이름없음"; //멤버변수 초기화
		address = "주소없음";
		age = 0;
	}
	public void setData(String n, String a, int g) {
		name = n;
		address = a;
		age = g;
	}
	public String getData() {
		String str = name + "," + address + "," + age;
		return str;
	}
	public static void main(String[] args) {
		Prac1 tc = new Prac1();
		String s;
		s = tc.getData(); //생성자에서 초기화된 값을 얻어 냄
		System.out.println(s);
		tc.setData("홍길동", "서울시 중구", 25); //멤버 변수 값 할당
		s = tc.getData(); //할당된 값 받아내기
		System.out.println(s);
	}
}