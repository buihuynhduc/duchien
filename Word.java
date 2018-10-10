/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

/**
 *
 * @author My PC
 */
public class Word {

    

   

    
     String word_target ;
     String word_explain ;

    Word() {
    }

    

   
    public String getwordtarget()
    {
        return word_target;
    }
    public void setwordtarget(String word_target)
            
    {
        this.word_target=word_target;
        
    
    }
    public String getwordexplain()
    {
        return word_explain;
    }
    public void setwordexplain(String word_explain)
            
    {
        this.word_explain=word_explain;
        
        
    
    }
    public Word(String word_target,String word_explain)
    {
        this.word_explain=word_explain;
        this.word_target=word_target;
        
    }

   
    
}
