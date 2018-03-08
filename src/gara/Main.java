package gara;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gara gara = new Gara();
		Tren t1 = new Tren("AC1","10:01","Berlin");
		Tren t2 = new Tren("AC2","05:01","Munchen");
		Tren t3 = new Tren("AC3","16:01","Frankfurt");
		Tren t4 = new Tren("AC4","10:31","Dusseldorf");
		Tren t5 = new Tren("AC5","13:01","Koln");
		gara.add(t1);
		gara.add(t2);
		gara.add(t3);
		gara.add(t4);
		gara.add(t5);
		gara.list();
		
		System.out.println(gara.find("AC15"));
	}

}
