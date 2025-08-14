package decorator_design_pattern;

public class MargartiaPizza extends BasePizza{
	
	
	@Override
	public String getDesc() {
		return "Margatia Pizza";
	}
	
	@Override
	public int getCost() {
		return 100;
	}

}
