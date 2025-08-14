package decorator_design_pattern;

public class TestDecorator {

	public static void main(String[] args) {
		BasePizza pizza = new MargartiaPizza();
		pizza = new ExtraChessDecorator(pizza);
		pizza = new ExtraVeggiesDecorator(pizza);
		
		BasePizza pizza2 = new VegDelightPizza();
		pizza2 = new ExtraVeggiesDecorator(pizza2);
		
		System.out.println(pizza.getDesc());
		System.out.println(pizza2.getDesc());
	}

}
