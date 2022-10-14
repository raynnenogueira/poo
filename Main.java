
public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(); // criar um objeto; p=classe
		
		System.out.println(p.mostrar());
		
		Pessoa p2 = new Pessoa(); // criou outro objeto
		p.nome = "Jose";
		p.sobrenome = "Carvalho";
		p.idade = 19;
		
		System.out.println(p2.mostrar());
 		
	}

}
