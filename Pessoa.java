  public class Pessoa {
	String nome;
	String sobrenome;
	int idade;
	
	public Pessoa(String n, String sn, int i) {
		nome = n;
		sobrenome = sn;
		idade = i;
	}
	
	
	public String mostrar() {
		String saida = "";
		saida += "Nome: " +nome+ "\n";
		saida += "Sobrenome: "+ sobrenome+ "\n";
		saida += "Idade: "+ idade + "\n";
		return saida;
		
	}

}


//papeis do construtor : 1-criar um objeto    2-setar valores iniciais as propriedades      3-atribuir a variavel de referencia     
// "this" = nome do objeto
