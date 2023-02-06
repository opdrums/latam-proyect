Feature: Yo como automatizador, requiero realizar login en la web

  @Regresion @login @latam
    Scenario Outline: login latam
    Given ingreso a latam <Ambiente>

    Examples:
      | Ambiente |
      |CO|
