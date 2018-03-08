package gara;

public class Tren{
	public String cod;
	public String ora;
	public String destinatia;
	public Tren(String cod, String ora, String destinatia) {
		// TODO Auto-generated constructor stub
		this.cod=cod;
		this.ora=ora;
		this.destinatia=destinatia;
	}
	public Tren() {
		
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getOra() {
		return ora;
	}
	public void setOra(String ora) {
		this.ora = ora;
	}
	public String getDestinatia() {
		return destinatia;
	}
	public void setDestinatia(String destinatia) {
		this.destinatia = destinatia;
	}
	public String toString() {
		return cod+" " + ora+" " + destinatia;
	}
	

}
