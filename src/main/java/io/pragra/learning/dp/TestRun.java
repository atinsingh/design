package io.pragra.learning.dp;

import io.pragra.learning.dp.abstractf.AbstractTimFactory;
import io.pragra.learning.dp.abstractf.FactoryProvider;
import io.pragra.learning.dp.abstractf.FactoryType;
import io.pragra.learning.dp.factory.BaseCoffee;
import io.pragra.learning.dp.factory.CoffeeFactory;
import io.pragra.learning.dp.factory.CoffeeType;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestRun {
    public static void main(String[] args) {
        SingleTon obj = SingleTon.getInstance();
        CoffeeFactory factory = new CoffeeFactory();
        BaseCoffee coffee = factory.getCoffee(CoffeeType.LATTE);
        System.out.println(coffee.cost());
        AbstractTimFactory timFactory = FactoryProvider.getFactory(FactoryType.SNACK);
        System.out.println(factory.getCoffee(CoffeeType.LATTE).cost());
    }
}
