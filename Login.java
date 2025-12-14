public Class Login {
	public static void main(String [] args) {
		System.out.println("Login atual")
		loginGenerico();
		loginDevelop();
		loginHMP();
		loginPRD();
		imprimirNome();
		imprimirNomeDevelop();
		imprimirNomeHMP();
		imprimirNomePRD();
	}
	
	public static void loginGenerico() {
		System.out.println("Login generico")
	}
	
	public static void loginDevelop() {
		System.out.println("Login develop")
	}
	
	public static void loginHMP() {
		System.out.println("Login HMP")
	}
	
	public static void loginPRD() {
		System.out.println("Login PRD")
	}
	
	public static void imprimirNome() {
		System.out.println("Nome")
	}
	
	public static void imprimirNomeDevelop() {
		System.out.println("NomeDevelop")
	}
	
	public static void imprimirNomeHMP() {
		System.out.println("NomeHMP")
	}
	
	public static void imprimirNomePRD() {
		System.out.println("NomePRD")
	}
}