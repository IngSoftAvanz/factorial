Feature: Cálculo del factorial de un número
  Como estudiante de Ingeniería de la Salud
  Quiero calcular el factorial de un número
  Para obtener el número de permutaciones de un número de elementos

  Background:
    Given la calculadora de factorial está iniciada

  @EdgeCase
  Scenario: Cálculo del factorial de cero
    Given el número de entrada es 0
    When ejecuto la operación de factorial
    Then el resultado debe ser 1

  @EdgeCase
  Scenario: Cálculo del factorial de uno
    Given el número de entrada es 1
    When ejecuto la operación de factorial
    Then el resultado debe ser 1

  @ErrorHandling
  Scenario Outline: Intento de cálculo con número negativo
    Given el número de entrada es <numero>
    When ejecuto la operación de factorial
    Then el sistema debe lanzar una excepción

    Examples:
      | numero |
      | -1     |
      | -2     |
      | -5     |
      | -10    |
      | -50    |

  @Performance
  Scenario: Cálculo de un número grande
    Given el número de entrada es 20
    When ejecuto la operación de factorial
    Then el resultado debe ser 2432902008176640000

  Scenario Outline: Verificación de cálculos exitosos múltiples
    Given el número de entrada es <numero>
    When ejecuto la operación de factorial
    Then el resultado debe ser <resultado>

    Examples:
      | numero | resultado |
      | 2      | 2         |
      | 3      | 6         |
      | 4      | 24        |
      | 6      | 720       |
      | 10     | 3628800   |