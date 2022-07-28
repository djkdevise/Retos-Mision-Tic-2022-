//package actividad;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ContaIPUC
 */
public class reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nunCuerposAgua;
 
    
    // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //System.out.print("Ingrese la cantidad de cuerpos de Agua: ");
                      
       nunCuerposAgua = Integer.parseInt(leer.nextLine());
        
      
        
        CuerpoDeAgua[] vectordeCuerpoDeAgua = new CuerpoDeAgua[nunCuerposAgua];
        String datos;
             
        for(int i = 0;i<nunCuerposAgua;i++){
        datos="";
         
        datos = leer.nextLine();
        String[] newDatos = datos.split(" ");   
        vectordeCuerpoDeAgua[i] = new CuerpoDeAgua(newDatos[0],Integer.parseInt(newDatos[1]),newDatos[2],Double.parseDouble(newDatos[3]));
        }
        
        for (int i = 0; i < vectordeCuerpoDeAgua.length; i++) {
            System.out.println(vectordeCuerpoDeAgua[i].getNivelRiesgo());   
        }
        
         int contador = 0; //Se inicializa en 0 para contar cuerpos de Agua Nivel bajo o inferior
         String listaNombres = ""; //Alamacenara nombres de cuerpo de agua con Nivel Bajo
         double minIRCA = 100; //Almacenara el cuerpo con menor IRCA
         int posicion = 0; //Almacenara posision el cuerpo con menor IRCA
         
         //Inicio del for
         for (int i = 0; i < vectordeCuerpoDeAgua.length; i++) {
             
             Double nivelRiesgo = vectordeCuerpoDeAgua[i].getIrca();
             
             //Validamos cuerpos de de Agua nivel es Medio o Inferior
             if (nivelRiesgo <= 35){
                 
                  //Actuliza variable contador si cuerpos de Agua nivel es Medio o Inferior
                  contador = contador + 1;  
                  
                  
                 if (vectordeCuerpoDeAgua[i].getNivelRiesgo()=="MEDIO") {
                    //Solo guadamos los nombre de Cuerpos de Agua nivel MEDIO
                    listaNombres = listaNombres + vectordeCuerpoDeAgua[i].getNombre()+ " " ;  
                    }
                
             } 
             
             //Validamos IRCA mas Baja encontrada
             if (vectordeCuerpoDeAgua[i].getIrca() < minIRCA ){
                  minIRCA = vectordeCuerpoDeAgua[i].getIrca();
                  posicion = i;
             }  
        }
       
         System.out.println(contador);
        
        
        if (listaNombres==""){
            System.out.println("NA");   
        }else{
         
         System.out.println(listaNombres);    
           
        }
        
        System.out.println(vectordeCuerpoDeAgua[posicion].getNombre() + " " + vectordeCuerpoDeAgua[posicion].getNumeroID());
        
        
    }
   
    
    
}

    
    
    

