package org.glsid.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

@Entity
@DiscriminatorValue("R")
@XmlType(name="Retrait")
public class Retrait extends Operation{

	public Retrait(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
