# Servicios #

Desde la aplicacion flex que corre en el browser, vamos a estar llamando a servicios que corren en el servidor para ejecutar funcionalidades como crear un usuario, obtener los nodos de una red, ejecutar estadisticas, etc.

Un servicio es simplemente un objeto java comun y corriente, al que desde flex le podemos invocar metodos. Ver la clase UsuariosServiceImpl como ejemplo.

## Como crear un servicio ##

Todo servicio que creemos va a estar compuesto por un interface y su implementacion. Por ejemplo para el servicio de abm de usuarios, tenemos dos archivos: UsuarioService y UsuarioServiceImpl.

Una vez creados la interface y la implementacion del servicio, hay que configurarlo en los archivos java-src/snanalizer/services/servicesContext.xml y webContent/WEB-INF/flex/remoting-config.xml. Usar como ejemplo la configuracion de los otros servicios en estos mismos archivos.

En la clase de implementacion del servicio hay que agregar la annotation @Transactional. Ver la clase UsuariosServiceImpl como ejemplo. Lo que hace esto es marcar al servicio como transaccional. Esto quiere decir que cada vez que llamemos a un metodo de este servicio se va a crear automaticamente una transaccion en la db. Esta transaccion se commitea cuando se termina de ejecutar el metodo correctamente o se rollackea si el metodo termina con una runtime exception.

# Repositorios #

Los repositorios son nuestra capa de datos, a traves de estos vamos a persistir los objetos y tambien recuperarlos de la db.

## Como crear un repositorio ##

Al igual que con los servicios, tenemos que crear una interface y una implementacion para cada repositorio. Ver UsuarioRepository y UsuarioRepositoryImpl como ejemplo.

Todo repositorio va a ser una subclase de BaseRepository. Esta clase nos provee del vamos con algunas funcionalidades basicas de un repositorio: grabar un objeto en la db, borrarlo y hacer consultas basicas. Esto quiere decir que los repositorios que creemos solo van consistir en metodos para hacer consultas, ya que grabar y borrar ya estan implementado en BaseRepository.

Una vez creadas la clase y la interface del repositorio, hay que configurarlo en java-src/snanalizer/data/dataContext.xml. Usar como ejemplo la configuracion de los otros repositorios en ese mismo archivo.

Para usar el repositorio desde un servicio, tenemos que crear una variable de instancia en el servicio para el repositorio, crearle un getter y un setter, y anotar la variable de instancia con @Resource. Ver UsuariosServiceImpl como ejemplo.

# Objetos de negocio #

Los objetos de negocio son las entidades que necesitamos persistir en la db, como usuarios, encuestas, etc.

## Como crear un objeto de negocio ##

Todo objeto de negocio tiene que ser una subclase de DomainEntity. De esta clase el objeto de negocio va a heredar el id y algunos metodos necesarios para la persistencia que no hace falta conocerlos. Ver la clase Usuario como ejemplo.

Crear getters y setters para cada una de las variables de instancia y crear un constructor vacio sin parametros.

Agregar en la clase del objeto de negocio la annotation @Entity.

Si la clase tiene alguna variable que su tipo es otra entidad, agregar en el getter de esa variable la annotation @ManyToOne (ver clase Recurso como ejemplo).

Si la clase tiene una variable que su tipo es una collection de otras entidades, agregar en el getter de esa variable la annotation @OneToMany (ver clase Red como ejemplo).

Una vez hecho esto, ya podemos persistir/recuperar los objetos a traves de los repositorios. No necesitamos ningun archivo de configuracion, ni crear las tablas en la base de datos, hibernate se encarga de eso.