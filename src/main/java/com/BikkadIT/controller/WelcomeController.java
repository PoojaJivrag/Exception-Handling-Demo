package com.BikkadIT.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	// ArraysOutOfBoundException
	@GetMapping("/welcome")
	public void welcomeMsg() {
		
		String[] arr = {"Rohit","Shikar","Virat","Dhoni"};   
		                                     
		          
		        for(int i=0;i<=arr.length;i++) {       
		  
		 
		             System.out.println(arr[i]);      
	     
		}
		    
	}
	
	
	//NumberFormatException
	 @GetMapping("/welcome1")
     public void welcomeMsg1() {
      String inputString = "123.33";        
      int a = Integer.parseInt(inputString);  
     }
	 
	 
	 //StringIndexOutOfBoundsException
	 
	 @GetMapping("/welcome2")
     public void welcomeMsg2() {
		 String str = "My String";
	        System.out.println(str.charAt(9)); 
     }
	 
	 //NegativeArraySizeException
	 @GetMapping("/welcome3")
     public void welcomeMsg3() {
		 int[] array = new int[-5];
	        System.out.println("Array length: " + array.length);
     }
	 
	 //UnsupportedOperationException
	 
	 @GetMapping("/welcome4")
     public void welcomeMsg4() {
		 
		 String array[] = {"a", "b", "c"};
	        List<String> list = Arrays.asList(array);
	        list.add("d");
     }
	 
	 
	 
}
