package be.intecbrussel.Application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;


public class AppV2 {
    private static be.intecbrussel.sellers.PriceList PriceList;
    private static be.intecbrussel.sellers.Stock Stock;

    public static void main(String[] args) {
        PriceList priceList = new PriceList(1.7, 1.5, 1.0);
        IceCreamCar iceCreamCar = new IceCreamCar(PriceList, Stock);

        Eatable[] eatables = {iceCreamCar.orderMagnum(MagnumType.BLACKCHOCOLATE),
                iceCreamCar.orderMagnum(MagnumType.WHITECHOCOLATE),
                iceCreamCar.orderMagnum(MagnumType.MILKCHOCOLATE),
                iceCreamCar.orderMagnum(MagnumType.ALPHINENUTS),

                iceCreamCar.orderIceRocket(), iceCreamCar.orderIceRocket(),
                iceCreamCar.orderIceRocket(), iceCreamCar.orderIceRocket(),
                iceCreamCar.orderIceRocket(), iceCreamCar.orderIceRocket(),
                iceCreamCar.orderIceRocket(), iceCreamCar.orderIceRocket(),

                iceCreamCar.orderCone(new Flavor[]{Flavor.LEMON, Flavor.STRACIATELLA,
                        Flavor.MOKKA, Flavor.PISTACHE})};

        for (Eatable iceCreamArray : eatables) {

            System.out.println("IceCreamArray is " + iceCreamArray);

            iceCreamArray.eat();

        }
    }
}