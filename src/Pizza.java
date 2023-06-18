public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingPrice=150;
    private int backPackPrice=20;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg){
            this.price=300;
        }else {
            this.price=400;
        }
    }
//    public void getPizzaPrice(){
//        System.out.println(this.price);
//    }

    public void addExtraCheese(){
        System.out.println("Extra cheese added");
        this.price +=extraCheesePrice;

    }
    public void  addExtraToppings(){
        System.out.println("Extra toppings added");
        this.price +=extraToppingPrice;
    }
    public void takeAway(){
        System.out.println("take way on");
        this.price +=backPackPrice;
    }
    public void getBill(){
        System.out.println(this.price);

    }
}
