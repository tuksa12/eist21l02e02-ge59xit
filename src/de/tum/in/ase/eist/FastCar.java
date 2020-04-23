package de.tum.in.ase.eist;

public class FastCar extends Car {

	// TODO Backlog Item 14: Change the image here
	private static final String FAST_CAR_IMAGE_FILE = "FastCar.gif";

	private static final int MIN_SPEED_FAST_CAR = 2;
	private static final int MAX_SPEED_FAST_CAR = 10;

	public FastCar(Dimension2D gameBoardSize) {
		super(gameBoardSize);
		setMinSpeed(MIN_SPEED_FAST_CAR);
		setMaxSpeed(MAX_SPEED_FAST_CAR);
		setRandomSpeed();
		setIconLocation(FAST_CAR_IMAGE_FILE);
	}
}
