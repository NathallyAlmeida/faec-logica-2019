import java.util.Scanner;
public class MDC{
	
	public static void main (String[] args){
		Scanner num = new Scanner(System.in);
		int n, m;
		System.out.print("Valores de entrada: ");
		n = num.nextInt();
		m = num.nextInt();
		
		while (n<m){
			System.out.print("A segunda variavel deve ser maior que a primeira. Digite novamente: ");
			n = num.nextInt();
			m = num.nextInt();
			System.out.print("Valores de entrada: "+n+" "+m+" \n");
		}
		System.out.print("Valores de saida: "+n+" "+m+" "+" ");
		int resto = 0;
		while (n != 0){
			resto = (m % n);
			m = n;
			n = resto;
		}
		
		System.out.print(m);
	}
}