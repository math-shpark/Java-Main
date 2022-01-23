package sec11;

public class Earth {

	// 상수
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;

	// 정적 블록
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}

}
