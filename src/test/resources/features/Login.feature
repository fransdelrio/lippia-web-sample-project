Feature: como cliente quiero ingresar mis datos de acceso para iniciar sesión en el sitio de compras My Store.

  @Smoke
  Scenario: Inicio de sesion exitoso.
    Given El cliente esta en la pagina Home del sitio My Store.
    When El cliente hace click en el boton Sign In.
    Then El cliente verifica que fue redireccionado a la pagina Login.

    When El cliente coloca su email fran@academy.com.
    And  El cliente ingresa su password 123456.
    And  El cliente hace click en el boton Sign In.
    Then El cliente verifica que fue redireccionado a la pagina My-Account.

    #fran@academy.com
    #123456
    #01/01/1985


