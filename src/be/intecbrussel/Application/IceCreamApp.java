package be.intecbrussel.Application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamApp {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(2.0, 2.30, 1.00);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);

        System.out.println();

        Eatable[] iceCreamArray = {iceCreamSalon.orderMagnum(MagnumType.BLACKCHOCOLATE),
                iceCreamSalon.orderMagnum(MagnumType.WHITECHOCOLATE),
                iceCreamSalon.orderMagnum(MagnumType.MILKCHOCOLATE),
                iceCreamSalon.orderMagnum(MagnumType.ALPHINENUTS),
                iceCreamSalon.orderMagnum(MagnumType.ROMANTICSTRAWBERRIES),
                iceCreamSalon.orderIceRocket(),
                iceCreamSalon.orderCone(new Flavor[]{Flavor.LEMON, Flavor.STRACIATELLA,
                        Flavor.MOKKA, Flavor.PISTACHE})};

        for (Eatable eatable : iceCreamArray) {
            System.out.println(eatable);

            eatable.eat();
            System.out.println();
        }

        System.out.println("TotalProfit is: " + IceCreamSalon.getTotalProfit());
    }

}