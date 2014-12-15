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
public class ResultDataAnalyzer {
    
    private String text;
    private int countPositive;
    private int countNegative;
    
   public ResultDataAnalyzer() {
       
   }
   
   public ResultDataAnalyzer(String text, int countPositive, int countNegative) {
       this.text = text;
       this.countPositive = countPositive;
       this.countNegative = countNegative;
   }
   
   @Override
   public String toString() {
       return this.text;
   }
   
   public int getCountPositive() {
       return this.countPositive;
   }
   public int getCountNegative() {
       return this.countNegative;
   }
   
    
}
