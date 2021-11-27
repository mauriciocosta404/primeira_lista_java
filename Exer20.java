import java.util.Scanner;

public class Exer20{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite o custo do espetaculo e o preco do convite");
		int cost=leitor.nextInt();
		int price=leitor.nextInt();
		int price_add=0;
		int cont=0;
		while(cost>price_add){
		price_add+=price;
		cont++;
		}
		System.out.println("e necessario venderes "+cont+" convites");
						
	 }
}