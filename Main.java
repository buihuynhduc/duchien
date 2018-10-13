
package btl;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



 public class DictionaryManagement {
    public void insertFromCommandline(Dictionary d)
    {
            System.out.print("nhap so luong tu muon them :");
            Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    scanner.nextLine();
    for(int i=0;i<n;i++)
    { System.out.print("nhap tieng anh : ");
        String s_target =scanner.nextLine();
       System.out.print("nhap tieng viet : ");
        String s_explain =scanner.nextLine();
        Word tumoi= new Word(s_target,s_explain);
        d.list.add(tumoi);
        System.out.println("xong!!!!!!");
    
     }
     Collections.sort(d.list, new Comparator<Word>()
                {
                    @Override
                public int compare(Word word1, Word word2)
                    {
                 return (word1.getwordtarget().compareTo(word2.getwordtarget()));
                   }
               }); 
   
    
    
    }
 public void insertFromFile(Dictionary d) {      
        try (Scanner input = new Scanner(new File("dictionaries.txt"))) // file nam trong file btl
        {
         while(input.hasNext()){
                String target = input.next();
                String explain = input.nextLine();
            Word words = new Word(target,explain);
                d.list.add(words);
            }
        }
       catch (Exception e){
             System.out.println(e.getMessage());
         }
    }   
public void dictionaryLookup(Dictionary d)
{
    System.out.print("nhap tu can tim kiem : ");
    Scanner input=new Scanner(System.in);
    String english=input.next();
    int dem=0;
    for(Word word : d.list)
    {
        if(word.getwordtarget().equals(english))
        {
            System.out.println("tieng viet : "+word.getwordexplain());
         
            dem++;
        }
        else
        {
            continue;
        }
    }
    if(dem==0)
    {
        System.err.println("khong tim thay trong tu dien");
    }
    
}
public void dictionaryrepair(Dictionary d)
{
    System.out.print("nhap tu ban muon sua : ");
    Scanner input=new Scanner(System.in);
    String english =input.next();
    int dem=0;
    for(Word word : d.list)
    {
        if(word.getwordtarget().equals(english))
        {
          d.list.remove(word);//xoa tu do truoc
          dem++;
          break;
        }
        else
        {
            continue;
        }
    }
    if(dem==0)
    {
        System.err.println("khong tim thay trong tu dien");
    }
    if(dem!=0)
    { System.out.print("nhap tu tieng anh ban muon thay the : ");
    String wordtarget=input.next();
    System.out.print("nhap tu tieng viet ban muon thay the : ");
    String wordexplain=input.next();
    Word word=new Word(wordtarget,wordexplain);
    d.list.add(word);
        System.out.println("da sua");
        
    }
    Collections.sort(d.list, new Comparator<Word>()
                {
                    @Override
                public int compare(Word word1, Word word2)
                    {
                 return (word1.getwordtarget().compareTo(word2.getwordtarget()));
                   }
               }); 
         
        
 
    
    
    
    
    
    
    
}
public void dictionaryadd(Dictionary d)
{Scanner input=new Scanner(System.in);

    System.out.print("nhap tu tieng anh ban muon them : ");
    String wordtarget=input.next();
    System.out.print("nhap tu tieng viet ban muon them : ");
    String wordexplain=input.next();
    Word word=new Word(wordtarget,wordexplain);
    d.list.add(word);
    System.out.println("da them tu moi");
     Collections.sort(d.list, new Comparator<Word>()
                {
                    @Override
                public int compare(Word word1, Word word2)
                    {
                 return (word1.getwordtarget().compareTo(word2.getwordtarget()));
                   }
               }); 
    
    
}
public void dictionarydelete(Dictionary d)
{
    System.out.print("nhap tu ban muon xoa : ");
    Scanner input =new Scanner(System.in);
    String english=input.next();
     int dem=0;
    for(Word word : d.list)
    {
        if(word.getwordtarget().equals(english))
        {
          d.list.remove(word);
          dem++;
          break;
        }
        else
        {
            continue;
        }
    }
    if(dem==0)
    {
        System.err.println("khong tim thay trong tu dien");
    }
    
    
}
public void dictionaryExportToFile(Dictionary d) throws IOException 
{ Collections.sort(d.list, new Comparator<Word>()
                {
                    @Override
                public int compare(Word word1, Word word2)
                    {
                 return (word1.getwordtarget().compareTo(word2.getwordtarget()));
                   }}); 
   
    try{
         FileWriter file =new FileWriter("dictionaries.txt");
        for(Word word : d.list)
        {
            file.write(word.getwordtarget()+" "+word.getwordexplain()+"\r\n");
        }
        file.close();
    }
    catch(Exception e)
            {
                System.err.print(e);
            }
   
    
}

 }


    
  
    
 
 
 
 
 
 

     
    
    

     

 
    
       
         
         
    

 
