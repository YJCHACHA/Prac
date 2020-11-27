
public class ArrayCopyMain {

	public static void main(String[] args) {
		int[] source = new int[]{5,4,6,9,7,9};
		int[] target = {100,200,300,400,500,600,700};
		System.out.println("기존 source");
		for(int i=0; i<source.length; i++) {
			System.out.println("source[" + i + "]:" + source[i]);
		}
		System.out.println("기존 target");
		for(int i=0; i<target.length; i++) {
			System.out.println("target[" + i + "]:" + target[i]);
		}
		
		//부분 배열 복사의 예
		System.arraycopy(source, 2, target, 3, 4);
		System.out.println("변경 target");
		for(int i=0; i<target.length; i++) {
			System.out.println("target[" + i + "]:" + target[i]);
		}

	}

}
