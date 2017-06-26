package com.overloadingandoveriding;
/* This class will give us a example of overrriding */
public class MainClass {

	 static int calculate(int x,int y){  //Function with two arguments
		int add=x+y;
		return add;
	}
	
	 static int calculate(int x,int y,int z){	//Function with  more than three arguments hence method overloading
		 int product=x*y*z;
		 return  product;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result;
		int product;
		result=calculate(2,4);
		System.out.println("The result of the addtion is "+result);
		product=calculate(2,3,4);
		System.out.println("The product of the three integer is "+product);

		
		Parent parent=new Child();
		parent.display();	//Method is being overriden 
		
	}

}
