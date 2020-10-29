class GrandFather {
	public GrandFather() {
		System.out.println("I am a GrandFather");
	}
	public void sayGrandNumber() {
		System.out.println("sayGrandNumber() 메서드 호출");
		for(int i=0; i<10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

class Father extends GrandFather {
	public Father() {
		System.out.println("I am a Father");
	}
	public void sayFatherNumber() {
		System.out.println("sayFatherNumber() 메서드 호출");
		for(int i=10; i<20; i++) {
			System.out.print(i + " ");
		}
	}
}

public class IneritanceMain {

	public static void main(String[] args) {
		Father f = new Father();
		f.sayGrandNumber();
		f.sayFatherNumber();
	}

}
