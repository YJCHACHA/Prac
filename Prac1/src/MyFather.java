public class MyFather {
	public String name; //public 멤버 변수
	private String nickname; //private 멤버 변수
	//생성자 메서드
	public MyFather () {
		name = "아부지";
		nickname = "사랑";
	}
	//private 데이터 리턴하는 멤버 메서드
	public String getNickName() {
		return nickname;
	}

}
