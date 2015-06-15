# Como Debugear #

  * En la vista Servers, iniciar el tomcat haciendo click en el boton "Start the server in debug mode". Esto es para poder debugear el codigo java.
  * Boton derecho en el archivo mxml de la aplicacion (snanalizer.mxml o jumppage.xml), elegir Debug As -> Flex Application. Esto es para poder debuggear codigo flex (tanto los controles como el codigo actionscript).
  * Se puede debugear tanto codigo java como flex, por separado o ambos a la vez.
  * Poner breakpoints en la linea de codigo en donde se quiere debugear. Se ponen haciendo doble-click a la derecha del numero de linea.
  * Usar la aplicacion y el debugger va a parar en los breakpoints. Ahi van a poder ver los valores de las variables e ir ejecutando paso a paso usando los controles del debugger.
  * Algunos shortcuts:
    * F5 - Step Into
    * F6 - Step Over
    * F7 - Step Return
    * F8 - Resume