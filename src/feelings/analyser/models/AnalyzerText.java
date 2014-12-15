/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feelings.analyser.models;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author AdrianM
 */
public class AnalyzerText {
    private String postToAnalyze = "";
    private String[] positiveWorks = new String[100];
    private String[] negativeWorks = new String[100];
    private int countPositive;
    private int countNegative;
    
    public AnalyzerText() {
        readNegativeWorks();
        readPositiveWorks();
    }
   
    public void setPostToAnalyse(String post) {
        this.postToAnalyze = post;
        this.countNegative = 0;
        this.countPositive = 0;
    }
    
    
    public void readPositiveWorks() {
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        BufferedReader br = null;
        File file = new File(System.getProperty("user.dir") + "\\src\\assets\\Buenas.txt");
        try {
            int count = 0;
            fileInputStream = new FileInputStream(file);
            dataInputStream = new DataInputStream(fileInputStream);
            br = new BufferedReader(new InputStreamReader(dataInputStream,"UTF-8"));
            String line = "";
            while((line = br.readLine()) != null) {
                this.positiveWorks[count] = line.toLowerCase();
                count++;
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
                dataInputStream.close();
                fileInputStream.close();
            } catch( Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        
    }
    
     public void readNegativeWorks() {
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        BufferedReader br = null;
        File file = new File(System.getProperty("user.dir") + "\\src\\assets\\Malas.txt");
        try {
            int count = 0;
            fileInputStream = new FileInputStream(file);
            dataInputStream = new DataInputStream(fileInputStream);
            br = new BufferedReader(new InputStreamReader(dataInputStream,"UTF-8"));
            String line = "";
            while((line = br.readLine()) != null) {
                this.negativeWorks[count] = line.toLowerCase();
                count++;
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
                dataInputStream.close();
                fileInputStream.close();
            } catch( Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        
    }
     
    public void textAnalyze() {
        try {
            String[] auxArray = postToAnalyze.split(" ");
            for(int i = 0; i < auxArray.length; i++) {
                String a = auxArray[i];
                String auxNegative = "";
                if( i >= 2) {
                    auxNegative = auxArray[i - 2];
                }
                for(String positive : this.positiveWorks) {
                    if(a.equals(positive)) {
                        countPositive += 1;
                        if(auxNegative.equals("no")) {
                            countPositive -= 1;
                            countNegative += 1;
                        }

                    }
                }
                for(String negative : this.negativeWorks) {
                    if(a.equals(negative)) {
                        countNegative += 1;
                        if(auxNegative.equals("no")) {
                            countNegative -= 1;
                            countPositive += 1;
                        }
                    }
                }
            }
        }catch (NullPointerException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public int getPositiveCount() {
        return this.countPositive;
    }
    
    public int getNegativeCount() {
        return this.countNegative;
    }
    
}


