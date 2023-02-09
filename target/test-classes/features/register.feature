Feature: Yo como automatizador requiero registro user

  @Regresion @registre @latam1
  Scenario Outline: registro exitoso
    Given ingreso a latam <Ambiente>
    When doy click en label Iniciar sesión
    When doy click en el boton label Crear cuenta
    And selecciono el <pais> y <identification>
    And lleno el formulario de registro <Documento> <nombre> <apellido> <fecha> <genero> <teléfono> <email> <contraseña>
    Then que se cree la cuenta con la opcion Crear cuenta
    Examples:
      | Ambiente |pais |identification|Documento|nombre|apellido|fecha|genero|teléfono|email|contraseña|
      | co |Colombia|Pasaporte|1097669599|test|testing|12/05/2006|femenino|3465786699|test+1@gmail.com|Latam_123|
