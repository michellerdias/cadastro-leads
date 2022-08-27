package leads;

public class lead {
	String nome, cpf, tel, nasc, email, curso;
	
	public lead() {
		
	}
	public lead(String nome, String tel, String nasc, String cpf, String email, String curso){
		setNome(nome);
		setTel(tel);
		setNasc(nasc);
		setCpf(cpf);
		setEmail(email);
		setCurso(curso);
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getNasc() {
		return nasc;
	}
	public void setNasc(String nasc) {
		this.nasc = nasc;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	void listar(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.tel);
		System.out.println("Data de Nascimento: " + this.nasc);
		System.out.println("CPF: " + this.cpf);
		System.out.println("E-mail: " + this.email);
		System.out.println("Curso: " + this.curso);
		System.out.println("\n--------------------------------");
	}
}
