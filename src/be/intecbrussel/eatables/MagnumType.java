package be.intecbrussel.eatables;

public enum MagnumType {

    MILKCHOCOLATE(1.55),
    WHITECHOCOLATE(1.65),
    BLACKCHOCOLATE(1.49),
    ALPHINENUTS(2.45),
    ROMANTICSTRAWBERRIES(3.90);

    private double price;

    MagnumType(double value){
        this.price = value;
    }

    public double getPrice(){
        return price;
    }
}

