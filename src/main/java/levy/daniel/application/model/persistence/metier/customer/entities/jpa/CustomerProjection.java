package levy.daniel.application.model.persistence.metier.customer.entities.jpa;

import org.springframework.data.rest.core.config.Projection;

/**
 * INTERFACE CustomerProjection :<br/>
 * .<br/>
 * <br/>
 *
 * - Exemple d'utilisation :<br/>
 *<br/>
 * 
 * - Mots-clé :<br/>
 * <br/>
 *
 * - Dépendances :<br/>
 * <br/>
 *
 *
 * @author Daniel Lévy
 * @version 1.0
 * @since 6 oct. 2020
 */
@Projection(name = "fullCustomerProjection", types = Customer.class)
public interface CustomerProjection {

	
	
	/**
	 * @return ID en base du Customer : Long.
	 */
	Long getId();

	
	
	/**
	 * @return le code du Customer : String.
	 */
	String getCode();
	
	
	
	/**
	 * @return le name du Customer : String.
	 */
	String getName();

	
	
	/**
	 * @return l'e-mail du Customer : String.
	 */
	String getEmail();
	
	
	
} // FIN DE L'INTERFACE CustomerProjection.----------------------------------
