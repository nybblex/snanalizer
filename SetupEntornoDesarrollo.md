# Software para bajar #

Adobe Flex Builder Professional 3 - http://www.adobe.com/cfusion/entitlement/index.cfm?e=flex3email

apache-tomcat-6.0.16.zip - http://download.nextag.com/apache/tomcat/tomcat-6/v6.0.16/bin/apache-tomcat-6.0.16.zip

mysql-5.0.51b-win32.zip - http://dev.mysql.com/get/Downloads/MySQL-5.0/mysql-5.0.51b-win32.zip/from/pick

mysql-gui-tools-5.0-[r12](https://code.google.com/p/snanalizer/source/detail?r=12)-win32.msi - http://dev.mysql.com/get/Downloads/MySQLGUITools/mysql-gui-tools-5.0-r12-win32.msi/from/pick

jdk6 Update 7 (solo si no tienen ya java 6 instalado) - http://java.sun.com/javase/downloads/index.jsp


---


# Instalacion/Configuracion #

## Adobe Flex Builder ##
  * Instalar el Flex Builder
  * lo instale todo por default, en C:\Program Files\Adobe\Flex Builder 3

## Web and Java EE Development plugin ##
  * en el menu del flex builder, ir a Help>Software Updates>Find and Install
  * seleccionar search for new features to install
  * tildar el checkbox Europa Discovery Site
  * tildar el checkbox Automatically select mirrors (si en algun momento falla bajando algo, probar no tildando este box y elegir el cualquier mirror a mano)
  * clieckear finish
  * dentro de Europa Discovery Site, tildar el checkbox q dice Web and Java EE Development
  * clickear Select Required (despues de esto ya no deberia mostrar errores en rojo)
  * clickear Next
  * seleccionar I accept...
  * clickear Next
  * clickear Next
  * clickear Finish
  * se toma un buen rato para bajar todo
  * si en algun momento les sale una ventana de Verification, click en Install All
  * cuando termina les pide reiniciar el flex builder, click en Yes

## Subversive ##
  * en el menu del flex builder, ir a Help>Software Updates>Find and Install
  * seleccionar search for new features to install
  * click en New Remote Site
  * poner en name: subversive, en url: http://download.eclipse.org/technology/subversive/0.7/update-site/
  * click en Ok
  * click en New Remote Site
  * poner en name: SVN Connectors, en url: http://www.polarion.org/projects/subversive/download/eclipse/2.0/update-site/
  * click en Ok
  * tildar el checkbox Automatically select mirrors (si en algun momento falla bajando algo, probar no tildando este box y elegir el cualquier mirror a mano)
  * clieckear finish
  * tildar el checbok que dice subversive
  * dentro de subversive, destildar el que dice Subversive Integration Plug-in's
  * clickear Next
  * seleccionar I accept...
  * clickear Next
  * seleccionar I accept...
  * clickear Next
  * clickear Finish
  * se toma un buen rato para bajar todo
  * si en algun momento les sale una ventana de Verification, click en Install All
  * cuando termina les pide reiniciar el flex builder, click en Yes

## Tomcat ##
  * descomprimir en donde quieran, yo lo tengo en C:\Documents and Settings\sg0973499\My Documents\development\apache-tomcat-6.0.16, pero lo pueden poner en cualquier lado.
  * en el menu del flex builder, ir a Windows>Preferences
  * ir a Server>Installed Runtimes
  * click en Add
  * seleccionar Apache Tomcat v6.0
  * tildar checkbox Also create new local server
  * click en Next
  * en Tomcat installation directory poner el directorio donde descomprimieron el tomcat.
  * click en Finish

## MySQL ##
  * Instalar todo por default
  * en el wizard de MySQL Server Instance Configuration Wizard, elegir Standard Configuration
  * como password poner admin

## Cliente MySQL ##
  * Instalar todo por default
  * una vez instalado, ejecutar el MySQL Query Browser (esta en el menu de inicio)
  * poner Server Host: localhost, Port:3306, Username:root, Password:admin, Default Schema:sna
  * click en OK
  * click en Yes

## Bajar el codigo ##
  * Ir a http://code.google.com/p/snanalizer/
  * Logearse con su user de gmail
  * En la seccion Source, hacer click en el link 'googlecode.com password'
  * ahi va a estar en negrita su password para el SVN
  * en el Flex Builder ir a Window>Perspective>Other
  * Seleccionar SVN Repository Exploring
  * Click OK
  * Hacer click en el boton New Repository Location (icono amarillo con un signo de suma verde)
  * En URL poner https://snanalizer.googlecode.com/svn
  * poner su username (el username de gmail, sin el @gmail.com) y el password del svn
  * tildar el checkbox Save password
  * click en Finish
  * en la vista SVN Repositories, adentro de trunk, boton derecho en snanalizer, click en Check Out
  * Se toma un rato en bajar todo

## Firewall de windows ##
  * en Control Panel y abrir Windows Firewall
  * ir al tag Exception
  * click en Add Port
  * poner en Name:tomcat, Port:8080
  * click en Ok
  * click en Ok

## Configurar tomcat ##
  * ir a Window>Perspective>Other
  * seleccionar Java
  * boton derecho en la raiz del proyecto (snanalizer), click en Properties
  * pararse en Server
  * seleccionar Tomcat v6.0 Server at localhost
  * click en Ok
  * ir a Window>Other Views
  * en Servers, seleccionar la vista Servers
  * seleccionar Tomcat v6.0 Server at localhost
  * boton derecho, Add and Remove Projects
  * seleccionar snanalizer
  * click en Add
  * click en Finish
  * hacer click en el boton Start the server

## Ejecutar la app ##
  * checkear en la vista Servers que el Tomcat este en Started
  * ir a la perspective Flex Development (boton arriba a la derecha) (solo hace falta la primera vez, despues se puede ejecutar desde la perspective Java tambien)
  * en la vista Flex Navigator, doble click en snanalizer.mxml adentro de flex-src para abrir el archivo
  * click en el boton Run snanalizer (arriba a la izquierda)
  * charan! si todo sale bien se deberia abrir el browser con la app