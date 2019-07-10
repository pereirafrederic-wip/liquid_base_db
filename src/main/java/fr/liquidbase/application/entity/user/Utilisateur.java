package fr.liquidbase.application.entity.user;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import fr.liquidbase.application.entity.commun.AbstractId;
import fr.liquidbase.application.validator.IValidPassword;


@Entity(name = "nom")
@Table(name = "utilisateur", schema = "storyline")
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur extends AbstractId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7651345125628872606L;
	
	@NotBlank
	@NotNull
	@NotEmpty
	@Size(min=3,max=50, message 
		      = "le pseudo doit contenir entre 3 et 80 charactères ")
	private String pseudo;
	
	@NotBlank
	@NotNull
	@NotEmpty
	@Size(min=3,max=100, message 
		      = "l'email doit contenir entre 3 et 100 charactères")
	@Email(message = "l'email doit être valide")
	private String email;
	
	@NotBlank
	@NotNull
	@NotEmpty
	@Column(name="mot_passe")
	@IValidPassword
	private String motDePasse;
	
	@NotBlank
	@NotNull
	@NotEmpty
	private Date dateInscription;
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	


}
