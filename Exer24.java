import java.util.Scanner;

public class Exer24{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite o seu salario base");
		int salary=leitor.nextInt();
		System.out.println("o salario a receber e de = "+ (salary+50-((salary*10)/100)));
						
	 }
}