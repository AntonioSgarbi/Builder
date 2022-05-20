package tech.antoniosgarbi;

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coca-Cola";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
