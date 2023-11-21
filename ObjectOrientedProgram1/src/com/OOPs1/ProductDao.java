package com.OOPs1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductDao {
	
	public static Product[] add(Product prodArr[],Product newProd) throws ArrayGotFulled
	{
		for(int i=0;i<prodArr.length;i++)
		{
			if(prodArr[i]==null)
			{
				prodArr[i]=newProd;
				return prodArr;
			}
		}
		throw  new ArrayGotFulled();
		
		
	}
	
	public static void display(Product prodArr[])
	{
		int prodSize=prodArr.length;
		for(int i=0;i < prodSize;i++)
		{
			if(prodArr[i]!=null)
			System.out.println("Product ID= "+prodArr[i].getProdID()+", Product Name="+prodArr[i].getProdName()+", Price ="+prodArr[i].getPrice()+", Quantity ="+prodArr[i].getQuantity()+", Discount="+prodArr[i].getDiscount());
		}
	}
	public static Product[] update(Product prodArr[],int prodId,String prodName,int price,int quantity,int discount) throws ProductNOTFOUNDEXCEPTION
	{
		for(int i=0;i<prodArr.length;i++)
		{
			if(prodArr[i].getProdID()==prodId)
			{
				prodArr[i].setProdName(prodName);
				prodArr[i].setPrice(price);
				prodArr[i].setQuantity(quantity);
				prodArr[i].setDiscount(discount);
				return prodArr;
			}
		}
		throw new ProductNOTFOUNDEXCEPTION();
	}
	
	
	public static Product[] deleteProd(int prodId,Product prodArr[])throws ProductNOTFOUNDEXCEPTION
	{
		int prodSize=prodArr.length;
		Product prodArr2[]=new Product[prodSize+1];
		int flag=0,j=0;
		for(Product obj: prodArr)
		{   
			if(obj!=null)
			{
				if(obj.getProdID()==prodId)
					flag=1;
				else
					prodArr2[j++]=obj;
			
			}
		}
		if(flag==0)
			throw new ProductNOTFOUNDEXCEPTION();
		return prodArr2;
	}
	public static boolean searchProductById(int prodId,Product prodArr[]) throws ProductNOTFOUNDEXCEPTION
	{
		int prodSize=prodArr.length;
		
		for(int i=0;i<prodSize;i++)
		{
			if(prodArr[i].getProdID()==prodId-1)
			{
				return true;
			}
				
		}
		throw new ProductNOTFOUNDEXCEPTION();
	}
	public static boolean searchProductByName(String prodName,Product prodArr[]) throws ProductNOTFOUNDEXCEPTION
	{
		int prodSize=prodArr.length;
		for(int i=0;i<prodSize;i++)
		{
			if(prodName.equals(prodArr[i].getProdName()))
			{
				return true;
			}
				
		}
		throw new ProductNOTFOUNDEXCEPTION();
	}
	public static void displayProdByPrice(Product prodArr[])
	{
//		int size=prodArr.length;
//		Product prodArr2[]=prodArr;
//		for(int i=0;i<size;i++)
//		{
//			for(int j=i+1;j<size;j++)
//			{
//				
//				if(prodArr2[i].getPrice()>prodArr2[j].getPrice());
//				{
//					Product temp=prodArr2[i];
//					prodArr2[i]=prodArr2[j];
//					prodArr2[j]=temp;
//				}
//			}
//		}
//		
//		for(int i=0;i < size;i++)
//		{
//			
//			System.out.println("Product ID= "+prodArr2[i].getProdID()+", Product Name="+prodArr2[i].getProdName()+", Price ="+prodArr2[i].getPrice()+", Quantity ="+prodArr2[i].getQuantity()+", Discount="+prodArr2[i].getDiscount());
//		}
		
		List<Product> newList = Arrays.asList(prodArr);
		Collections.sort(newList, new Comparator<Product>() {
			public int compare(Product obj, Product obj1) {
				if(obj.getPrice()  > obj1.getPrice()) {
					return 1;
				}
				else if(obj.getPrice() == obj1.getPrice()) {
					return 0;
				}
				return -1;
 			}
		});

		for(Product obj : newList)
		System.out.println("Product ID= "+obj.getProdID()+", Product Name="+obj.getProdName()+", Price ="+obj.getPrice()+", Quantity ="+obj.getQuantity()+", Discount="+obj.getDiscount());
	}
	
	public static void displayProdByDiscount(Product prodArr[])
	{

		
		List<Product> newList = Arrays.asList(prodArr);
		Collections.sort(newList, new Comparator<Product>() {
			public int compare(Product obj, Product obj1) {
				if(obj.getDiscount()  > obj1.getDiscount()) {
					return 1;
				}
				else if(obj.getDiscount() == obj1.getDiscount()) {
					return 0;
				}
				return -1;
 			}
		});

		for(Product obj : newList)
		System.out.println("Product ID= "+obj.getProdID()+", Product Name="+obj.getProdName()+", Price ="+obj.getPrice()+", Quantity ="+obj.getQuantity()+", Discount="+obj.getDiscount());
	}


}
