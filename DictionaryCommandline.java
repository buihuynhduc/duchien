/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

import java.util.Collections;


public class DictionaryCommandline {

    public void showAllWords(Dictionary d)
    {
        System.out.printf("%-5s|%-20s|%-20s","No","English","Vietnamese");
        System.out.println("");
        for(int i=0;i<d.list.size();i++)
        {
            System.out.printf("%-5s|%-20s|%-20s",i+1,d.getWord().get(i).getwordtarget(),d.getWord().get(i).getwordexplain());
            System.out.println("");

        }
    }
    public void dictionaryBasic()
    {Dictionary word=new Dictionary();
    DictionaryManagement dm=new DictionaryManagement();
    dm.insertFromCommandline(word);
        showAllWords(word);
   }
   public void dictionaryAdvanced() 
   {
       Dictionary word=new Dictionary();
    DictionaryManagement dm=new DictionaryManagement();
    dm.insertFromCommandline(word);
    dm.insertFromFile(word);
    dm.dictionaryLookup(word);
        showAllWords(word);
   }
    
   
   


    }
    

    
    

