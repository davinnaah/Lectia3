
public class Carti2 {

	public static void main(String[] args) {
		 
		Carte c1= new Carte ("Luke", "Gospel", 24);
		System.out.println(c1.toString());
		
		Carte c2 = new Carte("Joshua", "Historical", 24);
		c2.setNumberOfChapters(c2);
		System.out.println(c2);
	}

}
