package sec14;

public class Car {

	// 필드
	private int speed;
	private boolean stop;

	// 메소드
	// getter
	public int getSpeed() {
		return speed;
	}

	// setter
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0; // 설정한 속도가 음수면 0을 반환
			return;
		} else {
			this.speed = speed;
		}
	}

	// getter
	public boolean isStop() {
		return stop;
	}

	// setter
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
