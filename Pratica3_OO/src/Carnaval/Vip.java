package Carnaval;

public class Vip extends Ingresso {
    private double valorAdicional;
    private static int count=0;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
        count++; //toda vez q criar um objeto ela vai contar
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public String ImprimeIngresso(){
        return "Ingresso VIP: " + (getValorIngresso()+getValorAdicional());
    }

    public int numeroVip(){
        return count;
    }
}
