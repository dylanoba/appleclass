
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a = new Apple("red", 1.0);
		Apple b;
		b = new Apple("green", 2.0);
		
		System.out.println(a.color + " " + a.weight);
		System.out.println(b.color + " " + b.weight);
		
		System.out.println(a); // gives addresses
		System.out.println(b);
	
		Apple c = new Apple(3.0);
		
		System.out.println(c.color + " " + c.weight);
		System.out.println(c);
		
		System.out.println();
		
		a.rot();
		System.out.println(a.color + " " + a.weight);
		
		System.out.println();
		
		Apple.rotS(b);
		System.out.println(b.color + " " + b.weight);
		
		System.out.println();
		
		System.out.println(Apple.getNumApples());
		
		// nonstatic can access static stuff, but static cant access nonstatic stuff
		a.numApples = 100;
		System.out.println(Apple.getNumApples());
		
		Apple.isApple();
		
		System.out.println();
		
		System.out.println(a.isEdible());
		
		System.out.println(Apple.isEdibleS(c));
		
	}

}
