package sec03;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;

	// RemoteControl
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	// RemoteControl
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	// RemoteControl
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + volume);
	}

	// Searchable
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

}
