import java.util.Scanner;

public class Exer29{
	
	 public static void main(String[] args)
	 {
		Scanner reader=new Scanner(System.in);
                System.out.println("digite o valor de deposito");
		float put_on=reader.nextFloat();
		System.out.println("digite o valor dos dois cheques");
		float check_one=reader.nextFloat();
		float check_two=reader.nextFloat();
		double percent38=((put_on*0.38)/100);
	        double update=put_on-check_one-check_two-(2*percent38);
		System.out.println("o seu saldo e = "+ update);
	 }
}