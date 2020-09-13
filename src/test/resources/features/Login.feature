Feature: como cliente quiero ingresar mis datos de acceso para iniciar sesión en el sitio de compras My Store.

  @Smoke
  Scenario Outline: Inicio de sesion exitoso.
    Given El cliente esta en la pagina Home del sitio My Store.
    When El cliente hace click en el boton <button>.
    Then El cliente verifica que fue redireccionado a la pagina <pag>.
    When El cliente coloca su email <email>.
    And El cliente ingresa su password <pw>.
    And El cliente hace click en el boton <button>.
    Then El cliente verifica que fue redireccionado a la pagina My-Account.
    Examples:
      | button  | email            | pw     |pag  |
      | Sign In | fran@academy.com | 123456 |Login|

    #fran@academy.com
    #123456
    #01/01/1985


