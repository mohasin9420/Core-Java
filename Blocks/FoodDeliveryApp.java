class FoodDeliveryApp
{
    public static void main(String[] args)
    {
        FoodOrder order1 = new FoodOrder("Mohasin", "Pizza", 299);

        FoodOrder.showAppName();

        order1.showOrderDetails();
    }
}

class FoodOrder
{
    // Static Variable
    static String appName = "Zomato";

    // Instance Variables
    String customerName;
    String foodItem;
    int foodPrice;

    // Static Block
    static
    {
        System.out.println("Food Delivery Server Started");
    }

    // Non-Static Block
    {
        System.out.println("Customer Session Created");
    }

    // Constructor
    FoodOrder(String customerName, String foodItem, int foodPrice)
    {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.foodPrice = foodPrice;

        System.out.println("Order Placed Successfully");
    }

    // Static Method
    static void showAppName()
    {
        System.out.println("App Name : " + appName);
    }

    // Instance Method
    void showOrderDetails()
    {
        // Local Variables
        int deliveryCharge = 40;
        int totalBill = foodPrice + deliveryCharge;

        System.out.println("Customer Name : " + customerName);
        System.out.println("Food Item : " + foodItem);
        System.out.println("Food Price : $" + foodPrice);
        System.out.println("Delivery Charge : $" + deliveryCharge);
        System.out.println("Total Bill : $" + totalBill);
    }
}