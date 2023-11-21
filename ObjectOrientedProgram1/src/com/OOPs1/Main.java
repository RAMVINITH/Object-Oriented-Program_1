package com.OOPs1;
import java.util.*;
public class Main {

	public static void main(String[] args) throws ProductNOTFOUNDEXCEPTION, ArrayGotFulled {
		// TODO Auto-generated method stub
		Product p1=new Product(1,"Apple",100,3,5);
		Product p2=new Product(2,"Mango",200,4,10);
		Product p3=new Product(3,"Grape",100,5,40);
		Product p4=new Product(4,"Orange",70,6,30);
		Product p5=new Product(5,"Pineapple",250,7,20);
		
		Product prodArr[]=new Product[5];
		
		ProductDao dao=new ProductDao();
	// Adding products into Array	
		dao.add(prodArr,p1);
		dao.add(prodArr,p2);
		dao.add(prodArr,p3);
		dao.add(prodArr,p4);
		dao.add(prodArr,p5);
		
   //Deleting Product by using Product ID
//		prodArr=dao.deleteProd(5,prodArr);
			
   //Update Product by using Product ID
//		prodArr=dao.update(prodArr, 2, "Banana", 10, 5, 2); 
		
   //Search Product based on Product ID
//		System.out.println(dao.searchProductById(3,prodArr));
		
   //Search Product based on Product ID
//	    System.out.println(dao.searchProductByName("Apple",prodArr));
		
   //Display all product by ascending order of price
//		dao.displayProdByPrice(prodArr);
		
    //Display all product by ascending order of Discount
//		dao.displayProdByDiscount(prodArr);		
		
   // Display All Products
		dao.display(prodArr);

	}
	

}
