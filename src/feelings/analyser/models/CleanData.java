/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feelings.analyser.models;

/**
 *
 * @author AdrianM
 */
public class CleanData {
    String streamToClean = "";
    String text = "";
    
    
    public CleanData(String s) {
        this.streamToClean = s;
    }
    
    public String textToLowerCase(String text) {
        this.text = text.toLowerCase();
        return this.text;
    }
    public String textToLowerCase() {
        return this.streamToClean.toLowerCase();
    }
    
    public void removeAcentos(String text) {
        String[] auxArray = text.split(" ");
        for(int j =0 ; j < auxArray.length;j++) {
            String a = auxArray[j];
            String newText = "";
            for(int i = 0; i < a.length(); i++ ) {
                char aux = a.charAt(i);
                switch (aux) {
                    case 'á':
                        newText = a.replace(aux, 'a');
                        break;
                    case 'é':
                        newText =  a.replace(aux, 'e');
                        break;
                    case 'í':
                        newText =  a.replace(aux, 'i');
                        break;
                    case 'ó':
                        newText =  a.replace(aux,'o');
                        break;
                    case 'ú':
                        newText =  a.replace(aux,'u');
                        break;    
                }
            }
            auxArray[j] = newText;
            
            
        }
        
    }
    public void removeAcentos() {
        String[] auxArray = this.streamToClean.split(" ");
        for(int j =0 ; j < auxArray.length;j++) {
            String a = auxArray[j];
            String newText = "";
            for(int i = 0; i < a.length(); i++ ) {
                char aux = ' ';
                aux = a.charAt(i);
                switch (aux) {
                    case 'á':
                        newText = a.replace(aux, 'a');
                        break;
                    case 'é':
                        newText =  a.replace(aux, 'e');
                        break;
                    case 'í':
                        newText =  a.replace(aux, 'i');
                        break;
                    case 'ó':
                        newText =  a.replace(aux,'o');
                        break;
                    case 'ú':
                        newText =  a.replace(aux,'u');
                        break;
                    default:
                        newText = auxArray[j];
                        break;
                }
            }
            auxArray[j] = newText;
            System.out.println(auxArray[j]);
            
            
        }
        
    }
}
