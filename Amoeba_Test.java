public class Amoeba_Test
{
	public static void main(String [] args)
	{
		Amoeba frau1 = new Amoeba(true);
		Amoeba frau2 = new Amoeba(true);
		Amoeba mann1 = new Amoeba(false);
		Amoeba mann2 = new Amoeba(false);
		Amoeba mann3;
		Amoeba frau3;
		Amoeba mann4;
		Amoeba frau4;
		
		System.out.println("Test: feed feed hunger");
		System.out.println(" Mann1: Groesse: " + mann1.getSize() + "| weiblich? " + mann1.isFemale());
		mann1.feed();
		mann1.feed();
		mann1.hunger();
		System.out.println(" Mann1 Groesseneu: " + mann1.getSize() + "| weiblich? " + mann1.isFemale());
		
		System.out.println("Test:hunger");
		System.out.println(" frau1 Groesse: " + frau1.getSize() + "| weiblich? " + frau1.isFemale());
		frau1.hunger();
		System.out.println(" frau1 Groesseneu: " + frau1.getSize() + "| weiblich? " + frau1.isFemale());
		

		System.out.println();
		mann3 = mann2.split();
		System.out.println("Split unter 5 von Mann2: "+ "Mann3: " + mann3);
		mann2.setSize(10);
		mann3 = mann2.split();
		System.out.println("Split bei 10 von Mann2: " + "Mann2: " + "Groesse: " + mann2.getSize() + "| weiblich? " + mann2.isFemale());
		System.out.println("                        " + "Mann3: " + "Groesse: " + mann3.getSize() + "| weiblich? " + mann3.isFemale());
		frau2.setSize(11);
		frau3 = frau2.split();
		System.out.println("Split bei 11 von Frau2: " + "Frau2: " + "Groesse: " + frau2.getSize() + "| weiblich? " + frau2.isFemale());
		System.out.println("                        " + "Frau3: " + "Groesse: " + frau3.getSize() + "| weiblich? " + frau3.isFemale());
		
		System.out.println();
		mann4 = mann3.join(frau3);
		System.out.println("Join bei mann3 + frau 3(gleiche Groesse): " + "Mann 4: " + mann4);
		mann4 = mann3.join(mann3);
		System.out.println("Join bei mann3 + mann 3(gleiches Geschlecht): " + "Mann 4: " + mann4);
		frau4 = mann3.join(frau2);
		System.out.println("Join bei mann/frau(Groesser)" + "Frau4: " + "Groesse: " + frau4.getSize() + "| weiblich? " + frau4.isFemale());
		
		System.out.println();
		frau3.attack(mann2);
		System.out.println("Angriff von frau3 auf mann2(eine Frau): " + "Mann2: " + "Groesse: " + mann2.getSize() + "| weiblich? " + mann2.isFemale());
		System.out.println("                                        " + "Frau3: " + "Groesse: " + frau3.getSize() + "| weiblich? " + frau3.isFemale());
		frau2.attack(frau3);
		System.out.println("Angriff von Frau2 auf frau3(2 Frauen): " + "Frau2: " + "Groesse: " + frau2.getSize() + "| weiblich? " + frau2.isFemale());
		System.out.println("                                       " + "Frau3: " + "Groesse: " + frau3.getSize() + "| weiblich? " + frau3.isFemale());
		mann3.attack(mann2);
		System.out.println("Gleiche Groesse Angriff: " + "Mann2: " + "Groesse: " + mann2.getSize() + "| weiblich? " + mann2.isFemale());
		System.out.println("                       " + "Mann3: " + "Groesse: " + mann3.getSize() + "| weiblich? " + mann3.isFemale());
		mann3.attack(mann1);
		System.out.println("unterschiedl. Groesse Angriff:(+1) " + "Mann1: " + "Groesse: " + mann1.getSize() + "| weiblich? " + mann1.isFemale());
		System.out.println("                                 " + "Mann3: " + "Groesse: " + mann3.getSize() + "| weiblich? " + mann3.isFemale());
		
		
		
		
		
		
		
	
		
	}

}