package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int extraTopping;
    private int paperBag;
    private int totalPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            totalPrice += 300;
            this.price = 300;
        }
        else{
            totalPrice += 400;
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isVeg){
            if(this.price == 300){
                this.extraCheese = 80;
                this.totalPrice += 80;
            }
        }
        if(!isVeg){
            if(this.price == 400){
                this.extraCheese = 80;
                this.totalPrice += 80;
            }
        }
    }

    public void addExtraToppings(){
        if(isVeg){
            if(this.price == 300){
                this.extraCheese = 70;
                this.totalPrice += 70;
            }
        }
        if(!isVeg){
            if(this.price == 400){
                this.extraCheese = 120;
                this.totalPrice += 120;
            }
        }
    }

    public void addTakeaway(){
        this.paperBag = 20;
        this.totalPrice += 20;
    }

    public String getBill(){
        this.bill += "Base Price Of The Pizza: " + this.price;
        if(extraCheese>0){
            this.bill += "\nExtra Cheese Added: "+this.extraCheese;
        }
        if(extraTopping>0){
            this.bill += "\nExtra Toppings Added: "+this.extraTopping;
        }
        if(paperBag>0){
            this.bill += "\nPaperbag Added: "+this.paperBag;
        }
        this.bill += "\nTotal Price: "  + this.totalPrice;
        return this.bill;
    }
}
