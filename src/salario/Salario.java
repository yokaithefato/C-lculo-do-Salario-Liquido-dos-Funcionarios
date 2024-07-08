
package salario;
import java.util.Scanner;

public class Salario {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println(" informe o salario bruto do operador ");
         double salario = input.nextDouble();
        System.out.println(" informe quantas horas foi trabalahada ");
        double horas = input.nextDouble();
        
    
       if(horas>160){
           salario = salario+ (horas- 160) *(salario/160)*1.5;
           
           
       }
       if(salario<800){
           System.out.println("o salario liquido e " +salario);
           
       }
       else if (salario>800.00 && salario<=1600.00){
           double SalarioLiquido = salario*0.13;
          
            double salarioReal=salario-SalarioLiquido;
           System.out.println(+salarioReal);
       
       }
         else {
           double SalarioBruto = salario;
           
                   salario = salario *0.22;
                   SalarioBruto= SalarioBruto -salario;
                   System.out.println("salario liquido e " +SalarioBruto);
                   }
    }
    
}
