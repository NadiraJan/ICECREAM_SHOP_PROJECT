package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
    private Stock stock;
    double profit;


    public IceCreamCar(PriceList priceList, Stock stock) {
        super();
        this.priceList = priceList;
        this.stock = stock;
    }

    public IceCreamCar(Stock stock) {
        this.stock = stock;
    }

    public Stock getStock() {
        return stock;
    }

    private void prepareCone() {

    }

    private void prepareIceRocket() {

    }

    private void prepareMagnumType() {

    }

    @Override
    public Cone orderCone(Flavor[] balls) {
        Cone iceCone = new Cone(balls);
        profit += priceList.getBallPrice() * balls.length;
        return iceCone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        profit += priceList.getRocketPrice();

        return iceRocket;

    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        Magnum magnum = new Magnum(type);
        profit += priceList.getMagnumStandardPrice(type);
        return magnum;
    }

    @Override
    public String toString() {
        return "IceCreamCar{" +
                "priceList=" + priceList +
                ", stock=" + stock +
                ", profit=" + profit +
                '}';
    }
}


