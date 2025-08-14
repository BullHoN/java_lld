package decorator_design_pattern;

public class VegDelightPizza extends BasePizza{
	
	@Override
	public String getDesc() {
		return "VegDelightPizza";
	}
	
	@Override
	public int getCost() {
		return 110;
	}

}
