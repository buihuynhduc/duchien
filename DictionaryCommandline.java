/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


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
  public void dictionarySearcher(Dictionary d) {
     
        System.out.print("Nhap tu can tra theo goi y : ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
           
        DictionaryManagement dm = new DictionaryManagement();
        int vitri= dm.binarySearch(d,word);
          System.out.printf("%-5s|%-20s|%-20s","No","English","Vietnamese");
          System.out.println("");
        if (vitri!= -1) {
            while (d.list.get(vitri).getwordtarget().startsWith(word)) {
                System.out.printf("%-5s|%-20s|%-20s", vitri,d.list.get(vitri).getwordtarget(),d.list.get(vitri).getwordexplain());
                System.out.println("");
                if (vitri<d.list.size()-1)
                {vitri++;
                } 
                else 
                {
                break;
                }
                }
                        } 
        if(vitri==-1)
        {
            System.err.print("khong the tra ra!!!!!!!!!");
        }
    }
 }
    
   
   


    
    

    
    

