package denemeclass;

public class Main {
	
	public static void main(String[] args) {

		String Message = "Vade Oranı";

		Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("İmage1.jpg");
		
		

		Product product2 = new Product();

		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("İmage2.jpg");
		

		

		Product product3 = new Product();
		
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("İmage3.jpg");


		Product[] products = {product1, product2, product3};
		
		
		System.out.println("ul");

		for (Product product : products) {
			System.out.println("<li>"+product.getName() +"</li>");

          }
		System.out.println("</ul>");
		
		IndıvidualCustomer individualCustomer = new IndıvidualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("05545454");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Boran");
		individualCustomer.setLastName("Özdemir");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io"); //a
		corporateCustomer.setCustomerNumber(056343232);
		corporateCustomer.setTaxNumber(1234545321); //a
		corporateCustomer.setCustomerNumber(54321); //a
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
      }
  }









