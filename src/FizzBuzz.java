public class FizzBuzz {
    public FizzBuzz(){ }

    public String validarFizzBuzz(int number){
        if(verificarSeEhMultiploDe3E5(number))
            return "FizzBuzz";
        else if(verificarSeEhMultiploDe5(number))
            return "Buzz";
        else if(verificarSeEhMultiploDe3(number))
            return "Fizz";
        return String.valueOf(number);
    }

    private boolean verificarSeEhMultiploDe3E5(int numero){
        return verificarSeEhMultiploDe3(numero) && verificarSeEhMultiploDe5(numero);
    }

    private boolean verificarSeEhMultiploDe5(int number){
        return number%5==0;
    }

    private boolean verificarSeEhMultiploDe3(int number){
        return number%3==0;
    }
}
