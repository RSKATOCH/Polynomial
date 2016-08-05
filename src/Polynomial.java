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
        
        System.out.println(A.toString());
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


	private String toLatex(){
		
		String poly = latexCode();
		String latexcode = " \\ documentclass {article} \n \\begin {document}  \n \\ polynomial" + poly + "\\end{document}" ;
		return latexcode;
		 	
	}
	
	private String latexCode(){
		
		String polyStr = "{"; int i;
		
		for (i=0; i< poly.length ; i++){
			String s = Double.toString(poly[i]);
		    polyStr += s + ",";
		}	
		polyStr+="}";
		
		return polyStr;
		
	}


	private String toHTML() {
		String line1="<html><title>Polynomial</title><body>";
        String line2="";
        for(int i=0;i<poly.length;i++)
        {
        	line2 += signCoeff(poly[i]) + "<sup>" + i + "</sup>";
        }
        String line3="</body></html>";
        String line =line1+line2+line3;
        return line;
	}


	private Polynomial multiply(Polynomial b) {
		
		int totalLength = poly.length + b.poly.length - 1;
        double[] result = new double[totalLength];
        for (int i = 0; i < poly.length; i++)
            for (int j = 0; j < b.poly.length; j++) {
                result[i + j] += poly[i] * b.poly[j];
            }
        return new Polynomial(result);
		// TODO Auto-generated method stub
	}


	public Polynomial add(Polynomial p) {
			int outDegree = Math.max(p.poly.length, this.poly.length);
			double[] newArr = new double[outDegree];
			Polynomial output = new Polynomial(newArr);
			
			/*Adding the coefficients till the lower degree*/
			for (int i=0;i<this.poly.length;i++)
			{
			    output.poly[i]=this.poly[i];
			}
			for (int i=0;i<p.poly.length;i++)
			{
			    output.poly[i]+=p.poly[i];
			}
			return output;
	}
	
	public Polynomial subtract(Polynomial p){
		int outDegree = Math.max(p.poly.length, this.poly.length);
			double[] newArr = new double[outDegree];
			Polynomial output = new Polynomial(newArr);
			
			/*Subtracting the coefficients till the lower degree*/
			for (int i=0;i<this.poly.length;i++)
			{
			    output.poly[i]=this.poly[i];
			}
			for (int i=0;i<p.poly.length;i++)
			{
			    output.poly[i]-=p.poly[i];
			}
			return output;
	}
        
 }
	
