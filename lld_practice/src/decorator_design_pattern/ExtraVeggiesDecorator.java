package decorator_design_pattern;

public class ExtraVeggiesDecorator extends ToppingsDecorator{

	
	public ExtraVeggiesDecorator(BasePizza basePizza) {
		super(basePizza);
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc() + " , " + "ExtraVeggies";
	}
	
	@Override
	public int getCost() {
		return pizza.getCost() + 10;
	}
	
}
