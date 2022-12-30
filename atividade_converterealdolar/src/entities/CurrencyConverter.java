package entities;

public class CurrencyConverter {
	public static String text ="";
	public static double DOLAR_VALUE = 3.10;
	public double dolar_bought;
	public double r;
	
	
	public double converte(double real) {
		r = DOLAR_VALUE * real;
		return r;
	}

	public String toString(){
		
		return text
				+ " O valor do dolar eh: "
			    + String.format("%.2f%n", DOLAR_VALUE)
			    + " O valor comprado eh "			   
			    + String.format("%.2f%n", dolar_bought)
			    + " O valor a ser convertido em reais eh "
			    + String.format("%.2f Reais", r);  
	}
	
}
