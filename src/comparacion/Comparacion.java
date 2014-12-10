/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comparacion;

/**
 *
 * @author JairoRoberto
 */
public class Comparacion {
    String[] buenas = {"buena", "agrada", "bonita"};
    String cadena1= "No me agrada el color de la mochila es inutil";
        //System.out.println(arraycar);
    String[] array = cadena1.split(" ");
        
    String[] malas = {"fea", "inutil"};
    int countBuenas;
    int countMalas;
    /**
     * @param args the command line arguments
     */
    public  void main(String[] args) {
        // TODO code application logic here
        //Comparacion cadena= new Comparacion();
        //char[] arraycar={'p','a','j','a','r','r','a','c','o'};
        
        for(String a : array) {
            compararBuenas(a);
            compararMalas(a);
            optenerPorcentaje();
        }
    }
   
    public  void compararBuenas(String positivo){
        for (int i = 0; i < buenas.length; i++) {
                if (buenas[i].equals(positivo)) {
                    countBuenas += 1;
                    System.out.println("si buenas");
                    
                }
            }
    }
    
    public void compararMalas(String negativas){
        for (int i = 0; i < malas.length; i++) {
               if (malas[i].equals(negativas)) {
                   countMalas += 1;
                    System.out.println("si malas");
                } 
            }
    }
    
    public void optenerPorcentaje(){
        int dividendo = countMalas + countBuenas;
        double porMalas = countMalas / dividendo;
        double porBuenas = countMalas /dividendo;
        
        
    }
    
}
    

