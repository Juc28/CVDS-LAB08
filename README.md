# CVDS-LAB08
## ***Integrantes:***
- Erika Juliana Castro Romero
- Mariana Pulido Moreno
# PARTE I. INTEGRACIÓNDE SPRING CONEL PROYECTO WEB.
- Sobre el proyectoweb realizado en el laboratorio 5,se trabajará para integrar el desarrollo realizado con el uso de SPRING.
- El primer paso será, poder desplegar el proyectoweb con toda la configuración de SPRING que se indica en elsiguiente [tutorial](https://www.logicbig.com/tutorials/spring-framework/spring-boot/boot-primefaces-integration.html#google_vignette).
  - Seguir este tutorial
  - Nota: Si presenta problemas a la hora de correr el proyecto, usar la versión de primefaces 6.0.
  
Para esto descargamos el proyecto del [tutorial](https://www.logicbig.com/tutorials/spring-framework/spring-boot/boot-primefaces-integration.html#google_vignette) y con el siguiente comando ejecutamos y luego en el navegador lo abrimos de la siguiente forma 
```
mvn spring-boot:run
```
```
localhost:8080/index.xhtml 
```
  ![](https://github.com/Juc28/CVDS-LAB08/blob/master/pantallazos/parte1.0.png)
- Logar desplegar la página que muestran en el tutorial. (renombrar el nombre de la página si es necesario)
- Lograr desplegar la página del tutorial del laboratorio 5

Para desplegar el juego de GuessBean del laboratorio 5 nos traemos los archivos de bean.java y guess.xhtml al proyecto generado.Tambien debemos arreglar el ***pom*** con las dependencias necesarias.
```
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
    </dependency>
    <dependency>
        <groupId>javax</groupId>
        <artifactId>javaee-web-api</artifactId>
        <version>7.0</version>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
    <dependency>
        <groupId>javax</groupId>
        <artifactId>javaee-api</artifactId>
        <version>8.0.1</version>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>org.primefaces</groupId>
        <artifactId>primefaces</artifactId>
        <version>6.0</version>
    </dependency>
    <dependency>
        <groupId>com.sun.faces</groupId>
        <artifactId>jsf-api</artifactId>
        <version>2.2.20</version>
    </dependency>
    <dependency>
        <groupId>com.sun.faces</groupId>
        <artifactId>jsf-impl</artifactId>
        <version>2.2.20</version>
    </dependency>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
        <version>1.2</version>
    </dependency>
```
Con el siguiente comando ejecutamos y luego en el navegador lo abrimos de la siguiente forma 
```
mvn spring-boot:run
```
```
localhost:8080/guess.xhtml 
```

![](https://github.com/Juc28/CVDS-LAB08/blob/master/pantallazos/parte1.1.png)
- Crear un página de bienvenida en donde:
  - Se le pida el nombre del jugador. (Esta información se debe almacenaren un Bean detipo Aplicación llamado ‘UserBean’)
  - Se le dé la bienvenida al juego y tenga un botón “Iniciar”, elcual una vez se presione direccione a la página anteriormente creada en donde
el jugador podrá jugar.
Para esto debemos crear una clase llamada ***UserBean*** para poder tener el nombre de la persona que va jugar y luego se crea un archivo xhtml que este caso lo llamamos ***usuario.xhtml***.
Y luego Con el siguiente comando ejecutamos y luego en el navegador lo abrimos de la siguiente forma. 
```
mvn spring-boot:run
```
```
localhost:8080/usuario.xhtml 
```
![](https://github.com/Juc28/CVDS-LAB08/blob/master/pantallazos/parte1.2.png)
# PARTE II. INTEGRACIÓNDE SPRING DATA CONEL PROYECTO WEB.
- Tomando lo logrado en el laboratorio 7 (La conexión con la base de datos que corre en Docker),se deberá integrar alsistema de tal forma qué se
obtenga de la base de datos el valor del premio:100
  - Crear una tabla llamada CONFIGURATIONcon doscolumnas:
      - PROPIEDAD: VARCHAR
      - VALOR: VARCHAR
  - Agregar un registro:
      - En la columna PROPIEDAD colocar el valor: “Premio”
      - En la columna VALOR colocar el valor: “100”.
- Crear la funcionalidad que obtenga ese valor de base de datos una vez se ingrese al juego (presión del botón iniciar).

La conexión a la base de datos se establece a través de Docker usando el comando : 
```
docker run -p 3306:3306 --name some-mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:latest 
```
Creamos clases para las unidades de configuración, se ubican en la base de datos (Repository) y archivos de propiedades para conectarse a la base de datos.
Creamos las siguientes clases

***Configuration.java***

***ConfigurationService.java***

***ConfigurationRepository.java***

Configuramos la conexión con la base de datos en el archivo ***application.properties*** de la siguiente forma 
```
emailid=sunny@domain.com
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/sys?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=my-secret-pw
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
```
### __Autores__

* Erika Juliana Castro Romero [Juc28](https://github.com/Juc28)
* Mariana Pulido Moreno [MPulidoM](https://github.com/MPulidoM)
