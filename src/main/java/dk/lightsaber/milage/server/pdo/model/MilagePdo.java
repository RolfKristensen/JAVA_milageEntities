package dk.lightsaber.milage.server.pdo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MILAGES")
public class MilagePdo {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="LITRES_FUELD")
	private float litresFuled;
	private float kmDriven;
	private float kmL;
	private float priceL;
	private float priceKm;
	private float priceSum;
	private int gasTypeId;
	private int gasStationId;
	private int userId;
	private int carId;

	public int getCarId() {
		return carId;
	}

	public int getGasStationId() {
		return gasStationId;
	}

	public int getGasTypeId() {
		return gasTypeId;
	}

	public int getId() {
		return id;
	}

	public float getKmDriven() {
		return kmDriven;
	}

	public float getKmL() {
		return kmL;
	}

	public float getLitresFuled() {
		return litresFuled;
	}

	public float getPriceKm() {
		return priceKm;
	}

	public float getPriceL() {
		return priceL;
	}

	public float getPriceSum() {
		return priceSum;
	}

	public int getUserId() {
		return userId;
	}

	public MilagePdo setCarId(int carId) {
		this.carId = carId;
		return this;
	}

	public MilagePdo setGasStationId(int gasStationId) {
		this.gasStationId = gasStationId;
		return this;
	}

	public MilagePdo setGasTypeId(int gasTypeId) {
		this.gasTypeId = gasTypeId;
		return this;
	}

	public MilagePdo setId(int id) {
		this.id = id;
		return this;
	}

	public MilagePdo setKmDriven(float kmDriven) {
		this.kmDriven = kmDriven;
		return this;
	}

	public MilagePdo setKmL(float kmL) {
		this.kmL = kmL;
		return this;
	}

	public MilagePdo setLitresFuled(float litresFuled) {
		this.litresFuled = litresFuled;
		return this;
	}

	public MilagePdo setpriceKm(float priceKm) {
		this.priceKm = priceKm;
		return this;
	}

	public MilagePdo setPriceL(float priceL) {
		this.priceL = priceL;
		return this;
	}

	public MilagePdo setPriceSum(float priceSum) {
		this.priceSum = priceSum;
		return this;
	}

	public MilagePdo setUserId(int userId) {
		this.userId = userId;
		return this;
	}
}