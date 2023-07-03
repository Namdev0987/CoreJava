package in.co.rays;

public class devideby7 {
	public static void main(String[] args) {
		int a = 8;
		int count = 0;
		int s = 0;
		for (int i = 100; i <= 200; i ++) {
			if (i % 8 == 0) {
				count = i;
				System.out.println(count);
				s = s + count;
			}
		}
		System.out.println("sum is " + s);
	}
	

}
