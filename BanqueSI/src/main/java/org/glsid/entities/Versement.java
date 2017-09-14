package org.glsid.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

@Entity
@DiscriminatorValue("V")
@XmlType(name="Versement")
public class Versement extends Operation {

	public Versement(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

}
