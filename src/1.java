
public class Polynomial {
		double[] polynomial;
		public  Polynomial subtract(double[] coeffB){
			double[] coeffA = this.polynomial;
			int d = Math.max(coeffA.length, coeffB.length);
			Polynomial res = new Polynomial(d); //whatever the constructor takes
			for(int i=0;i<coeffA.length;i++){
				res.polynomial[i] = coeffA[i];
			}
			for(int i=0;i<coeffB.length;i++)
				res.polynomial[i] -= coeffB[i];
			return res;
			
		}
}


import java.util.Scanner;


public class Main {

       private static Scanner in;
       public static void main(String[] args) {
             in = new Scanner(System.in);
             
             
             System.out.println("Enter the degree of polynomial 1 : ");
             int p1Degree = in.nextInt();
             System.out.println("Enter the degree of polynomial 2 : ");
             int p2Degree = in.nextInt();
             
             int arraySize = (p1Degree > p2Degree ? p1Degree : p2Degree);
             arraySize++;
             //Polynomial P1 entry
             System.out.println("\n\nEnter polynomial 1 : ");
             double[] p1Array = new double[arraySize]; 
             for(int i = p1Degree; i >= 0 ; i--){
                    System.out.println("Co-efficient of x^" + i);
                    p1Array[i] = in.nextDouble();
             }
             System.out.println();
             printPolynomial(p1Array);
             
             //Polynomial P2 entry
             System.out.println("\n\nEnter polynomial 2 : ");
             double[] p2Array = new double[arraySize]; 
             for(int i = p2Degree; i >= 0 ; i--){
                    System.out.println("Co-efficient of x^" + i);
                    p2Array[i] = in.nextDouble();
             }
             System.out.println();
             printPolynomial(p2Array);
       }
       private static void printPolynomial(double[] pArray) {
             for(int i = pArray.length-1; i >= 0 ; i--){
                    if(pArray[i] != 0)
                    System.out.print(pArray[i] + "x^" + i + " ");
             }
       }

}
