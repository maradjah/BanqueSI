package org.glsid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeClient;

	@Override
	public String toString() {
		return nomClient;
	}

	private String nomClient;

	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private Collection<Compte> Comptes;

	public Client(String nomClient) {
		this.nomClient = nomClient;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(Long codeClient) {
		this.codeClient = codeClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	@JsonIgnore
	@XmlTransient
	public Collection<Compte> getCompte() {
		return Comptes;
	}

	public void setCompte(Collection<Compte> comptes) {
		Comptes = comptes;
	}

}
