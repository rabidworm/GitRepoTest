package LemonadeStandModel;

import java.util.Arrays;

public class Order {

    private Customer customer;

    private LemonadeStandModel.Lemonade[] lemonades;

    private double total;

    public Order(Customer customer) {
        super();
        this.customer = customer;
        lemonades = new LemonadeStandModel.Lemonade[0];
    }

    private void updateTotal() {
        total = 0.0;
        for (LemonadeStandModel.Lemonade l: lemonades) {
            total += l.getPrice();
        }
    }

    public void addLemonade(LemonadeStandModel.Lemonade lemonade) {
        LemonadeStandModel.Lemonade[] tempLemonades = Arrays.copyOf(lemonades, lemonades.length + 1);
        tempLemonades[tempLemonades.length - 1] = lemonade;
        lemonades = tempLemonades;
        updateTotal();
    }

    public Customer getCustomer() {
        return customer;
    }

    public LemonadeStandModel.Lemonade[] getLemonades() {
        return lemonades;
    }

    public double getTotal() {
        return total;
    }
}
