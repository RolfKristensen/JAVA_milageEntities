package dk.lightsaber.milage.server.pdo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="USERS")
public class UserPdo extends BaseModel {
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	@OneToMany(mappedBy="userPdo", fetch=FetchType.LAZY)
	private List<CarPdo> cars;

	public String getFirstName() {
		return firstName;
	}

	public UserPdo setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public UserPdo setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public UserPdo setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public UserPdo setPassword(String password) {
		this.password = password;
		return this;
	}

	public List<CarPdo> getCars() {
		return cars;
	}

	public UserPdo setCars(List<CarPdo> cars) {
		this.cars = cars;
		return this;
	}
	


}
