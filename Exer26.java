import java.util.Scanner;

public class Exer26{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite um numero");
		int number=leitor.nextInt();
		System.out.println("o quadrado deste numero e "+ (number*number));
		System.out.println("o cubo deste numero e "+ (number*number*number));
		System.out.println("a raiz quadrada e "+ (Math.sqrt(number)));
		System.out.println("a raiz cubica e "+ (Math.cbrt(number)));
						
	 }
}