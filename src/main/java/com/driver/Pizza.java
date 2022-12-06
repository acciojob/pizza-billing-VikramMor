package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperbagAdded;
    private boolean isBillGenerated;
    private int extraCheese;
    private int extraTopping;
    private int paperBag;
    private int totalPrice;

    public Pizza(Boolean isVeg){
        this.isBillGenerated = false;
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isPaperbagAdded = false;
        this.extraCheese = 80;
        this.paperBag = 20;
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
            this.extraTopping = 70;
        }
        else{
            this.extraTopping = 120;
            this.price = 400;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            this.price += this.extraCheese;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded){
            this.price += this.extraTopping;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isPaperbagAdded){
            this.price += this.paperBag;
            isPaperbagAdded = true;
        }
    }

    public String getBill(){

        if(!isBillGenerated){
            isBillGenerated=  true;

            if(isCheeseAdded){
                this.bill += "Extra Cheese Added: " + this.extraCheese + "\n";
            }if(isToppingsAdded){
                this.bill += "Extra Toppings Added: " + this.extraTopping + "\n";
            }if(isPaperbagAdded){
                this.bill += "Paperbag Added: " + this.paperBag + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}
