/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feelings.analyser;

import feelings.analyser.models.CleanData;
import feelings.analyser.models.ExtractData;
import java.io.File;
import feelings.analyser.views.MainView;


/**
 *
 * @author AdrianM
 */
public class FeelingsAnalyser {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ExtractData data = new ExtractData();
        File file = new File("C:\\Users\\AdrianM\\Documents\\NetBeansProjects\\Feelings Analyser\\src\\assets\\Comentarios Mochila.txt");
        data.readFile(file);
        for (String a : data.getPosts()) {
            System.out.println(a);
        }
        char o = 'o';
        int asci = (int) o;
        System.out.println(asci);*/
        CleanData data = new CleanData("El móvil de la combinación");
        data.textToLowerCase();
        data.removeAcentos();
        MainView mainView = new MainView();
        mainView.setVisible(true);
        
        
        
    }
    
}
