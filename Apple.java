
public class Apple {
	
	// fields, info that is stored for each object
	public String color;
	public double weight;
	public static int numApples;
	
	public Apple (String c, double w) { // constructor, cant be static, no output, always public
		color = c;
		weight = w;
		
		numApples++;
	}

	public Apple (double weight) {
		color = "red";
		this.weight = weight; // this keyword, means this object
		
		System.out.println(this); // this = c
		
		numApples++;
	}
	
	public void rot() { // method updates fields
		color = "brown";
		weight = weight / 2;
		
		System.out.println(this);
	}
	
	public static void rotS(Apple app) { // methods that operate on the entire class		
		app.color = "brown";
		app.weight = app.weight / 2;
		
		System.out.println(app);
	}
	
	public static int getNumApples() {
		return numApples;
	}
	
	public static boolean isApple() {
		return true;
	}
	
	public boolean isEdible() {
		return !(this.color.equals("brown"));
	}
	
	public static boolean isEdibleS(Apple app) {
		return !(app.color.equals("brown"));
	}
}
