package decorator_design_pattern;

public class ExtraChessDecorator extends ToppingsDecorator{

	
	public ExtraChessDecorator(BasePizza basePizza) {
		super(basePizza);
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc() + " , " + "ExtraCheese";
	}
	
	@Override
	public int getCost() {
		return pizza.getCost() + 10;
	}
	
}
