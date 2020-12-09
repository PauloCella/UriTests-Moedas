import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String entrada1 = "";
        Scanner leitor = new Scanner(System.in);
        entrada1 = leitor.next();
        Double entrada = Double.valueOf(entrada1);


        int notas100 = 0;
        int notas50 = 0;
        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;

        int moedas1 = 0;
        int moedas50 = 0;
        int moedas25 = 0;
        int moedas10 = 0;
        int moedas05 = 0;
        int moedas01 = 0;


        if(entrada >= 100){
            notas100 = (int) (entrada/100);
            entrada = entrada - (100*notas100);
        }
        if(entrada >= 50){
            notas50 = (int) (entrada/50);
            entrada = entrada - (50*notas50);
        }
        if(entrada >= 20){
            notas20 = (int) (entrada/20);
            entrada = entrada - (20*notas20);
        }
        if(entrada >= 10){
            notas10 = (int) (entrada/10);
            entrada = entrada - (10*notas10);
        }
        if(entrada >= 5){
            notas5 = (int) (entrada/5);
            entrada = entrada - (5*notas5);
        }
        if(entrada >= 2){
            notas2 = (int) (entrada/2);
            entrada = entrada - (2*notas2);
        }


        if(entrada >= 1){
            moedas1 = (int) (entrada/1);
            entrada = entrada - (1 * moedas1);
        }
        if(entrada >= 0.5){
            moedas50 = (int) (entrada/0.5);
            entrada = entrada - (0.5 * moedas50);
        }
        if(entrada >= 0.25){
            moedas25 = (int) (entrada/0.25);
            entrada = entrada - (0.25 * moedas25);
        }
        if(entrada >= 0.10){
            moedas10 = (int) (entrada/0.10);
            entrada = entrada - (0.10 * moedas10);
        }
        if(entrada >= 0.05){
            moedas05 = (int) (entrada/0.05);
            entrada = entrada - (0.05 * moedas05);
        }
        if(entrada >= 0.01){
            moedas01 = (int) Math.round(entrada/0.01);
            entrada = entrada - (0.01 * moedas01);
        }

        System.out.println("NOTAS:");
        System.out.println(notas100+" nota(s) de R$ 100.00");
        System.out.println(notas50+" nota(s) de R$ 50.00");
        System.out.println(notas20+" nota(s) de R$ 20.00");
        System.out.println(notas10+" nota(s) de R$ 10.00");
        System.out.println(notas5+" nota(s) de R$ 5.00");
        System.out.println(notas2+" nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moedas1+" moeda(s) de R$ 1.00");
        System.out.println(moedas50+" moeda(s) de R$ 0.50");
        System.out.println(moedas25+" moeda(s) de R$ 0.25");
        System.out.println(moedas10+" moeda(s) de R$ 0.10");
        System.out.println(moedas05+" moeda(s) de R$ 0.05");
        System.out.println(moedas01+" moeda(s) de R$ 0.01");

    }

}