import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pedir tempo de aula
        System.out.println("Quantos minutos de aula? ");
        int mins = scanner.nextInt();
        
        //calcular valor da aula
        double valor = 0;
        if(mins>0 && mins<=65){
            valor=30.00;
            System.out.println("O valor da aula é: R$ "+valor+"");
        }
        else if(mins==65 || mins==95){
            valor=30.00;
            System.out.println("O valor da aula é: R$ "+valor+"");
        }
        else{
            int i=0;
            double valorTotal = 30.00;
            while(mins>=0){
                mins=mins-30;
                i++;
                valorTotal=+(i*10);
            }
            //mostar valor da aula
            System.out.println("O valor da aula é: R$ " + valorTotal);
           
        }

        scanner.close();
        

}
}   

