package Carnaval;

public class Normal extends Ingresso {
    public Normal(double valorIngresso) {
        super(valorIngresso);
    }
    public String ImprimeIngresso(){
        //valorIngresso=100; protegido consegue acessar.

        return "Ingresso Normal: "+ getValorIngresso();
    }
}
