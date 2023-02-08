Feature: Yo como automatizador, requiero realizar login en la web

  @Regresion @login @latam
    Scenario Outline: login latam
    Given ingreso a latam <Ambiente>
    When doy click en label Iniciar sesión
    And las credenciales <user> y <password>
    Then visualizar el logo de latam
    Examples:
      | Ambiente |user| password|
      |CO|tes1111t@gmail.com |latam2022 |
