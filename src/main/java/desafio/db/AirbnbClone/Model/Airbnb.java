package desafio.db.AirbnbClone.Model;
import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airbnb")
public class Airbnb {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotNull
	private String imovel;
	@Column(name="valor_contato")
	@NotNull
	private String valorContato;
	@Column(name="endereco_disponibilidade")
	@NotNull
	private String enderecoDisponibilidade;


	public Airbnb() {
	}

	public Airbnb(/*Integer id,*/ String imovel, String valorContato, String enderecoDisponibilidade) {
		//super();
		//this.id = id;
		this.imovel = imovel;
		this.valorContato = valorContato;
		this.enderecoDisponibilidade = enderecoDisponibilidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImovel() {
		return imovel;
	}

	public void setImovel(String imovel) {
		this.imovel = imovel;
	}

	public String getValorContato() {
		return valorContato;
	}

	public void setValorContato(String valorContato) {
		this.valorContato = valorContato;
	}

	public String getEnderecoDisponibilidade() {
		return enderecoDisponibilidade;
	}

	public void setEnderecoDisponibilidade(String enderecoDisponibilidade) {
		this.enderecoDisponibilidade = enderecoDisponibilidade;
	}

	@Override
	public String toString() {
		return "Promções [id=" + id + ", Imovel=" + imovel + ", Contato e valor" + valorContato + ", Endereço e disponibilidade" + enderecoDisponibilidade + "]";

	}
	
}
