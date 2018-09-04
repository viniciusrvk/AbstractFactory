
public class DarkButton implements Button{
	String color = "Dark";
	@Override
	public void setColor(String ss) {
		color = ss;
	}
	@Override
	public String getColor() {
		return color;
	}

}
