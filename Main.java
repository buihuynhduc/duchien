/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.text.html.HTML;

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
        System.out.println("1.tra cuu tu");
        System.out.println("2.tra cuu theo goi y");
        System.out.println("3.them sua xoa cac tu");
        System.out.println("4.dua du lieu vao file");
        System.out.println("5.thoat");
    Scanner input=new Scanner(System.in);
         int n;
     do
     {System.out.print("nhap lua chon cua ban : ");
     
          n=input.nextInt();
       while(!(n<=5)&&(n>=1))
       {
           System.err.print("xin vui long nhap lai lua chon cua ban : ");
           n=input.nextInt();
           
       }
       switch(n)
       {
           case 1:{
               dm.dictionaryLookup(d);
               break;
           }
           case 2:
           {
               System.err.print("chua nang cap");
               break;
           }
           case 3:
           {
               System.out.println("1.them tu");
        System.out.println("2.xoa tu");
        System.out.println("3.sua tu");
        int ba=input.nextInt();
        switch(ba)
        {
            case 1:
            {
                dm.dictionaryadd(d);
                dm.dictionaryExportToFile(d);
                break;
            }
            case 2:
            {
                dm.dictionaryDelete(d);
                dm.dictionaryExportToFile(d);
                break;
            }
            case 3:
            {
                dm.dictionaryrepair(d);
                dm.dictionaryExportToFile(d);
                break;
            }
        }
        
        
        
        
        
        
        
        break;
        
           }
           case 4:
           {
               dm.insertFromFile(d);
               break;
               
           }
           
               
           }
       }while(n!=5);
               
        
   
        
  
 
  
           
     





   
      
        
       
        
        
        
    }
    
}
