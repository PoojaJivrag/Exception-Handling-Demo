package com.BikkadIT.controller;

import java.io.FileReader;
import java.util.ResourceBundle;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	// Arithmetic Exception
	@GetMapping("/greet")
	public String grretController() {
		String msg="Good Morning";
		
		int b=10/0;
		
		
		return msg;
	}
	
	
	// NullPointerException
	@GetMapping("/greet1")
	public String grretController1() {
		String msg="Good Evening";
		
		String s=null;
		System.out.println(s.length());
		return msg;
	}
	
	
	//ArrayStoreException
	
	@GetMapping("/greet2")
	public void grretController2() {
		
		Object[] array = new String[2];
        array[0] = 5;
	}
	
	// InputMismatchException
	@GetMapping("/greet3")
	public void grretController3() {
		
		
		 Scanner sc = new Scanner(System.in);  
		 System.out.println("Enter value of a to get its square value:");  
         Integer a = sc.nextInt(); // we give any float value as input    
         System.out.println((a*a));  
		 
	}
	
	//MissingResourceException
	
	
	@GetMapping("/greet4")
	public void grretController4() {
		
		ResourceBundle myResources = ResourceBundle.getBundle("resources");
	}
}