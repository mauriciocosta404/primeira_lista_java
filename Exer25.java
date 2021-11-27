import java.util.Scanner;

public class Exer25{
	
	 public static void main(String[] args)
	 {
		Scanner reader=new Scanner(System.in);
                System.out.println("digite o valor de deposito e o valor da taxa de juros");
		int deposito=reader.nextInt();
		int juro=reader.nextInt();
		int rendimento=(deposito-juro);
		System.out.println("o valor de rendimento e = "+(rendimento));
                System.out.println("o valor total e = "+(deposito+rendimento));
	 }
}