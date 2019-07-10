package fr.liquidbase.application.service;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.liquidbase.application.entity.user.Utilisateur;

@Repository
public interface RepositoryUtilisateur extends CrudRepository<Utilisateur, Long>,
		JpaSpecificationExecutor<Utilisateur> {


}
