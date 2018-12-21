public class P2 {
	public static void main(String[] args) {
    int r = 0;
    int a = 1;
    int b = 2;
    while (a <= 4000000) {
        if (a % 2 == 0)
            r += a;
        b = a + b;
        a = b - a;
    }
    System.out.print(r);
	}
}
