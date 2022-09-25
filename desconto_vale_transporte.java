import java.text.DecimalFormatSymbols;
import java.util.Scanner; //Importação da biblioteca Scanner

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        Scanner entrad = new Scanner(System.in); // Leitor do teclado
        int tipo;
        double salario, desconto;

    do {
        // Menu
        System.out.println("----------------------------------------- ");
        System.out.println("--------------- BEM-VINDO(A) ------------ ");
        System.out.println("------ QUAL CÁLCULO DESEJA REALIZAR? ---- ");
        System.out.println("----------------------------------------- ");
        System.out.println("------------- (1) MENSALISTA ------------ ");
        System.out.println("------------ (2) COMISSIONADO ----------- ");
        System.out.println("----------------------------------------- ");
        tipo = entrad.nextInt(); // Leitura das opções
            if (tipo < 1 || tipo > 2) {
                System.out.println("");
                System.out.println("-- Erro! Digite uma opção válida! --"); // Mensagem de erro para as opções incorretas
                System.out.println("");
            }
    } while (tipo < 1 || tipo > 2);

        if (tipo == 1) { // Sequência de instruções para o tipo mensalista
        System.out.println("");
        System.out.println("Digite o salário do colaborador: ");
        salario = entrad.nextDouble();
        desconto = calculoMensalista(salario);
        // Resultado
        System.out.println("");
        System.out.println( "/// O teto de desconto é: R$ " + desconto + " ///");    
        }
        
        else if (tipo == 2) { // Sequência de instruções para o tipo comissionado
        System.out.println("");
        System.out.println("Digite o salário do colaborador: ");
        salario = entrad.nextDouble();
            int decisao, contador=1;
            double comissao, totalcomissao=0, remuneracaototal=0;
            do {
            System.out.println("");
            System.out.println("Digite a comissão " + contador + " do colaborador: ");
            comissao = entrad.nextDouble();
            totalcomissao = totalcomissao + comissao;
            remuneracaototal = salario + totalcomissao;
            contador++;

            System.out.println(""); 
            System.out.println("-------------------------------------"); 
            System.out.println("Total em comissões: "+totalcomissao); 
            System.out.println("Salário + comissões: "+remuneracaototal); 
            System.out.println(""); 
            System.out.println("Deseja lançar mais comissões?"); 
            System.out.println("(1) Sim");
            System.out.println("(2) Não");
            decisao = entrad.nextInt();
            } while(decisao < 2);
            desconto = calculoComissionado(remuneracaototal);
            // Resultado
            System.out.println("");
            System.out.println( "/// O teto de desconto é: R$ " + desconto + " ///");    
        }
        
        System.out.println("------------------------------------- ");
        System.out.println("---------- FIM DO PROGRAMA ---------- ");
        System.out.println("------------------------------------- ");
    }

    // Cálculo utilizado para colaboradores mensalistas
    public static double calculoMensalista(double a) {
        double teto;
        teto = a * 0.06;
        return teto;
    }
    
    // Cálculo utilizado para colaboradores comissionados
    public static double calculoComissionado(double a) {
        double teto;
        teto = a * 0.06;
        return teto;
    }
}
