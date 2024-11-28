public class Pizza {

    protected int price;
    private boolean veg;

    private int extraCheese = 100;
    private int extraToppings = 150; 
    private int bagPack = 20;

    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToopings = false;
    private boolean isOptedForTakeAway = false;


    Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }

        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        //System.out.println("Extra cheese added");
        this.price += extraCheese;
    }
    
    public void addExtraToppings() {
        isExtraToopings = true;
        //System.out.println("Extra toppings added");
        this.price += extraToppings;
    }
    
    public void takeAway() {
        isOptedForTakeAway = true;
        //System.out.println("Take-away opted");
        this.price += bagPack;
    }
    
    public void getBill() {
        String bill = "";
        System.out.println("Base pizza: " + this.basePizzaPrice);

        if (isExtraCheeseAdded) {
            bill += "Extra cheese added: " + this.extraCheese + "\n";
        }
        if (isExtraToopings) {
            bill += "Extra Toppings added: " + this.extraToppings + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take-Away: " + this.bagPack + "\n";
        }

        bill += "Total Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}