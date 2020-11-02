/*
 * 오버라이딩 테스트
*/
class Fafa {
	public void sayHello() {
		System.out.println("FaFa의 sayHello()");
	}
}

class Baby extends Fafa {
	public void sayHello() {
		System.out.println("Baby의 sayHello()");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		Fafa f = new Fafa();
		f.sayHello();
		Baby b = new Baby();
		b.sayHello();
		Fafa fb = new Baby(); // Fafa의 참조변수에 baby 메모리를 할당
		fb.sayHello();
	}
}
