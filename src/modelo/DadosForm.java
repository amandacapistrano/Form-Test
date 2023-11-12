package modelo;
import java.sql.ResultSet;
import database.DBQuery;

public class DadosForm {
	private int idUser;
	private String nome;
	private String email;
	private String celular;
	private String genero;
	private String nascimento;
	private String pais;
	private String peso;
	private String altura;
	private String imc;
	private String situacao;
	
	private String tableName = "dados_form";
	private String fieldsName = "idUser, nome, email, celular, genero, nascimento, pais, peso, altura, imc, situacao";
	private String fieldKey = "idUser";
	private DBQuery dbQuery = new DBQuery(tableName, fieldsName, fieldKey);
	
	
	//CONSTRUTORES
	public DadosForm() {

	}

	public DadosForm(String nome, String email, String celular, String genero, String nascimento, String pais, String peso, String altura, String imc, String situacao) {
		/*this.setIdUser(idUser);*/
		this.setNome(nome);
		this.setEmail(email);
		this.setCelular(celular);
		this.setGenero(genero);
		this.setNascimento(nascimento);
		this.setPais(pais);
		this.setPeso(peso);
		this.setAltura(altura);
		this.setImc(imc);
		this.setSituacao(situacao);
	}


    public DadosForm(DBQuery dbQuery) {
        this.dbQuery = dbQuery;
    }
	
	
	///////////////////////////
	
	private String[] toArray() {
		return(
			new String[] {
					String.valueOf(this.getIdUser()),
					this.getNome(),
					this.getEmail(),
					this.getCelular(),
					this.getGenero(),
					String.valueOf(this.getNascimento()),
					this.getPais(),
					this.getPeso(),
					this.getAltura(),
					this.getImc(),
					this.getSituacao()
			}
		);
				
	}

	public ResultSet listAll() {
		return ( this.dbQuery.select(""));
	}
	
	
	public int save() {
		if (this.getIdUser() < 0) {
			return this.dbQuery.update(this.toArray());
		}else {
			return this.dbQuery.insert(this.toArray());
		}
	}
	
	public int delete() {
		if (this.getIdUser() > 0) {
			return this.dbQuery.delete(this.toArray());
		}
		return(0);
	}
	
	
	
//GETTERS E SETTERS
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = Integer.parseInt(idUser);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getImc() {
		return imc;
	}

	public void setImc(String imc) {
		this.imc = imc;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}
