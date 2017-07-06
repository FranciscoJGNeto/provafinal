package Ex10;

public class Ex10 {
	public static void main(String[] args) {
		int ra = 167436;
		int num = (ra % 3) + 8;
		X x1 = new X(num);
		X.setMod(X.getMod() + 1);
		X x2 = new X(num);
		X.setMod(X.getMod() + 1);
		X x3 = new X(num);
		X.setMod(X.getMod() + 1);
		X x4 = new X(num);
		X.setMod(num);
		
		x1.execute(num);
	}
}
class X{
	public static int mod = 10;
	
	public X (int i){
		mod = i;
	}
	
	public static void execute(Integer ii){
		System.out.println(ii + getMod());
	}
	public static int getMod(){
		return mod;
	}
	public static void setMod(int mod){
		X.mod = mod;
	}
}
