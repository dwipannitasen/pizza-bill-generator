public class DeluxPizza extends Pizza {

    private int extraCharge = 100;

    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
        addExtraCharge();
    }

    private void addExtraCharge() {
        System.out.println("Adding additional charge for Delux Pizza: " + extraCharge);
        super.price += extraCharge;
    }

    @Override
    public void addExtraCheese() {
    };
    @Override
    public void addExtraToppings() {
    };
}
