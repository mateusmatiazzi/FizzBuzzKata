import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String esperado;

    @Test
    public void naoDeveInformarNemFizzNemBuzz(){
        for(int numero=1;numero<101;numero++) {
            if(numero%3!=0 && numero%5!=0){
                esperado = String.valueOf(numero);

                String atual = fizzBuzz.validarFizzBuzz(numero);

                assertEquals(esperado, atual);
            }
        }
    }

    @Test
    public void deveInformarFizzQuandoMultiploDe3(){
        esperado = "Fizz";

        for(int numero=1;numero<101;numero++) {
            if(numero%5!=0){
                String actual = fizzBuzz.validarFizzBuzz(3*numero);

                assertEquals(esperado, actual);
            }
        }
    }

    @Test
    public void deveInformarBuzzQuandoMultiploDe5(){
        esperado = "Buzz";

        for(int numero=1;numero<101;numero++) {
            if(numero%3!=0) {
                String actual = fizzBuzz.validarFizzBuzz(5 * numero);

                assertEquals(esperado, actual);
            }
        }
    }

    @Test
    public void deveInformarFizzBuzzQuandoMultiploDe3E5(){
        esperado = "FizzBuzz";

        for(int numero=1;numero<101;numero++) {
            String actual = fizzBuzz.validarFizzBuzz(15*numero);

            assertEquals(esperado, actual);
        }
    }
}