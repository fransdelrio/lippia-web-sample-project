Feature: como cliente, quiero ingresar mis datos de acceso para iniciar sesión en el sitio de compras My Store.

  @Login
  Scenario Outline: Inicio de sesion exitoso en el sitio de compras.
    Given El cliente esta en la pagina Home del sitio My Store.
    When El cliente hace click en el boton <button>.
    Then El cliente verifica que fue redireccionado a la pagina <pag>.
    When El cliente coloca su email <email>.
    And El cliente ingresa su password <pass>.
    And El cliente hace click en el boton <button>.
    Then El cliente verifica que fue redireccionado a la pagina My-Account.
    Examples:
      | button  | email            | pass     |pag  |
      | Sign In | fran@academy.com | 123456 |Login|

    #fran@academy.com
    #123456
    #01/01/1985


