import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("inserisci una stringa");
		String parola=in.nextLine();
		System.out.println(inversa(parola));
	}
	
	private static String inversa(String x){
	    String y="";
	    for (int i=x.length()-1; i>=0; i--){
	        y=y+x.charAt(i);
	    }
	    return y;
	}
}
