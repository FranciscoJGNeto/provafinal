package Ex09;

public enum Valid {
	A{
		void calcular(int i){
			System.out.println(i / 2);
		}
	},
	B{
		void calcular(int i){
			System.out.println(i / 3);
		}
	};
	abstract void calcular(int i);
}
