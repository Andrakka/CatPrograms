Catalogo Programas Dao.


Configuracion de Base de Datos
---------------------------------------------------------------------------------------------------
1.- Realizar la Instalacion de Docker, seguir instrucciones en https://docs.docker.com/engine/installation/ 
2.- Realizar la Instalacion de Oracle XE para docker seguir instrucciones en https://hub.docker.com/r/wnameless/oracle-xe-11g/ 
     docker pull wnameless/oracle-xe-11g
     docker run -d -p 49160:22 -p 49161:1521 wnameless/oracle-xe-11g
     docker ps
     docker stop
     
     
3.- Bajar Herramienta de Desarrollo para Oracle SQL Developer  http://www.oracle.com/technetwork/developer-tools/sql-developer/downloads/index.html
4.- Conectarse por medio de SQL Developer a Oracle

	hostname: localhost
	port: 49161
	sid: xe
	username: system
	password: oracle
	
5.- Crear usuario 
	username: SEDESOL
	password: sedesol
	
6.- Abrir y ejecutar  el Script sqlSedesol.sql
7.- Verificar que esten correctos los datos en el archivo persistence.xml


Construccion de Componentes
---------------------------------------------------------------------------------------------------

	1.- mvn clean install


Installation Componente y Requisitos para su ejecucion
---------------------------------------------------------------------------------------------------
   Instalar Librerias 
   1.- feature:repo-add mvn:org.ops4j.pax.jdbc/pax-jdbc-features/0.5.0/xml/features   
   2.- feature:repo-add mvn:org.hibernate/hibernate-osgi/5.2.4.Final/xml/karaf
   3.- feature:install hibernate-orm/5.2.4.Final
   4.- feature:install transaction jndi pax-jdbc-config pax-jdbc-pool-dbcp2 jpa hibernate/5.2.4.Final
       
   5.- mvn install:install-file -Dfile="/home/develop/Desktop/Develop/Software/libs/jpa/ojdbc6.jar" -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=12.1.0.1 -Dpackaging=jar
   6.- install -s wrap:mvn:com.oracle/ojdbc6/12.1.0.1
   7.- cd /home/develop/Desktop/Develop/Software/Test/Karaf-Tutorial/db/datasource
   8.- cp datasource-oracle.xml /home/develop/Desktop/Develop/Infraestructure/apache-servicemix-6.1.0/deploy/
   
   Instalar Componentes 
   9.-  install -s mvn:com.sedesol.catProgramas/catalogoProgramasDao/0.0.1-SNAPSHOT
   10.- install -s mvn:com.sedesol.catProgramas/catalogoProgramasServiceBus/0.0.1-SNAPSHOT
   11.- install -s mvn:com.sedesol.catProgramas/catalogoProgramasRouter/0.0.1-SNAPSHOT
	
	
Test
---------------------------------------------------------------------------------------------------

	Ejemplo de comandos directos del Bundle para probar componentes:
	
	person:add 'Daniel Sierra' @owercloud
	
	karaf@root> person:list
	Daniel Sierra, @owercloud
	-> Lists all persisted Persons

