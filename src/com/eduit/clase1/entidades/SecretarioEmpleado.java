package com.eduit.clase1.entidades;

import com.eduit.clase1.interfaces.CreacionInformes;
import com.eduit.clase1.interfaces.IEmpleados;

public class SecretarioEmpleado implements IEmpleados {
	
	private CreacionInformes informeNuevo;
	
	@Override
	public String getTareas() {
		return "Soy un Secretario Empleado";
	}

	@Override
	public String getInforme() {
		return "";
	}
	
	//Generamos un Setters para poder usar la inyeccion de dependencias
	//mediante el tag <property>
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo; 
	}

}
