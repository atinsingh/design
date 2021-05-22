package io.pragra.learning.dp.abstractf;

public class CoffeeFactory extends AbstractTimFactory{
    @Override
    TimItem getItemFactory(ItemType type) {
        return new DarkRoast();
    }
}
