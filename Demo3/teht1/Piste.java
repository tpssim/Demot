package teht1;

public class Piste {

	private double X;
	private double Y;
	private double Z;
	
	public Piste(double X, double Y, double Z) {
		this.asetaX(X);
		this.asetaY(Y);
		this.asetaZ(Z);
	}

	public double annaX() {
		return X;
	}

	public void asetaX(double x) {
		X = x;
	}

	public double annaY() {
		return Y;
	}

	public void asetaY(double y) {
		Y = y;
	}

	public double annaZ() {
		return Z;
	}

	public void asetaZ(double z) {
		Z = z;
	}
	
}
