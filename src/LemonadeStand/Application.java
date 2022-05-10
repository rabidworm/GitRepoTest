package LemonadeStand;

import LemonadeStandModel.Customer;
import LemonadeStandModel.Order;
import LemonadeStandModel.Lemonade;

public class Application {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Mollie", "(999)999-9999");
        Customer customer2 = new Customer("William", "(888)888-8888");

        Order order1 = new Order(customer1);

        order1.addLemonade(new Lemonade(1, .5, 1, 5));
        order1.addLemonade(new Lemonade(1, .5, 1, 5));
        order1.addLemonade(new Lemonade(1, .5, 1, 5));
        order1.addLemonade(new Lemonade(1, .5, 1, 5));

        for (Lemonade l: order1.getLemonades()) {
            System.out.println(l.getPrice());
        }

        System.out.println(order1.getCustomer().getName());

        System.out.println(order1.getTotal());

        Order order2 = new Order(customer2);

        order2.addLemonade(new Lemonade(1, 2.5, 1, 5));
        order2.addLemonade(new Lemonade(3, .5, 1, 5));
        order2.addLemonade(new Lemonade(1, 4, .5, 5));
        order2.addLemonade(new Lemonade(2, 1.5, 1.75, 5));

        for (Lemonade l: order2.getLemonades()) {
            System.out.println(l.getPrice());
        }

        System.out.println(order2.getCustomer().getName());

        System.out.println(order2.getTotal());

    }
}
