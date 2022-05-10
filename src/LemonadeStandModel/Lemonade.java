package LemonadeStandModel;

public class Lemonade {

    private double lemonJuice;
    private double water;
    private double sugar;
    private int iceCubes;
    private final int cup = 1;
    private double price;

    public Lemonade(double lemonJuice, double water, double sugar, int iceCubes) {
        super();
        this.lemonJuice = lemonJuice;
        this.water = water;
        this.sugar = sugar;
        this.iceCubes = iceCubes;
        calculatePrice();
    }

    private void calculatePrice() {
        price = (lemonJuice * .3) + (sugar * .15) + (cup * .5);

    }

    public double getPrice() {
        return price;
    }

    public double getLemonJuice() {
        return lemonJuice;
    }

    public double getWater() {
        return water;
    }

    public double getSugar() {
        return sugar;
    }

    public int getIceCubes() {
        return iceCubes;
    }

    public int getCup() {
        return cup;
    }
}
