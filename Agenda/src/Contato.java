
public class Contato {
	private String nome;
	private String idade;
	private String telefone;
	private float altura;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	String mostraDados() {						// método
		
		String ret = ("\nNome: "+ this.nome +"\nIdade: "+ this.idade +"\nTelefone: " + this.telefone + "\nAltura" + this.altura);
		return ret;								// ret (variável)
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + ", altura="+ altura + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(altura);
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}
	/**
	 * @param string the altura to set
	 */
	public void setAltura(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	
	
}
