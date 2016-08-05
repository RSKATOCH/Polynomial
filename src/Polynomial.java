import java.util.Map;
import java.util.Scanner;

public class Polynomial {
	
	private double poly[]; 
	Polynomial(double arr[]) {
		this.poly = arr;
	}
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        System.out.println("Enter the degree of polynomial 1 : ");
        int p1Degree = in.nextInt();
        System.out.println("Enter the degree of polynomial 2 : ");
        int p2Degree = in.nextInt();
        
        int arraySize = (p1Degree > p2Degree ? p1Degree : p2Degree);
        arraySize++;
        System.out.println("\n\nEnter polynomial 1 : ");
        double[] p1Array = new double[arraySize]; 
        for(int i = p1Degree; i >= 0 ; i--){
               System.out.println("Co-efficient of x^" + i);
               p1Array[i] = in.nextDouble();
        }
        System.out.println();
        System.out.println("\n\nEnter polynomial 2 : ");
        double[] p2Array = new double[arraySize]; 
        for(int i = p2Degree; i >= 0 ; i--){
               System.out.println("Co-efficient of x^" + i);
               p2Array[i] = in.nextDouble();
        }
        
        Polynomial A = new Polynomial(p1Array);
        Polynomial B = new Polynomial(p2Array);
        
        Polynomial C = A.add(B);
        Polynomial D = A.subtract(B);
        Polynomial E = A.multiply(B);
        
        System.out.println(new Polynomial(arr).toString());
        System.out.println(D.toString());
        System.out.println(E.toString());
        
        System.out.println(A.toHTML());
        System.out.println(B.toHTML());
        System.out.println(C.toHTML());
        
        System.out.println(A.toLatex());
        System.out.println(B.toLatex());
        System.out.println(C.toLatex());
	}

	public String toString() {
		String polyString  = "";
		for(int i = poly.length - 1; i >= 0; i--) {
			if(poly[i] != 0) {
				if(i > 0) {
					polyString += signCoeff(poly[i]) + "x^" + i;
				}
				else {
					polyString += signCoeff(poly[i]);
				}
					
			}
		}
		
		return polyString;
	}
	
	private String signCoeff(double d) {
		// TODO Auto-generated method stub
		if(d < 0) {
			return " - " + d;
		} else {
			return " + " + d;
		}
			
	}


	private String toLatex() {
		// TODO Auto-generated method stub
		return null;
	}


	private String toHTML() {
		// TODO Auto-generated method stub
		return null;
	}


	private Polynomial multiply(Polynomial b) {
		// TODO Auto-generated method stub
		return null;
	}


	private Polynomial add(Polynomial b) {
		// TODO Auto-generated method stub
		return null;
	}


	private Polynomial subtract(Polynomial b) {
		// TODO Auto-generated method stub
		return null;
	}
        
 }
	
