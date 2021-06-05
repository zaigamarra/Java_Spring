package com.eduit.clase1.interfaces;

//Creamos una Abstraccion, que tiene el metodo getTareas() y getInformes()
public interface IEmpleados {
	public String getTareas();
	
	//Este metodo lo utilizaremos para la DI(inyeccion de dependencias)
	public String getInforme();
	
}
