import java.util.Scanner;

public class Exer27{
	
	 public static void main(String[] args)
	 {
		Scanner reader=new Scanner(System.in);
                System.out.println("digite o preco de fabrica do carro");
		int price=reader.nextInt();
		System.out.println("digite o percentual de lucro e o percentual de imposto");
		float duty_percentual=reader.nextFloat();
		float profit_percentual=reader.nextFloat();
		float a=((price*profit_percentual)/100);
		float b=((price*duty_percentual)/100);
		System.out.println("o valor correspondente ao percentual de lucro e "+ ((price*profit_percentual)/100));
		System.out.println("o valor correspondente ao percentual de impostos e "+ ((price*duty_percentual)/100));		      
		System.out.println("o preco final e "+ (price+a+b));              
						
	 }
}