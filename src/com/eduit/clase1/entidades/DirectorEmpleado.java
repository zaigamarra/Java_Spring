package com.eduit.clase1.entidades;

import com.eduit.clase1.interfaces.CreacionInformes;
import com.eduit.clase1.interfaces.IEmpleados;

public class DirectorEmpleado implements IEmpleados{

	//Creaci�n de atributo del tipo CreacionInformes(interface), para la inyecci�n de dependencia
	private CreacionInformes informeNuevo;
	
	//Creaci�n de un constructor que inyectar� la dependencia
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
