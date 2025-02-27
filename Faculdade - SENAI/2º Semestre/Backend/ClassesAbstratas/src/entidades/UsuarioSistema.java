package entidades;

public class UsuarioSistema implements Autentica, Autoriza {
	
	private String usuario;
	private String senha;
	private String[] permissoes;

	public UsuarioSistema(String usuario, String senha, String[] permissoes) {
		this.usuario = usuario;
		this.senha = senha;
		this.permissoes = permissoes;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String[] getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(String[] permissoes) {
		this.permissoes = permissoes;
	}

	@Override
	public boolean verificarPermissao(String acao) {
		for (String permissao : permissoes) {
			if (permissao.equals(acao)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean autenticar(String usuario, String senha) {
		return this.usuario.equals(usuario) && this.senha.equals(senha);
	}

}
