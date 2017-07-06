package Ex08;

public class Ex08 {
	public static void main(String[] args) {
		int ii = 167436;
		char[] c = String.valueOf(ii).toCharArray();
		int j = 0;
		for (char cc : c) {
			int i = Integer.parseInt(String.valueOf(cc));
			if (i > j)
				j = i;
			else
				j--;
		}
		System.out.println(j);
	}
}
