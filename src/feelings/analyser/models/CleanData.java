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
    public CleanData() {
        
    }
    
    public void setStreamToClean(String s) {
        this.streamToClean = s;
    }
    
    public String textToLowerCase(String text) {
        this.text = text.toLowerCase();
        return this.text;
    }
    public String textToLowerCase() {
        return this.streamToClean.toLowerCase();
    }
    
    public String removeAcentos(String text) {
        String textClean = "";
        String[] auxArray = text.split(" ");
        for(int j =0 ; j < auxArray.length;j++) {
            String a = auxArray[j];
            String newText = "";
            a = a.replace('á','a');
            a = a.replace('é','e');
            a = a.replace('í','i');
            a = a.replace('ó','o');
            a = a.replace('ú','u');
            auxArray[j] = a;
            textClean += auxArray[j] + " ";
        }
        return textClean;
        
    }
    public String removeAcentos() {
        String textClean = "";
        String[] auxArray = this.streamToClean.split(" ");
        for(int j =0 ; j < auxArray.length;j++) {
            String a = auxArray[j];
            String newText = "";
            a = a.replace('á','a');
            a = a.replace('é','e');
            a = a.replace('í','i');
            a = a.replace('ó','o');
            a = a.replace('ú','u');
            auxArray[j] = a;
            textClean += auxArray[j];
        }
        return textClean;
        
    }
    public String removePuntuationMarks(String text) {
        String[] auxArray = text.split(" ");
        String textClean   = "";
        for(int j = 0; j < auxArray.length; j++) {
            String a = auxArray[j];
            a = a.replace(".","");
            a = a.replace(",","");
            a = a.replace("!","");
            a = a.replace("¡","");
            a = a.replace(":","");
            a = a.replace(";","");
            a = a.replace("?","");
            a = a.replace("¿","");
            a = a.replace("-","");
            a = a.replace("_","");
            auxArray[j] = a;
            textClean += auxArray[j] + " ";
            
        }
        return textClean;
        
    }
}
