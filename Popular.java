import java.util.Scanner;

public class Popular {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your text here: ");
		String text = scan.next();
		System.out.println((char) getP(text));
	}

	private static int getP(String text) {
		int[] all = new int[26];
		int sz = text.length();
		int count = 0;
		int position = 0;
		int former = 0;
		while (count <= sz - 1) {
			int num = text.charAt(count) - 97;
			all[num] += 1;
			// System.out.println(all[num] + " " + former);
			if (all[num] > former) {
				former = all[num];
				position = text.charAt(count);
			}
			count++;
		}
		System.out.println(count);
		return position;
	}
}
