interface Restaurant
{
    void acceptOrder();
    void prepareFood();
    void deliverFood();
    void display();
}

class PizzaHut implements Restaurant
{
    private String customer;
    private String item;

    PizzaHut(String customer, String item)
    {
        this.customer = customer;
        this.item = item;
    }

    public void acceptOrder()
    {
        System.out.println(customer + " ordered " + item);
    }

    public void prepareFood()
    {
        System.out.println("Preparing Pizza...");
    }

    public void deliverFood()
    {
        System.out.println("Pizza Delivered.");
    }

    public void display()
    {
        System.out.println("\nRestaurant : Pizza Hut");
        System.out.println("Customer   : " + customer);
        System.out.println("Item       : " + item);
    }
}

class KFC implements Restaurant
{
    private String customer;
    private String item;

    KFC(String customer, String item)
    {
        this.customer = customer;
        this.item = item;
    }

    public void acceptOrder()
    {
        System.out.println(customer + " ordered " + item);
    }

    public void prepareFood()
    {
        System.out.println("Preparing Fried Chicken...");
    }

    public void deliverFood()
    {
        System.out.println("Chicken Delivered.");
    }

    public void display()
    {
        System.out.println("\nRestaurant : KFC");
        System.out.println("Customer   : " + customer);
        System.out.println("Item       : " + item);
    }
}

class BiryaniHouse implements Restaurant
{
    private String customer;
    private String item;

    BiryaniHouse(String customer, String item)
    {
        this.customer = customer;
        this.item = item;
    }

    public void acceptOrder()
    {
        System.out.println(customer + " ordered " + item);
    }

    public void prepareFood()
    {
        System.out.println("Preparing Hyderabadi Biryani...");
    }

    public void deliverFood()
    {
        System.out.println("Biryani Delivered.");
    }

    public void display()
    {
        System.out.println("\nRestaurant : Biryani House");
        System.out.println("Customer   : " + customer);
        System.out.println("Item       : " + item);
    }
}

public class FoodDelivery
{
    public static void main(String[] args)
    {
		Restaurant restaurants[] = new Restaurant[3];
		 restaurants[0] = new PizzaHut("Mohasin", "Veg Pizza");
        restaurants[1] = new KFC("Rahul", "Chicken Bucket");
        restaurants[2] = new BiryaniHouse("Amit", "Chicken Biryani");

		for(Restaurant r : restaurants ){
			r.display();
            r.acceptOrder();
            r.prepareFood();
            r.deliverFood();

            System.out.println("----------------------------");
		}

    }
}