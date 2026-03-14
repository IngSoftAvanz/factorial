package isa.factorial.bdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import isa.factorial.Factorial;
import isa.factorial.FactorialImpl;

public class FactorialSteps {

    private Factorial factorial;
    private int input;
    private long result;
    private boolean exceptionThrown;

    @Given("la calculadora de factorial está iniciada")
    public void la_calculadora_de_factorial_está_iniciada() {
        factorial = new FactorialImpl();
    }
    
    @Given("el número de entrada es {int}")
    public void el_número_de_entrada_es(Integer int1) {
        input = int1;
    }
    
    @When("ejecuto la operación de factorial")
    public void ejecuto_la_operación_de_factorial() {
        try {
            result = factorial.fact(input);
            exceptionThrown = false;
        } catch (Exception e) {
            exceptionThrown = true;
        }
    }

    @Then("el resultado debe ser {long}")
    public void el_resultado_debe_ser(long long1) {
        assertEquals(long1, result);
    }

    @Then("el sistema debe lanzar una excepción")
    public void el_sistema_debe_lanzar_una_excepción() {
        assertEquals(true, exceptionThrown);
    }

}
