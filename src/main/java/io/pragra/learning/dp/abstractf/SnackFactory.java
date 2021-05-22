package io.pragra.learning.dp.abstractf;

public class SnackFactory  extends AbstractTimFactory{
    @Override
    TimItem getItemFactory(ItemType type) {
       return  new Donut();
    }
}
