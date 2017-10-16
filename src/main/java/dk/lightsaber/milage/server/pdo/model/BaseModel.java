package dk.lightsaber.milage.server.pdo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class BaseModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	@Version
	private long version;
	
	public long getId() {
		return id;
	}
	public BaseModel setId(long id) {
		this.id = id;
		return this;
	}
	public long getVersion() {
		return version;
	}
	public BaseModel setVersion(long version) {
		this.version = version;
		return this;
	}
}
