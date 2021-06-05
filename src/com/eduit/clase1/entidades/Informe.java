package com.eduit.clase1.entidades;

import com.eduit.clase1.interfaces.CreacionInformes;

public class Informe implements CreacionInformes {

	@Override
	public String getInforme() {
		return "Esto es un Informe detallado, demo inyeccion de dependencias,"
				+ "y esta es una caracteristica que tienen en comun todas las entidades de nuestra app"
				+ "(Jefe, Secretario, Director...)";
	}
}
