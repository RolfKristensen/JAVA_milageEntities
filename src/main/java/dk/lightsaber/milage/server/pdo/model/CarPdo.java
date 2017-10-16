package dk.lightsaber.milage.server.pdo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="CARS")
public class CarPdo extends BaseModel {
	@Column(name="name")
	private String name;
	@Column(name="make")
	private String make;
	@Column(name="model")
	private String model;
	@Column(name="model_specific")
	private String model_specific;
	@Column(name="fuel_type")
	private String fuel_type;
	@Column(name="mixed_milage")
	private double nominated_mixed_milage;

	@ManyToOne
	@JoinColumn(name="user_id")
	private UserPdo userPdo;

	public String getName() {
		return name;
	}

	public CarPdo setName(String name) {
		this.name = name;
		return this;
	}

	public String getMake() {
		return make;
	}

	public CarPdo setMake(String make) {
		this.make = make;
		return this;
	}

	public String getModel() {
		return model;
	}

	public CarPdo setModel(String model) {
		this.model = model;
		return this;
	}

	public String getModel_specific() {
		return model_specific;
	}

	public CarPdo setModel_specific(String model_specific) {
		this.model_specific = model_specific;
		return this;
	}

	public String getFuel_type() {
		return fuel_type;
	}

	public CarPdo setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
		return this;
	}

	public double getNominated_mixed_milage() {
		return nominated_mixed_milage;
	}

	public CarPdo setNominated_mixed_milage(double nominated_mixed_milage) {
		this.nominated_mixed_milage = nominated_mixed_milage;
		return this;
	}

	public UserPdo getUserPdo() {
		return userPdo;
	}

	public CarPdo setUserPdo(UserPdo userPdo) {
		this.userPdo = userPdo;
		return this;
	}

}
