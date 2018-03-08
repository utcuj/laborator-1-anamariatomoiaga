package gara;

import java.util.ArrayList;
import java.util.List;

public class Gara {
	public List<Tren> gara;
	public Gara() {
		gara = new ArrayList<Tren>();
	}
	public void add(Tren t) {
		gara.add(t);
	}
	public void list() {
		for(Tren t : gara) {
			System.out.println(t.toString());
		}
	}
	public String find(String cod) {
		int i=0;
		Tren t1= new Tren();
		for(Tren t : gara) {
			if(t.getCod().equals(cod)) {
				t1=new Tren(t.getCod(),t.getOra(),t.getDestinatia());
				i=1;
			}
		}
		if(i==0)
			return "Trenul nu a fost gasit";
		else
			return t1.toString();
			
	}

}
