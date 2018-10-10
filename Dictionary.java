/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

import java.util.ArrayList;

public  class Dictionary {
    public ArrayList<Word> list=new ArrayList<>();
    public ArrayList<Word> getWord()
    {
        return list;
    }
    public void setWord(ArrayList<Word> word)
    {
        this.list=word;
  }
}
