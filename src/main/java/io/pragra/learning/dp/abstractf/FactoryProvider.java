package io.pragra.learning.dp.abstractf;

public class FactoryProvider {
    public static AbstractTimFactory getFactory(FactoryType type){
        if(type==FactoryType.SNACK){
            return new SnackFactory();
        }else{
            return new CoffeeFactory();
        }
    }
}
