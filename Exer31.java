import java.util.Scanner;

public class Exer31{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite o seu salario minimo e a quantidade de quilowatts");
		Float min_salary=leitor.nextFloat();
		int quantity=leitor.nextInt();
		float each=min_salary/5;
		System.out.println("o valor de cada quilowatt e "+ each);
		float pay=each*quantity;
		System.out.println("o valor que esta residencia deve pagar e "+ pay);
		System.out.println("o valor a ser pago com disconto de 15% e "+ (pay-((pay*15)/100)));
	 }
}