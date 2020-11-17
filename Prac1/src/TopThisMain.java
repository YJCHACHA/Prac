class TopThis {
	public void printSelf() {
		System.out.println(this);
	}
}

public class TopThisMain {
	public static void main(String[] args) {
		TopThis t1 = new TopThis();
		System.out.println("t1 객체 : " + t1);
		t1.printSelf();
		TopThis t2 = new TopThis();
		System.out.println("t2 객체 : " + t2);
		t2.printSelf();
	}

}
