package Ex01;

public class Ex01 {
	public static void main(String[] args) {
		int num = 167436;
		String str = String.valueOf(num);
		int parc = Integer.parseInt(str.substring(4, 6));
		Gen g = new Gen(parc, num){
			public void imprime(){
				System.out.println((this.num % 2) + this.parc);
			}
		};
		parc = 0;
		g.imprime();
	}
}
