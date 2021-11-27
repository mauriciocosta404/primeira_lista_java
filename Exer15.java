import java.util.Scanner;

public class Exer15{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite os dois valores");
		int number1=leitor.nextInt();
		int number2=leitor.nextInt();
		int s=1;
		for(int c=1;c<=number2;c++){
                	s*=number1;}
		System.out.println(s);
						
	 }
}