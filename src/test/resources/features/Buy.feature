Feature: como cliente, quiero ingresar en el sitio de compras My Store para realizar una compra.
    #fran@academy.com
    #123456

  @Buy @Success
  Scenario Outline: Compra exitosa en el sitio de compras.
    Given El cliente esta en la pagina Home del sitio My Store.
    When El cliente presiona el boton SignInTab.
    Then El cliente verifica que fue redireccionado a la pagina Login.
    When El cliente coloca su email <email>.
    And El cliente ingresa su password <pass>.
    And El cliente presiona el boton SignInButton.
    Then El cliente verifica que fue redireccionado a la pagina My-Account.
    And El cliente presiona el boton DressesButton.
    Then El cliente verifica que fue redireccionado a la pagina DressesPage.
    And El cliente presiona el boton ProductButton.
    Then El cliente verifica que fue redireccionado a la pagina ProductPage.
    And El cliente presiona el boton AddToCartButton.
    Then El cliente verifica que aparece ventana LayerCart.
    And El cliente presiona el boton ProceedButton.
    Then El cliente verifica que fue redireccionado a la pagina SummaryPage.
    And El cliente presiona el boton ProceedButtonStep1.
    Then El cliente verifica que fue redireccionado a la pagina AdressPage.
    And El cliente presiona el boton ProceedButtonAdress.
    Then El cliente verifica que fue redireccionado a la pagina ShippingPage.
    And El cliente presiona el boton IAgree.
    And El cliente presiona el boton ProceedButtonShipping.
    Then El cliente verifica que fue redireccionado a la pagina PaymentPage.
    And El cliente presiona el boton PayByCheck.
    Then El cliente verifica que fue redireccionado a la pagina OrderSummaryPage.
    And El cliente presiona el boton ConfirmOrderButton.
    Then El cliente verifica que fue redireccionado a la pagina OrderCompletePage.

    Examples:
#      | SignInTab | email            | pass   | SignInButton | Login | MyAccount  | DressesButton | DressesPage | ProductButton | ProductPage | AddToCartButton | LayerCart
#      | SignInTab | fran@academy.com | 123456 | SignInButton | Login | My-Account | DressesButton | DressesPage | ProductButton | ProductPage | AddToCartButton | LayerCart

      | email            | pass   |
      | fran@academy.com | 123456 |
