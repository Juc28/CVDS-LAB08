# CVDS-LAB08
# PARTE I. INTEGRACIÓNDE SPRING CONEL PROYECTO WEB.
- Sobre el proyectoweb realizado en el laboratorio 5,se trabajará para integrar el desarrollo realizado con el uso de SPRING.
- El primer paso será, poder desplegar el proyectoweb con toda la configuración de SPRING que se indica en elsiguiente tutorial.
  - Seguir este tutorial
  - Nota: Si presenta problemas a la hora de correr el proyecto, usar la versión de primefaces 6.0.
- Logar desplegar la página que muestran en el tutorial. (renombrar el nombre de la página si es necesario)
- Lograr desplegar la página del tutorial del laboratorio 5
- Crear un página de bienvenida en donde:
  - Se le pida el nombre del jugador. (Esta información se debe almacenaren un Bean detipo Aplicación llamado ‘UserBean’)
  - Se le dé la bienvenida al juego y tenga un botón “Iniciar”, elcual una vez se presione direccione a la página anteriormente creada en donde
el jugador podrá jugar.
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
