package aplicacao;

import entidades.UsuarioSistema;

public class MainUsuario {

	public static void main(String[] args) {
		
		String[] permissoes = {"LEITURA", "ESCRITA"};
		
		UsuarioSistema usuario = new UsuarioSistema("admin", "1234", permissoes);
		
		if(usuario.autenticar("admin", "1234")) {
			System.out.println("Usuario autenticado com sucesso!");
			
			if(usuario.verificarPermissao("LEITURA")) {
				System.out.println("Usuario tem permissão para realizar leitura.");
			} else {
				System.out.println("Usuario NÃO tem permissão para realizar a leitura");
			}
			
			if(usuario.verificarPermissao("ESCRITA")) {
				System.out.println("Usuario tem permissão para realizar escrita");
			} else {
				System.out.println("Usuario NÃO tem permissão para realizar escrita");
			}
			
			if(usuario.verificarPermissao("DELETE")) {
				System.out.println("Usuario tem permissão para realizar delete");
			} else {
				System.out.println("Usuario NÃO tem permissão para realizar delete");
			}
		} else {
			System.out.println("Falha na autenticação");
		}
	}

}
