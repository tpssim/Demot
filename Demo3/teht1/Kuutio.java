package teht1;

public class Kuutio implements Kappale{
	
	private double sivunPituus;
	private Piste keskipiste;
	
	public Kuutio(double sivunPituus, Piste keskipiste) {
		this.sivunPituus = sivunPituus;
		this.keskipiste = keskipiste;
	}
	
	public double annaAla() {
		return sivunPituus*sivunPituus*6;
	}
	
	public Piste annaKeskipiste() {
		return keskipiste;
	}
}
