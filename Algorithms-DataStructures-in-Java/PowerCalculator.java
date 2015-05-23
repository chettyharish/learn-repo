package DataStructures;

public class PowerCalculator {

	public long Powfull(long x, int n) {

		if (n == 0) {
			return 1;
		} else {
			return x * Powfull(x, n - 1);
		}

	}

	public long Powsplit(long x, int n) {
		long y = 0l;
		if (n == 0) {
			return 1;
		} else if (n % 2 == 0) {
			y = Powsplit(x, n / 2);
			return y * y;
		} else {
			y = Powsplit(x, n - 1);
			return x * y;
		}

	}

	public int mod(int x, int n, int mod) {
		int y = 0;
		if (n == 0) {
			return 1;
		} else if (n % 2 == 0) {
			y = mod(x, n / 2, mod);
			return (y * y) % mod;
		} else {
			return ((x % mod) * mod(x, n - 1, mod)) % mod;
		}

	}

	public static void main(String[] args) {

		PowerCalculator p = new PowerCalculator();

		System.out.println(p.mod(25, 19, 10));

	}

}
