package io.pragra.learning.dp.factory;

public class CoffeeFactory {
    public BaseCoffee getCoffee(CoffeeType type){
        switch (type) {
            case DD: {
                return new DoubleDouble();
            }
            case PUMPKIN:{
                return new PumpkinLatte();
            }
            case LATTE:{
                return new Latte();
            }
            default:{
                return new BlackCoffee();
            }
        }
    }
}
