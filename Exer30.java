import java.util.Scanner;

public class Exer30{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite o peso do saco e a quantidade de racao que cada gato come");
		float weight=leitor.nextFloat();
		float quantity=leitor.nextFloat();
		quantity*=2;
		float convert=weight*1000;
		for(int c=0;c<5;c++){
		convert-=quantity;
		}
		System.out.println("em 5 dias restara  "+ (convert)+" gramas de racao no saco");
						
	 }
}