# Ejercicio Nis Api Rest (Noviembre 2019)
###### Autor: [Manuel Moya - mmoyam@gmail.com]
El objetivo de este documento es detallar la resolución del caso Nis Api Rest, donde se debe crear la Api Rest indicada basada en SpringBoot. 


### Enunciado

* Create a SpringBoot projecty upload it, using MAVEN o GRADLE.
* Create a simple CRUD REST api of Persona Information.
* The application has to be able to save, retrieve, modifify and delete.
* Input validation / business rules are optional.


### Entregables

* Source code in github.
* Command to build project and run test . 
* Example URL calls in order to request each of the REST operation (ej: GET to http://localhost:8080/persona/1)

### Idea principal

* Realizar la api usando las opciones que entrega http

* Crear modelos, DAO y servicios para gestionar información de Persona.


### Supuestos
* No hay supuestos adicionales

### Descripción del programa

El programa considera los siguientes Packages:

* **nisum.api**: Contiene los controller SpringBoot para gestionar la api.
* **nisum.dao**: Contiene los programas que harán el proceso de gestionar la data, en este caso será una estructura de datos (List).
* **nisum.model**: Contiene los java beans utilizados.
* **com.merlib.service**: Contiene los servicios que componen la api.

Los programas son los siguientes:

* **com.merlib.api**: 
	* [PersonaInfoController.java](https://github.com/manumoya/NisApiRest/tree/master/src/main/java/nisum/api/PersonaInfoController.java) 
	
* **com.merlib.dao**: 
	* [PersonaInfoDAO.java](https://github.com/manumoya/NisApiRest/tree/master/src/main/java/nisum/dao/PersonaInfoDAO.java) 
	
* **com.merlib.model**: 
	* [Persona.java](https://github.com/manumoya/NisApiRest/tree/master/src/main/java/nisum/model/Persona.java)
	* [Validation.java](https://github.com/manumoya/NisApiRest/tree/master/src/main/java/nisum/model/Validation.java)

* **com.merlib.service**: 
	* [PersonaInfoService.java](https://github.com/manumoya/NisApiRest/tree/master/src/main/java/nisum/service/PersonaInfoService.java)
	* [PersonaValidation.java](https://github.com/manumoya/NisApiRest/tree/master/src/main/java/nisum/service/PersonaValidation.java)

### Pruebas automáticas

Las pruebas unitarias que cubren los casos son:
 
* [PersonaInfoDAOTest.java](https://github.com/manumoya/NisApiRest/tree/master/src/test/java/nisum/dao/PersonaInfoDAOTest.java).

Adicionalmente, las API se probaron directamente con Postman.

#### API http://localhost:8080/persona


* GET to http://localhost:8080/persona
	
	(Muestra todas las personas creadas)		

	Body response:

	[
    {
        "id": 1,
        "name": "manuel4",
        "lastName": "moya4",
        "address": "rgua 123",
        "phoneNumber": 23233,
        "hairColour": "red"
    },
    {
        "id": 2,
        "name": "manuel4",
        "lastName": "moya5",
        "address": "rgua 123",
        "phoneNumber": 23233,
        "hairColour": "red"
    }
    ]
		

* GET to http://localhost:8080/persona/1
	
	(Muestra la persna buscada)		


	Body response:

	[
    {
        "id": 1,
        "name": "manuel4",
        "lastName": "moya4",
        "address": "rgua 123",
        "phoneNumber": 23233,
        "hairColour": "red"
    }
    ]


* POST to http://localhost:8080/persona
	
	(Graba una persona)		

	
	Body send:

	{"id":0, "name":"manuel4", "lastName":"moya5", "address":"rgua 123", "phoneNumber":23233, "hairColour":"red"}

	Body response:

	{
    "id": 2,
    "name": "manuel4",
    "lastName": "moya5",
    "address": "rgua 123",
    "phoneNumber": 23233,
    "hairColour": "red"
  }


* PUT to http://localhost:8080/persona
	
	(Modifica una persona)		

	
	Body send:

	{"id":2, "name":"jorge", "lastName":"perez", "address":"stgo 123", "phoneNumber":23232, "hairColour":"white"}

	Body response:

	{
    "id": 2,
    "name": "jorge",
    "lastName": "perez",
    "address": "perez",
    "phoneNumber": 23232,
    "hairColour": "white"
}


* DELETE to http://localhost:8080/persona/2
	
	(Borra la persna indicada)		


	Body response:

	Usuario ID eliminado - 2
		
* Header debe ser configurado con Content-Type = application/json


 
### Tecnología utilizada
* java 7.*
* SpringBoot
* Junit 4.*
* Deploy basado en GitHub
* Postman (request client)
* Maven (construcción y gestión del proyecto)
* MAC OS X 	

### ¿Se puede mejorar?

* Sí, completando validacion de entrada y agregando mas detalles de JUNIT
* Agregando Swagger para la documentación e la API

### Ejecución del programa

Programa 

java -jar JARFILE.jar


TEST

javac -cp junit-4.12.jar;. nisum.dao.PersonaInfoDAOTest.java

