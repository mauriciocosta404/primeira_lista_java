import java.util.Scanner;

public class Exer10{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite o valor da base menor ,base maior e a altura");
		int base_menor=leitor.nextInt();
		int base_maior=leitor.nextInt();
		int altura=leitor.nextInt();
                System.out.println("a area e = "+((base_maior+base_menor)*altura)/2);
						
	 }
}