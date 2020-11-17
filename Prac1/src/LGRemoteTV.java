interface IRemoteControl {
	void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
}


abstract class RemoteTV implements IRemoteControl {
	protected int nChannel = 0;
	protected boolean bPower = false;
	public void powerOn() {
		bPower = true;
		System.out.println("TV 전원 on!");
	}
	public void powerOff() {
		bPower = false;
		System.out.println("TV 전원 off!");
	}
	public void channelUp() {
		nChannel++;
		System.out.println("TV Channel Up : " + nChannel);
	}
}



public class LGRemoteTV extends RemoteTV {
	//추상 메서드 재정의
	public void channelDown() {
		nChannel--;
		System.out.println("TV Channel Down : " + nChannel);
	}
	public static void main(String[] args) {
		LGRemoteTV tv = new LGRemoteTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
	}

}
