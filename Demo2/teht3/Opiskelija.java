package teht3;

public class Opiskelija extends Yliopistolainen {

	private String opiskelijaTunnus;
	
	public Opiskelija(String nimi, String opiskelijaTunnus) {
		super(nimi);
		this.opiskelijaTunnus = opiskelijaTunnus;
	}
	
	public String annaTunnus() {
		return opiskelijaTunnus;
	}
}
