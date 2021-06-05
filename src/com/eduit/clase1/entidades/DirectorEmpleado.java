package com.eduit.clase1.entidades;

import com.eduit.clase1.interfaces.CreacionInformes;
import com.eduit.clase1.interfaces.IEmpleados;

public class DirectorEmpleado implements IEmpleados{

	//Creación de atributo del tipo CreacionInformes(interface), para la inyección de dependencia
	private CreacionInformes informeNuevo;
	
	//Creación de un constructor que inyectará la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		//Utilizamos el metodo getInforme() de la interface
		return "Informe creado por el director: "+ informeNuevo.getInforme();
	}

	@Override
	public String getInforme() {
		return "";
	}
	
	
}
