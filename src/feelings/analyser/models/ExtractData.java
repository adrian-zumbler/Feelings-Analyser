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
public class ExtractData {
    private File file = null;
    private String[] posts = new String[100]; 
    
    
    public void readFile(File file) {
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        BufferedReader br = null;
        try {
            int count = 0;
            this.file = file;
            fileInputStream = new FileInputStream(this.file);
            dataInputStream = new DataInputStream(fileInputStream);
            br = new BufferedReader(new InputStreamReader(dataInputStream));
            String line = "";
            while((line = br.readLine()) != null) {
                posts[count] = line.toLowerCase();
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
    
    public String[] getPosts() {
        return this.posts;
    }
    
}
