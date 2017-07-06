package Ex09;

public class Ex09 {
	public static void main(String[] args) {
		int ii = 167436;
		int idx = ii % 2;
		Valid v;
		if(idx == 0)
			v = Valid.A;
		else
			v = Valid.B;
		v.calcular(ii);
	}
}
