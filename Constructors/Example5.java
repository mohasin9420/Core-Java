class Example5 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Product prod1= new Product(1,"TEA" ,1200,5);
		prod1.displayProduct();
		Product.showProductCount();
		Product.showInventoryValue();
	}
}
class Product
{
   int productId;
   String productName;
   int price;
   int quantity;

   static String storeName = "DMart";
   static int totalProducts;
   static int totalInventoryValue;
	
	Product(   int productId, String productName,int price,int quantity){
   this.productId=productId;
   this.productName=productName;
   this.price=price;
   this.quantity=quantity;
   totalProducts++;
   totalInventoryValue+=price *quantity;

	}
	public void displayProduct(){
		System.out.println("Store name is " + storeName);
		System.out.println("Product id is "  +productId);
		System.out.println("Product name is " + productName);
		System.out.println("Product price is " + price);
		System.out.println("Product quantity is " + quantity);
	}
	static void showProductCount(){
		System.out.println(totalProducts);
		
	}
	static void  showInventoryValue(){
		System.out.println(totalInventoryValue);
	}
   
}
