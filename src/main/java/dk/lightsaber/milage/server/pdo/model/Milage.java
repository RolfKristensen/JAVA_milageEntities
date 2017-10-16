package dk.lightsaber.milage.server.pdo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MILAGES")
public class Milage {
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

	public Milage setCarId(int carId) {
		this.carId = carId;
		return this;
	}

	public Milage setGasStationId(int gasStationId) {
		this.gasStationId = gasStationId;
		return this;
	}

	public Milage setGasTypeId(int gasTypeId) {
		this.gasTypeId = gasTypeId;
		return this;
	}

	public Milage setId(int id) {
		this.id = id;
		return this;
	}

	public Milage setKmDriven(float kmDriven) {
		this.kmDriven = kmDriven;
		return this;
	}

	public Milage setKmL(float kmL) {
		this.kmL = kmL;
		return this;
	}

	public Milage setLitresFuled(float litresFuled) {
		this.litresFuled = litresFuled;
		return this;
	}

	public Milage setpriceKm(float priceKm) {
		this.priceKm = priceKm;
		return this;
	}

	public Milage setPriceL(float priceL) {
		this.priceL = priceL;
		return this;
	}

	public Milage setPriceSum(float priceSum) {
		this.priceSum = priceSum;
		return this;
	}

	public Milage setUserId(int userId) {
		this.userId = userId;
		return this;
	}
}