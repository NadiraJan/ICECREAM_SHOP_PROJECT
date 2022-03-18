package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {

    private PriceList priceList;
    private static double totalProfit;

    public IceCreamSalon() {

    }

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }

    public static double getTotalProfit() {
        return totalProfit;
    }

    public static void setTotalProfit(double totalProfit) {
        IceCreamSalon.totalProfit = totalProfit;
    }

    @Override
    public void getProfit(double profit) {

    }

    @Override
    public Cone orderCone(Flavor[] balls) {
        Cone iceCone = new Cone(balls);
        totalProfit += priceList.getBallPrice() * balls.length;
        return iceCone;
    }

    @Override
    public IceRocket orderIceRocket() {

        IceRocket iceRocket = new IceRocket();
        totalProfit += priceList.getRocketPrice();
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        Magnum magnum = new Magnum(type);
        totalProfit += priceList.getMagnumStandardPrice(type);
        return magnum;
    }


    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';

    }

}