package polymorphism;

public class SamsungTv implements TV {
	private SonySpeaker speaker;
	private int price;
	public SamsungTv() {
		System.out.println("samsungTV1객체 생성");
	}
	//매개변수를 가지는 생성자
	public SamsungTv(SonySpeaker speaker) {
		System.out.println("samsungTV2객체 생성 ");
		this.speaker = speaker;
	}
	
	public SamsungTv(SonySpeaker speaker, int price) {
		System.out.println("samsungTV3객체 생성 ");
		this.speaker = speaker;
		this.price = price;
	}
	public void powerOn() {
		System.out.println("SamsungTV -- 전원을 켠다(가격: "+this.price+")");
	}
	public void powerOff() {
		System.out.println("SamsungTV -- 전원을 끈다");
	}
	public void volumeUp() {
		speaker.volumeUp();
		System.out.println("SamsungTV -- 소리올린다");
	}
	public void volumeDown() {
		speaker.volumeDown();
		System.out.println("SamsungTV -- 소리내린다");
	}
	public void initMethod() {
		System.out.println("객체 초기화 작업처리.....");
	}
	public void destroyMethod() {
		System.out.println("객체 사라질때 작업처리......");
	}
}
