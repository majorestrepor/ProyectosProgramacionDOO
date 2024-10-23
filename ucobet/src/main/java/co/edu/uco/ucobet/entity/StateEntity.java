package co.edu.uco.ucobet.entity;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.dto.CountryDTO;

public class StateEntity extends DomainEntity{
	
	private String name;
	private CountryEntity country;
	
	public StateEntity() {
		super(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
		setCountry(new CountryEntity());
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(final String name) {
		this.name = TextHelper.applyTrim(name);
	}
	
	public void setId(final UUID id) {
		super.setId(id);
	}
	
	public UUID getId() {
		return super.getId();
	}

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(final CountryEntity country) {
		this.country = ObjectHelper.getDefault(country, new CountryEntity());
	}	
}
