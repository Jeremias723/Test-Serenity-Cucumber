Feature: Realizar comrpa en automationpractice.com

  Este feature trata de realizar una compra automatizada en automationpractice.com

  Scenario: Compra

    Given El usuario ingresa a automationpractice
    When El usuario hace click en 'Sign in'
    And El usuario se loguea con los datos email: jeremiasmanzano159357@gmail.com y contraseña: 159357
    And hace click en el boton de 'Sign in' para loguearse
    And El usuario ingresa al apartado de 'T-shirts'
    And Selecciona el producto 'Faded Short Sleeve T-shirts'
    And El usuario procede al checkout
    And El usuario procede en el checkout
    And El usuario ingresa el comentario: asdasdasd y continua
    And El usuario aceptara los terminos y condiciones y procedera a la pestaña de payment
    And Seleccionara el metodo de pago, en este caso cheque
    And El usuario confirma la orden
    Then El usuario verifica que su orden fue realizada