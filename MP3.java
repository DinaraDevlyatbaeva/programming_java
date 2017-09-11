public class MP3 {
    public static final String A = "Значение глобальной константы метода";
    public static void main(String[] args){
        final String B = "Значение локальной константы метода";
        final String b = "Значение локальной константы метода";
	String c = "Значение локальной переменной метода";
        System.out.println(A);
	System.out.println(B);
	System.out.println(b);
	System.out.println(c);
    }
}

