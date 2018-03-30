package com.expidia.domain;

public class Persona {
	
	private  String personaType;

	public String getPersonaType() {
		return personaType;
	}

	public void setPersonaType(String personaType) {
		this.personaType = personaType;
	}

	@Override
	public String toString() {
		return "Persona [personaType=" + personaType + "]";
	} 
	
	
}
