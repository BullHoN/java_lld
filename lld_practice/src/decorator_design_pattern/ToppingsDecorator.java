package decorator_design_pattern;

public abstract class ToppingsDecorator extends BasePizza{
	
	protected BasePizza pizza;
	
	public ToppingsDecorator(BasePizza pizza) {
		this.pizza = pizza;
	}

}
