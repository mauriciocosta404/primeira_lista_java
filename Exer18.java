import java.util.Scanner;

public class Exer18{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite o preco do producto");
		int price=leitor.nextInt();
		System.out.println("o preco do novo producto e = "+ (price-((price*10)/100)));
						
	 }
}