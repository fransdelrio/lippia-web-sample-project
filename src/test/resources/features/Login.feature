Feature: como cliente, quiero ingresar mis datos de acceso para iniciar sesión en el sitio de compras My Store.

  @Login @Success
  Scenario Outline: Inicio de sesion exitoso en el sitio de compras.
    Given El cliente esta en la pagina Home del sitio My Store.
    When El cliente presiona el boton <SignInTab>.
    Then El cliente verifica que fue redireccionado a la pagina <pag1>.
    When El cliente coloca su email <email>.
    And El cliente ingresa su password <pass>.
    And El cliente presiona el boton <SignInButton>.
    Then El cliente verifica que fue redireccionado a la pagina <pag2>.
    Examples:
      | SignInTab | email            | pass   | SignInButton | pag1  | pag2       |
      | SignInTab | fran@academy.com | 123456 | SignInButton | Login | My-Account |

    #fran@academy.com
    #123456

