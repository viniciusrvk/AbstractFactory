public class DarkTheme implements AbstractFactory{

	Button button = new DarkButton();
	Bar bar = new DarkBar();
	@Override
	public Button getButton() {
		return button;
	}
	@Override
	public Bar getBar() {
		return bar;
	}
}
