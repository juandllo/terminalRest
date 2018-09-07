package co.com.terminal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ter_servicio")
public class Servicio implements Serializable{
	
	private static final long serialVersionUID = 5363354617941444794L;

	@Id
	@Column(name = "CD_SERVICIO")
	private Long codigo;
	
	@Column(name = "DS_NOMBRE")
	private String nombre;
	
	@Column(name = "DS_RUTA")
	private String ruta;

	@Column(name = "DS_METODO")
    private Long metodo;

	@Column(name = "DS_BODY")
	private String body;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

    public Long getMetodo() {
        return metodo;
    }

    public void setMetodo(Long metodo) {
        this.metodo = metodo;
    }

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
