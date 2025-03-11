@login
Feature: Login Sacuce demo
  @login_success
  Scenario: Login con credenciales validas
    Given que estoy en la aplicacion de Swag Labs
    When ingreso mis credenciales username "standard_user" y password "secret_sauce"
    Then el inicio de sesion exitoso

@login_user_locked
  Scenario: Login con credenciales bloqueado
    Given que estoy en la aplicacion de Swag Labs
    When ingreso mis credenciales username "locked_out_user" y password "secret_sauce"
    Then se muestra el mensaje de error "Sorry, this user has been locked out."