import java.util.Scanner;

public class MP6 {
	public static void main(String[] args){
		Scanner die = new Scanner(System.in);
		double a = die.nextDouble();
		double b = die.nextDouble();
		double c = die.nextDouble();
		double x = die.nextDouble();
		die.close();
		double pow1 = Math.exp(2*x+b);
		double cos = Math.cos(c*x);
		double pow2 = Math.pow(x, 2);
		double pow3 = Math.pow(x,3);
		double term = ((Math.sqrt(pow1)-1.7*cos)/(Math.log10(pow2+a)))+pow3;
		System.out.println(term);
	}
}
