package pizza.crust;

public class ThickCrust extends PizzaCrust {
	private Boolean isDeepDish;

	@Override
	public String toString() {
		return "Thick Crust";
	}

	public String toNiceString() {
		return super.toNiceString() + (this.isDeepDish ? " (Deep Dish)" + " $" + this.getPrice(): "");
	}

	public Boolean getIsDeepDish() {
		return this.isDeepDish;
	}
	
	public void setIsDeepDish(Boolean isDeepDish) {
		this.isDeepDish = isDeepDish;
	}
	@Override
	public String checkIntegrity() {
		return this.ingredient.equalsIgnoreCase("Cauliflower")?
			"Handle Carefully: Crust might fall apart" :
			super.checkIntegrity();
	}
}