package levy.daniel.application.model.persistence.metier.customer.entities.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * CLASSE Customer :<br/>
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
 * @since 4 oct. 2020
 */
@Entity(name = "Customer")
@Table(name="CUSTOMERS", schema="PUBLIC"
, uniqueConstraints=@UniqueConstraint(name="UNICITE_CODE_CUSTOMER"
, columnNames={"CODE"})
, indexes={@Index(name="INDEX_NAME_CUSTOMER", columnList="NAME")})
@FieldDefaults(level=AccessLevel.PRIVATE)
@EqualsAndHashCode(of = {"code"})
@NoArgsConstructor @AllArgsConstructor
@ToString(of = {"id", "code", "name", "email"})
@Getter
@Setter
public class Customer implements Serializable {
	
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ID en base.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	/**
	 * code metier du Customer.
	 */
	@Column(name="CODE"
			, unique = false, updatable = true
			, insertable = true, nullable = false)
	private String code;
	
	/**
	 * nom du Customer.
	 */
	@Column(name="NAME"
			, unique = false, updatable = true
			, insertable = true, nullable = false)
	private String name;
	
	/**
	 * e-mail du Customer.
	 */
	@Column(name="EMAIL"
			, unique = false, updatable = true
			, insertable = true, nullable = true)
	private String email;
	
	

} // FIN DE LA CLASSE Customer.----------------------------------------------
