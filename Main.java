/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author My PC
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
      DictionaryManagement dm=new DictionaryManagement();
   Dictionary d=new Dictionary();
   DictionaryCommandline dc =new DictionaryCommandline();
   dm.insertFromFile(d);
   dc.showAllWords(d);
  
           
     





   
      
        
       
        
        
        
    }
    
}
