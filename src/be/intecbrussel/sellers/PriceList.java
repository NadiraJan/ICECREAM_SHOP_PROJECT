package be.intecbrussel.sellers;

import be.intecbrussel.eatables.MagnumType;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;


    public PriceList() {

    }

    public PriceList(double ballPrice, double rocketPrice,
                     double magnumStandardPrice) {

        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }


    public double getBallPrice() {
        return ballPrice;
    }


    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }


    public double getRocketPrice() {
        return rocketPrice;
    }


    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }


    public void setMagnumStandardPrice(double magnumStandardPrice) {

        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getMagnumStandardPrice(MagnumType type) {

        switch (type) {
            case MILKCHOCOLATE:
                return magnumStandardPrice * 1.55;
            case WHITECHOCOLATE:
                return magnumStandardPrice * 1.65;
            case BLACKCHOCOLATE:
                return magnumStandardPrice * 1.49;
            case ALPHINENUTS:
                return magnumStandardPrice * 2.45;
            case ROMANTICSTRAWBERRIES:
                return magnumStandardPrice * 3.90;
            default:

                return magnumStandardPrice;

        }


    }
}


