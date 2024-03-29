package fr.liquidbase.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.liquidbase.application.entity.user.Utilisateur;

@RestController
@RequestMapping(value = "/storyline/user")
public class ControllerUtilisateur {

	@Autowired
	private ServiceUtilisateur serviceUtilisateur;
	

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@Transactional
	public Utilisateur recupererUtilisateur(
			@PathVariable(value = "id") Long id) {
		return this.serviceUtilisateur.recupererUtilisateur(id);
	}
	
	
}
