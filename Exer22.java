import java.util.Scanner;

public class Exer22{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite o seu salario fixo e o valor de vendas");
		int salary=leitor.nextInt();
		int sell_value=leitor.nextInt();
		int sell_comition=((sell_value*4)/100);
		System.out.println("o seu novo salario e = "+ (salary+sell_comition));
						
	 }
}