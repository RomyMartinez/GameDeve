package ad;

public class MetodoConstructor {
	
	public int age = 5;
	public static String nome = "Romy";
	private int idade = 6;
	
	public int idadeP(){
		return idade;
	}
	
	public static void main(String[] args) {
		MetodoConstructor m = new MetodoConstructor();
		System.out.println(nome); 
		System.out.println(m.idadeP()); 
		System.out.print(m.age);
	}
	
}
