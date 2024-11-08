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
       //Diccionario de variables
       int opciones=0,suma=0, canalNormal=0,canalHd=0,tipoCanal,tipoCaja,subTotal=0, cantVocales=0,cantFilas,numeroImpar=1,sumaNumeros=0,contadorNumeros=0,max=0,temp=10;
       Scanner entrada = new Scanner (System.in);
       String nombreCliente, otroCanal="", cadenaUsuario,otroNumero="",numerosCadena="";
       char letra;
       int numeros[] = new int[temp]; 
       double promedio;
      
       
      do{ //todo dentro de un do-while para que se repita hasta que el usuario ingrese la opcion para salir
       
       System.out.println("Ingrese el ejercicio que desea acceder:\n1.Piramide\n2.El mayor\n3.Clientes\n4.Caracteres vocales\n5.Salir");
       opciones = entrada.nextInt();
       entrada.nextLine(); //se registra el ejercicio que el usuario desea acceder
       
       switch(opciones){//con un switch se accede a cada ejercicio
       
           case 1:
               System.out.println("Ingrese la cantidad de filas en la piramide: ");
               cantFilas = entrada.nextInt(); //se registran las cantidades de filas que desea el usuario
               
               for(int i =0; i<cantFilas ; i++){ //se utilizan dos ciclos for, el primero asegura las filas en si
                   suma=0; //la suma se reestablece a 0 
                  for(int j=0; j<=i;j++){ //el segundo for realiza lo que hay en cada fila
                  System.out.print(numeroImpar + " "  ); 
                  suma = suma+numeroImpar;  //el variable suma va sumando todos los numeros impares de la fila
                  numeroImpar = numeroImpar+2; //ya que todos los numeros de las filas son impares, se inicializa en 1 y se le va sumando 2 en cada iteracion del ciclo
                  }
                  
                  System.out.println("= " + suma); //se imprime el resultado de la suma
                  System.out.println(" "); //se pasa a una linea nueva
               } 
               
            break;
       
           case 2:
               do{ //le pide numeros hasta que dice que no quiere ingresar mas
               System.out.println("Ingrese un numero: ");  
               numeros[contadorNumeros] = entrada.nextInt(); //el arreglo fue inicializado con un largo de variable temporal en el diccionario, pero aqui se cambia al contador de numeros
               contadorNumeros++;
               
               System.out.println("Desea ingresar otro numero? (si/no)");
               otroNumero = entrada.next().toLowerCase();
               
               
               }while(!otroNumero.equals("no")); 
              
               
              for(int i =0;i<contadorNumeros;i++){ //recorre el arreglo para encontrar el maximo
              max = Math.max(max,numeros[i]);
              }
              System.out.println("El numero maximo es: " + max);
              
              for(int i = 0;i<contadorNumeros;i++){//recorre el arreglo para sumar todos los numeros
              sumaNumeros = sumaNumeros + numeros[i];
              }
              promedio = sumaNumeros/contadorNumeros; // se saca el promedio
              
              System.out.println("El promedio de los numeros es: " + promedio);
              
       
            break;
       
           case 3:
            
            System.out.println("Ingrese el nombre del cliente: ");
            nombreCliente = entrada.nextLine(); //registra el nombre del cliente
            
            do{ //valida  que pida canales hasta que el cliente no quiera mas
            System.out.println("Ingrese el tipo de canal a agregar:\n1.Hd\n2.Normal ");
            tipoCanal=entrada.nextInt();
            entrada.nextLine(); //registra el tipo de canal que desea el usuario
            
            if(tipoCanal == 1){//le agrega al contador de cada tipo de canal
            canalHd++;
            }
            else if(tipoCanal ==2){
            canalNormal++;
            }
            else{//si no es una de las opciones, sale del programa
            System.out.println("Opcion invalida");
            System.exit(0);
            }
            
            System.out.println("Desea ingresar otro canal? (si/no)");
            otroCanal= entrada.next().toLowerCase();
            entrada.nextLine();
            
            System.out.println(canalNormal + canalHd);
                
            }while(!otroCanal.equals("no"));
            
            
            subTotal = subTotal + (canalNormal*20); //le calcula el subtotal dependiendo del precio de los canales
            subTotal = subTotal + (canalHd*30);
            
            System.out.println("Ingrese el tipo de caja deseada: \n1.Lightbox\n2.HdBox\n3.DvrBox");
            tipoCaja = entrada.nextInt(); //registra el tipo de caja
            
            if(tipoCaja==1){ //le agrega el valor de la caja elegida al subtotal
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
            System.out.println("Subtotal: Lps." + subTotal ); // imprime el subtotal
            
           
            double impuesto = (subTotal *15)/100; //saca el 15% del subtotal
            double total = subTotal + impuesto;     //suma el total
            System.out.print(nombreCliente + ",\n"+ "Su total a pagar es: Lps." + total);
            break;
            
           case 4:
                           
               System.out.println("Ingrese una cadena, se contaran las vocales minusculas:");
               cadenaUsuario = entrada.nextLine(); //registra la cadena del usuario
               
               for(int i= 0; i<cadenaUsuario.length(); i++){ //ciclo para buscar las vocales por el largo de la cadena
               letra = cadenaUsuario.charAt(i); //sacando las letras individuales de las cadenas
               
               switch(letra){ //se cuentan las vocales con un contador
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
           
               System.out.println("La cantidad de vocales minusculas en " + cadenaUsuario + " son " + cantVocales); //se imprime
               
               break;
               
               
           case 5:
               System.out.println("Hasta luego"); //salir
               System.exit(0);
               
           default: //si el usuario no ingresa una opcion valida
               System.out.println("Opcion invalida");
            
        }}while(opciones!=5);
    
    
    
    }}
