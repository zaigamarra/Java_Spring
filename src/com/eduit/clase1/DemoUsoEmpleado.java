package com.eduit.clase1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eduit.clase1.entidades.JefeEmpleado;
import com.eduit.clase1.entidades.SecretarioEmpleado;
import com.eduit.clase1.interfaces.IEmpleados;

public class DemoUsoEmpleado {

	public static void main(String[] args) {

		//Creamos objetos de tipo empleado
		JefeEmpleado e1 = new JefeEmpleado();
		
		//Me creo una referencia a la abstracción
		IEmpleados e2 = new JefeEmpleado();
		IEmpleados e3 = new SecretarioEmpleado();
		// El problema que se plantea aqui es que si quiero crear
		// un objeto diferente me veo obligado a modificar el codigo
		// y/o definir una nueva clase
		// por ejemplo, si quiero dejar de usar una clase deberia eliminarla
		
		//Uso de los objetos creados
		System.out.println("empleado e1: " + e1.getTareas());
		System.out.println("empleado e2: " + e2.getTareas());
		System.out.println("empleado e3: " + e3.getTareas());

		System.out.println("Demo IOC Spring XML");
		
		//Ahora hacemos lo mismo pero con el contenedor de Spring
		
		//Paso 1) Cargar el xml de configuración
		//Primero creamos el contexto y le pasamos por parametro el nombre
		//del archivo con extensión ".xml"
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Paso 2) Pedirle el beans al archivo xml (al contexto), enviandoles
		//por parametro el alias o id, y como segundo parametro le pasamos
		//el nombre de la abstraccion (interface)
		
		IEmpleados zaira = contexto.getBean("miEmpleado", IEmpleados.class);
		
		//Paso 3) Utilizar el objeto solicitado a gusto.
		System.out.println("Utilizamos el bran: " + zaira.getTareas());
		
		//DEMO INYECCION DEPENDENCIA: la ventaja de esto es que ahora podemos
		//reutilizarlo en otra clase, por ejemplo en JefeEmpleado.
		System.out.println("Utilizamos la inyeccion de dependencia" + zaira.getInforme());
		
		//Paso 4) Cerramos el contexto, asi liberamos los recursos
		contexto.close();
		
		
		
		
	}

}
