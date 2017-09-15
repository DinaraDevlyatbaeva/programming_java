public class MP4 {
	public static void main(String[] args){
		final double a = 2.1;
		final double b = 5.3;
		final double c = 1.4;
		final double x = 1.2;
		double pow1 = Math.exp(2*x+b);
		double cos = Math.cos(c*x);
		double pow2 = Math.pow(x, 2);
		double pow3 = Math.pow(x,3);
		double term = ((Math.sqrt(pow1)-1.7*cos)/(Math.log10(pow2+a)))+pow3;
		System.out.println(term);
	}

}
