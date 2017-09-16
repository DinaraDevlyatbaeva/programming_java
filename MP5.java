public class MP5 {
	public static void main(String[] args){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double x = Double.parseDouble(args[3]);
		double pow1 = Math.exp(2*x+b);
		double cos = Math.cos(c*x);
		double pow2 = Math.pow(x, 2);
		double pow3 = Math.pow(x,3);
		double term = ((Math.sqrt(pow1)-1.7*cos)/(Math.log10(pow2+a)))+pow3;
		System.out.println(term);
	}
}
