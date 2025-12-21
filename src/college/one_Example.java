package college;


	
	import java.util.*;
	public class one_Example{

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);


	     
	        System.out.println("Choose An 0peration:");
	        System.out.println(" 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Modulus");
	        System.out.println(" 6.Square \n 7.Cube \n 8.Circle Area \n 9.Rectangle Area \n 10.(A+B)^2");

	        int choice = scan.nextInt();
	        double a, b;

	        switch (choice) {
	            case 1:

	             {
	                System.out.print("Enter two numbers: ");
	                a = scan.nextDouble();
	                b = scan.nextDouble();
	                System.out.println("Addition: " + (a + b));
	                break;
	             }
	            case 2:
	            {
	                System.out.print("Enter two numbers: ");
	                a = scan.nextDouble();
	                b = scan.nextDouble();
	                System.out.println("Subtraction: " + (a - b));
	                break;
	            }
	            case 3:
	            {
	                System.out.print("Enter two numbers: ");
	                a = scan.nextDouble();
	                b = scan.nextDouble();
	                System.out.println("Multiplication: " + (a * b));
	                break;
	        }
	            case 4:
	            {
	                System.out.print("Enter two numbers: ");

	                a = scan.nextDouble();

	                b = scan.nextDouble();

	                if (b != 0)
	         
	                    System.out.println("Division: " + (a / b));

	                else
	                    System.out.println("you can't");
	                break;
	            }

	            case 5:
	            {
	                System.out.print("Enter two integers: ");

	                int x = scan.nextInt();

	                int y = scan.nextInt();

	                System.out.println("Modulus: " + (x % y));
	                break;

	            }
	            case 6:
	            {
	                System.out.print("Enter a number: ");

	                a = scan.nextDouble();

	                System.out.println("Square: " + (a * a));
	                break;
	            }
	            case 7:
	            {
	                System.out.print("Enter a number: ");

	                a = scan.nextDouble();

	                System.out.println("Cube: " + (a * a * a));
	                break;
	            }
	            case 8:
	            {
	                System.out.print("Enter radius of circle: ");

	                a = scan.nextDouble();

	                System.out.println("Circle Area: " + (22/7) * a * a);
	                break;
	            }
	            case 9:
	            {
	                System.out.print("Enter length and width: ");

	                a = scan.nextDouble();

	                b = scan.nextDouble();

	                System.out.println("Rectangle Area: " + (a * b));
	                break;
	            }
	            case 10:
	            {
	                System.out.print("Enter A and B: ");

	                a = scan.nextDouble();

	                b = scan.nextDouble();

	                double result = (a * a) + (b * b) + (2 * a * b);

	                System.out.println("(A+B)^2 = " + result);
	                break;
	            }
	            default:
	                System.out.println("Invalid option!");
	        }
	        scan.close();
	    }

	    
	}	


