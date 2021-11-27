import java.util.Scanner;

public class Exer19{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite o seu salario e o pecentual de almento");
		int salary=leitor.nextInt();
		int add=leitor.nextInt();
		System.out.println("o seu novo salario e = "+ (salary+((salary*add)/100)));
						
	 }
}