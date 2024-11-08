/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yum_chungun_e1;

import static java.lang.Runtime.Version.parse;
import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Yum_ChungUn_E1 {

    
    public static void main(String[] args) {
       int opciones=0,suma=0, canalNormal=0,canalHd=0,tipoCanal,tipoCaja,subTotal=0, cantVocales=0,cantFilas,numeroImpar=1,sumaNumeros=0,contadorNumeros=0,max=0,temp=10;
       Scanner entrada = new Scanner (System.in);
       String nombreCliente, otroCanal="", cadenaUsuario,otroNumero="",numerosCadena="";
       char letra;
       int numeros[] = new int[temp]; 
       double promedio;
      
       
      do{
       
       System.out.println("Ingrese el ejercicio que desea acceder:\n1.Piramide\n2.El mayor\n3.Clientes\n4.Caracteres vocales\n5.Salir");
       opciones = entrada.nextInt();
       entrada.nextLine();
       
       switch(opciones){
       
           case 1:
               System.out.println("Ingrese la cantidad de filas en la piramide: ");
               cantFilas = entrada.nextInt();
               
               for(int i =0; i<cantFilas ; i++){
                   suma=0;
                  for(int j=0; j<=i;j++){
                  System.out.print(numeroImpar + " "  );
                  suma = suma+numeroImpar;
                  numeroImpar = numeroImpar+2;
                  }
                  
                  System.out.println("=" + suma);
                  System.out.println(" ");
               } 
               
            break;
       
           case 2:
               do{
               System.out.println("Ingrese un numero: ");
               numeros[contadorNumeros] = entrada.nextInt();
               contadorNumeros++;
               
               System.out.println("Desea ingresar otro numero? (si/no)");
               otroNumero = entrada.next().toLowerCase();
               }while(!otroNumero.equals("no"));
              
               
              for(int i =0;i<contadorNumeros;i++){
              max = Math.max(max,numeros[i]);
              }
              System.out.println("El numero maximo es: " + max);
              
              for(int i = 0;i<contadorNumeros;i++){
              sumaNumeros = sumaNumeros + numeros[i];
              }
              promedio = sumaNumeros/contadorNumeros;
              
              System.out.println("El promedio de los numeros es: " + promedio);
              
       
            break;
       
           case 3:
            
            System.out.println("Ingrese el nombre del cliente: ");
            nombreCliente = entrada.nextLine();
            
            do{
            System.out.println("Ingrese el tipo de canal a agregar:\n1.Hd\n2.Normal ");
            tipoCanal=entrada.nextInt();
            entrada.nextLine();
            
            if(tipoCanal == 1){
            canalHd++;
            }
            else if(tipoCanal ==2){
            canalNormal++;
            }
            else{
            System.out.println("Opcion invalida");
            System.exit(0);
            }
            
            System.out.println("Desea ingresar otro canal? (si/no)");
            otroCanal= entrada.next().toLowerCase();
            entrada.nextLine();
            
            System.out.println(canalNormal + canalHd);
                
            }while(!otroCanal.equals("no"));
            
            
            subTotal = subTotal + (canalNormal*20);
            subTotal = subTotal + (canalHd*30);
            
            System.out.println("Ingrese el tipo de caja deseada: \n1.Lightbox\n2.HdBox\n3.DvrBox");
            tipoCaja = entrada.nextInt();
            
            if(tipoCaja==1){
            subTotal =subTotal + 50;
            }
            else if(tipoCaja == 2){
            subTotal = subTotal + 100;
            }
            else if(tipoCaja == 3){
            subTotal = subTotal + 150;
            }
            else{
            System.out.println("Opcion invalida");
            System.exit(0);
            }
            
            System.out.println("Canales hd:" + canalHd + "\nCanales normales:" + canalNormal );
            System.out.println("Subtotal: Lps." + subTotal );
            
           
            double impuesto = (subTotal *15)/100;
            double total = subTotal + impuesto;     
            System.out.print(nombreCliente + ",\n"+ "Su total a pagar es: Lps." + total);
            break;
            
           case 4:
                           
               System.out.println("Ingrese una cadena, se contaran las vocales minusculas:");
               cadenaUsuario = entrada.nextLine();
               
               for(int i= 0; i<cadenaUsuario.length(); i++){
               letra = cadenaUsuario.charAt(i);
               
               switch(letra){
                   case 'a':
                       cantVocales++;
                       break;
                       
                   case'e':
                       cantVocales++;
                       break;
                       
                    case'i':
                        cantVocales++;
                        break;
                        
                    case 'o':
                        cantVocales++;
                        break;
                        
                    case 'u':
                        cantVocales++;
                        break;
               
               }}
           
               System.out.println("La cantidad de vocales minusculas en " + cadenaUsuario + " son " + cantVocales);
               
               break;
               
               
           case 5:
               System.out.println("Hasta luego");
               System.exit(0);
            
        }}while(opciones!=5);
    
    
    
    }}
