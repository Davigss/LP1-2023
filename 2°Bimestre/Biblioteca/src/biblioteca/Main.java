package biblioteca;

import usuarios.Dono;
import usuarios.Funcionario;
import usuarios.Livro;

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca("Livraria Leitura", new Dono("Davi Gomes", 47598780990L, 9848754783L));

		System.out.printf("Biblioteca '%s'\n", biblioteca.getNome());
		System.out.printf("Dono atual: '%s'\n\n", biblioteca.getDono());

		biblioteca.addFuncionario(new Funcionario("Mister  Rocha", 147194593915L, 295810583L, "Bibliotecario chefe"));
		biblioteca.addFuncionario(new Funcionario("Cucorucho", 12958693953L, 1294024059L, "Faxineira"));
		biblioteca.addLivros(new Livro("Herobrine: A Lenda", "Tazercraft", 2016));
		biblioteca.addLivros(new Livro("O Grande Irmão", "George Orwell", 1984));
		biblioteca.addLivros(new Livro("Deuses de Neon", "Karee Robert", 2021));
		biblioteca.mostraFuncionario();
		biblioteca.mostraLivros();

	}
}
