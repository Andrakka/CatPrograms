// Configurar Apache Service Mix
1.- Descargar Apache Service Mix de http://archive.apache.org/dist/servicemix/servicemix-6/6.1.0/apache-servicemix-6.1.0.zip
2.- Descomprimir el archivo zip
3.- Si estas Utilizando Linux Editar el Archivo bashrc y setera el JAVA_HOME
	~/.bashrc

	set JAVA_HOME=/home/andrakka/Desktop/Hopewell/4._Engineering/2._Infraestructure/jdk1.8.0_111
	export JAVA_HOME
	
4.- Colocarte en la carpeta de apache service mix 
	cd apache-servicemix-6.1.0
	
5.- Ejecutar Apache Service Mix	
	sudo ./bin/servicemix
	
	
	
	 
Compilacion de Componentes
---------------------------------------------------------------------------------------------------

1.- El proyecto maven catalogoProgramasService consta de 4 Modulos

	a) catalogoProgramasRouter      "Se configura la URL, PORT, Tipo de Sebvicio a Brindar por el Apache Service Mix en este caso SOAP 1.2 WebService"
	b) catalogoProgramasServiceBus  "Se programas todos los servicios a utilizar en este caso servicios de acceso al JPA, servicios de notificacion, servicios de Auditoria, etc."
	b) catalogoProgramasDao         "Componente encargado de ralizar el mapeo de la base de datos por medio de JPA."
	c) catalogoProgramasCliente     "Se programa la manera en como se conectaran al WebSErvice que se configuro en catalogoProgramasRouter"
	

2.- Ejecutar el pom principal del proyecto catalogoProgramasService este invocara a los pom's de los 4 modulos
	mvn clean install
	
4.- Se compilara los componetes y se dejara en la carpeta de Maven
	
	/home/develop/.m2/repository/com/sedesol/catProgramas
	a) catalogoProgramasRouter      
	b) catalogoProgramasServiceBus  
	b) catalogoProgramasDao         
	c) catalogoProgramasCliente 
	
5.- Revisar el Readme.tx del componente catalogoProgramasDao  para configurar e instalar Base de Datos, JPA, Drivers, Librerias y Data Sorce 	




