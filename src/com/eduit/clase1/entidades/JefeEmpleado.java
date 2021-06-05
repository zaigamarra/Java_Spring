package com.eduit.clase1.entidades;

import com.eduit.clase1.interfaces.IEmpleados;

public class JefeEmpleado implements IEmpleados{

	// Sobreescribo el metodo de la interface
	@Override
	public String getTareas() {
		return "Soy un Jefe Empleado";
	}

	@Override
	public String getInforme() {
		return "";
	}

}
