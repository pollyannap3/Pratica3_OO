package Carnaval;
import javax.swing.JOptionPane;
public class mainIngresso {
    public static void main (String[] args){

        double valor, valorAdicional;
        int opcao;
        String localizacao;

        Normal ingressoNormal = null;
        Vip ingressoVip = null;
        Camarote ingressoCamarote = null;


        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Ingresso Normal\n<2> Ingresso VIP\n<3> Ingresso Camarote\n <4> Sair"));//Integer.parseInt converte string para inteiro
            switch (opcao) {

                case 1:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso: "));
                     ingressoNormal = new Normal(valor); // construtor
                    JOptionPane.showMessageDialog(null, ingressoNormal.ImprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;

                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso: "));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Valor adicional do Ingresso: "));
                    ingressoVip = new Vip(valor, valorAdicional); // construtor
                    JOptionPane.showMessageDialog(null, ingressoVip.ImprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso: "));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Valor adicional do Ingresso: "));
                    localizacao = JOptionPane.showInputDialog("Localização: ");
                    ingressoCamarote = new Camarote(valor, localizacao, valorAdicional); // construtor
                    JOptionPane.showMessageDialog(null, ingressoCamarote.ImprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Número de ingressos VIP: " + ingressoVip.numeroVip(),"titulo",JOptionPane.DEFAULT_OPTION);


                    break;
                default:

                    JOptionPane.showMessageDialog(null, "Escolha uma opção corretamente! ", "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;

            }

         }
        while (opcao!=4);

//showMessageDialog(null,"texto", "titulo",JOptionPane.DEFAULT_OPTION);

    }
}
