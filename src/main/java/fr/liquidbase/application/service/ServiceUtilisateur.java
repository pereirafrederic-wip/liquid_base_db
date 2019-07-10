package fr.liquidbase.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.liquidbase.application.entity.user.Utilisateur;

@Service
public class ServiceUtilisateur {
	
	@Autowired
	private RepositoryUtilisateur repositoryUtilisateur;

	public Utilisateur recupererUtilisateur(Long id) {
		Utilisateur utilisateur = repositoryUtilisateur.findOne(id);
		
		return utilisateur;
	}

}
