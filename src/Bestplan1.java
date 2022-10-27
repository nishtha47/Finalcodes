import java.util.Scanner;

	import java.io.BufferedReader;
	import java.io.File;
	//import src.main.java.resources;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.InputMismatchException;
	import java.util.List;
	import java.util.Scanner;

	/**
	 *
	 * Java program to read files using Scanner class in Java.
	 * java.util.Scanner is added on Java 5 and offers a convenient method to read data
	 *
	 * @author
	 */
	public class Bestplan1 {

		   private static Scanner input;
		   private static Scanner inputparam;
		   static Scanner scn;
	    public static void main(String args[]) throws IOException {
	 
	        //creating File instance to reference text file in Java
	        File text = new File("C:\\Users\\NISHTHA MISHRA\\OneDrive\\Desktop\\ChallengeTest\\bestplanproject\\Finalcodes\\src\\example1.txt");
	     
	        //Creating Scanner instance to read File in Java\
	        boolean flag = false;
	   
	        input = new Scanner(System.in);
	        System.out.println("We have the following services:");
	        System.out.println("Voice, Database, Admin, Email");
	        System.out.println("How many services would you like?");

	        // input number of services
	       int choice = input.nextInt();
	        //String st = input.nextLine(); 

	        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	        // Logic starts here
	        // when number of services required is 1
	        switch (choice) {
	            case 1:
	                Scanner input1 = new Scanner(System.in);
	                System.out.println("What type of services would you like?");
	                System.out.println("1. Voice");
	                System.out.println("2. Database");
	                System.out.println("3. Admin");
	                System.out.println("4. Email");

	                // input 1 option
	                try
	                {
	                int choice1 = input1.nextInt();
	                

	                switch (choice1) {
	                case 1:
	                	
	                	System.out.println("You need to enter minimum 2 services to avail best plan");

	                    
	                }}
	                
	                catch (InputMismatchException e)
	            	{
	            		e.printStackTrace();
	            		System.out.println("Input choice in integer");
	            	}
	                break;

	            // when number of services required is 2
	            case 2:
	                Scanner input2 = new Scanner(System.in);
	                System.out.println("what is the file path");
	                String text2 = "";
	                try{
	                    scn = new Scanner(new File("C:\\Users\\NISHTHA MISHRA\\OneDrive\\Desktop\\ChallengeTest\\bestplanproject\\Finalcodes\\src\\example1.txt"));
	                }catch(FileNotFoundException ex){System.out.println(ex.getMessage());}
	                while(scn.hasNext()){
	                    text2 += scn.next();
	                    }
	                    String[] arry2 = text2.split(",");
	                    
	                    System.out.println(Arrays.toString(arry2));
	                System.out.println("What type of services would you like?");
	                System.out.println("1. Voice");
	                System.out.println("2. Database");
	                System.out.println("3. Admin");
	                System.out.println("4. Email");

	                // input 2 options
	               // int choice2 = input2.nextInt();
	                //int choice3 = input2.nextInt();
	                Scanner ser=new Scanner(System.in);
	                String s1= ser.nextLine();
	                String s2= ser.nextLine();
	              //  String s3= ser.nextLine();
	               // {
	                
	                if (Arrays.toString(arry2).contains(s1) && Arrays.toString(arry2).contains(s2)) {
	                    flag = true;
	                    System.out.printf ("Best plan for you\n");

	                // plan(1,4) -> $100
	              
	                    if (s1.contains("voice") && s2.contains("email" )) {
	        				System.out.println("100,PLAN1");
	                    }
	                    // plan(1,3) -> $125
	                    else if(s1.contains("voice") && s2.contains("admin"))
	                    {
	                    	System.out.println("125,PLAN3");
	                    }

	                    // plan(2,3) & (3,4) -> $150
	                    else if((s1.contains("database") && s2.contains("admin") || (s1.contains("admin") && s2.contains("email"))))
	                    		{
	                    	System.out.println("150,PLAN2");
	                    		}
	       
	                    else
	                    	System.out.println("Invalid option. Please try again");
	                }

	                  break;

	            // when number of services required is 3
	            case 3:
	                Scanner input3 = new Scanner(System.in);
	                System.out.println("what is the file path");
	                String text1 = "";
	                try{
	                    scn = new Scanner(new File("C:\\Users\\NISHTHA MISHRA\\OneDrive\\Desktop\\ChallengeTest\\bestplanproject\\Finalcodes\\src\\example1.txt"));
	                }catch(FileNotFoundException ex){System.out.println(ex.getMessage());}
	                while(scn.hasNext()){
	                    text1 += scn.next();
	                    }
	                    String[] arry = text1.split(",");
	                    
	                    System.out.println(Arrays.toString(arry));
	                  
	                //nput3.nextLine()
	                System.out.println("What type of services would you like?");
	                System.out.println("1. Voice");
	                System.out.println("2. Database");
	                System.out.println("3. Admin");
	                System.out.println("4. Email");
	                input3.useDelimiter("([,\\n])");
	                      
	                
	               // System.out.println("enter first input");
	                Scanner ser1=new Scanner(System.in);
	               // String ch1 = input1.nextLine();
	                // input 3 options
	                boolean valid=false;
	                System.out.println("Enter unique value of service for each input");
	              
	               while(!valid)
	               {
	                	
	                	 String s11= ser1.nextLine();
	                     String s22= ser1.nextLine();
	                     String s33= ser1.nextLine();
	                     if(s11.equals(s22) || s11.equals(s33) || s11.equals(s33))
	                     {
	                    	 valid=false;
	                    	 System.out.println("enter next value");
	                    
	                
	        
	                    	  s11= ser1.nextLine();
	                     s22= ser1.nextLine();
	                       s33= ser1.nextLine();
	                
	                
	               // {
	             
	                    
	           
	            
	                     }
	            else
	                     {
	                    	 System.out.println("Succesful value entered");
	                    	 
	                    	   if (Arrays.toString(arry).contains(s11) && Arrays.toString(arry).contains(s22) && Arrays.toString(arry).contains(s33)) {
	                               flag = true;
	                               System.out.printf ("Best plan for you!!!\n");
	                               
	                    
	                           //    if (s11.contains("voice") && s22.contains("admin" )&& s33.contains("email"))
	                              	 if ((s11.contains("voice")|| s11.contains("email") || s11.contains("admin")) && s22.contains("admin") || (s22.contains("email") || s22.contains("voice")) && (s33.contains("admin") || s33.contains("voice")|| s33.contains("email")))
	                              		 
	           {
	                   				System.out.println("225,PLAN1,PLAN3 ");
	                               }

	                               // plan(1,2,3) -> $235
	                           // else if (s11.contains("voice") && s22.contains("database") && s33.contains("admin"))
	                           	 else if ((s11.contains("voice")|| s11.contains("database") || s11.contains("admin")) && s22.contains("admin") || (s22.contains("database") || s22.contains("voice")) && (s33.contains("admin") || s33.contains("voice")|| s33.contains("database")))
	                           	
	                           {
	                               System.out.println("$235,PLAN1");

	                               // plan(2,3,4) -> $150
	                           } else if ((s11.contains("email")|| s11.contains("database") || s11.contains("admin")) && s22.contains("admin") || (s22.contains("database") || s22.contains("email")) && (s33.contains("admin") || s33.contains("email")|| s33.contains("database")))
	                           {
	                               System.out.println("$150,PLAN2");

	                           } else
	                               System.out.println("Invalid option. Please try again");

	                           }
	                     }}
	                
	                break;
	        			
	                   
	            case 4:
	            	Scanner input4 = new Scanner(System.in);
	                System.out.println("what is the file path");
	                String text4 = "";
	                try{
	                    scn = new Scanner(new File("C:\\Users\\NISHTHA MISHRA\\OneDrive\\Desktop\\ChallengeTest\\bestplanproject\\Finalcodes\\src\\example1.txt"));
	                }catch(FileNotFoundException ex){System.out.println(ex.getMessage());}
	                while(scn.hasNext()){
	                    text4 += scn.next();
	                    }
	                    String[] arry4 = text4.split(",");
	                    
	                    System.out.println(Arrays.toString(arry4));
	                  
	                //nput3.nextLine()
	                System.out.println("Enter all 4 services like?");
	                System.out.println("1. Voice");
	                System.out.println("2. Database");
	                System.out.println("3. Admin");
	                System.out.println("4. Email");
	                input4.useDelimiter("([,\\n])");
	                      
	                
	               // System.out.println("enter first input");
	                Scanner ser4=new Scanner(System.in);
	               // String ch1 = input1.nextLine();
	                // input 3 options
	                
	                String s41= ser4.nextLine();
	                String s42= ser4.nextLine();
	                String s43= ser4.nextLine();
	                String s44= ser4.nextLine();
	               // {
	                if (Arrays.toString(arry4).contains(s41) && Arrays.toString(arry4).contains(s42) && Arrays.toString(arry4).contains(s43) && Arrays.toString(arry4).contains(s44)) {
	                    flag = true;
	                    System.out.printf ("Best plan for you\n");
	                    
	                //    int price;
	                    System.out.println("enter choice for 4 services");
	                    inputparam = new Scanner(System.in);
	                    int price = inputparam.nextInt();
	                    
	                    
	                    switch(price)
	                    
	                    {
	                    	case 1: 
	                				System.out.println("235,PLAN1,PLAN4 ");
	                    		break;
	                    			
	                    	case 2:
	                    
	                    	 System.out.println("275,PLAN2,PLAN3");
	                    		break;

	                    	case 3:
	                    
	                    	 System.out.println("250,PLAN1,PLAN2");
	                    		break;

	                    	default:
	                    		  System.out.println("410,PLAN2,PLAN3,PLAN4");
	                    
	            			break;
	                    }}
	                break;

	            default:
	            			System.out.println("Invalid input.");
	            	

	        
	                
	                
	    }}
	}
	             
	    
	  
	    
	  


