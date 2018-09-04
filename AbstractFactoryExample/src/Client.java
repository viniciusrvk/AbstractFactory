public class Client {
	 public static void main(String[] args) {
		 AbstractFactory ab = new DarkTheme();
		 Button bt = ab.getButton();
		 Bar ba = ab.getBar();
		 System.out.println("Bar color = " + ba.getColor() + " Button color = " + bt.getColor());
	 }
}
