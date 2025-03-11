#language: es
@testMyStore
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @testLogin
  Escenario: Iniciar sesión
    Given que me encuentro en la página de login de MyStore
    And inicio session con las credenciales usuario: "fernando.verde98@outlook.com" y password: "Ydaleu#2024"
    When navego a la categoria "Clothes" y subcategoria "Men"
    And agrego 2 unidades del primer producto al carrito
    Then valido en el popup la confirmacion del producto agregado
    And valido en el popup que el monto total sea calculado correctamente
    When finalizo la compra
    Then valido el titulo de la pagina del carrito
    And vuelvo a validar el calculo de precios en el carrito
