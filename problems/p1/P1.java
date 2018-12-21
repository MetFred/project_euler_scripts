import java.util.stream.IntStream;

public class P1 {
	public static void main(String[] args) {
		System.out.print(IntStream.range(1, 1000).filter(v -> v % 3 == 0 || v % 5 == 0).sum());
	}
}
