import java.lang.Math;

public class P3 {
	public static void main(String[] args) {
    long n = 600851475143L;
    int r = 0;
		for (int i = 3;i < Math.sqrt(n);i += 2) {
			while (n % i == 0) {
				r = i;
				n /= i;
			}
		}
    System.out.print(n > 2 ? n : r);
	}
}
