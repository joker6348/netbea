/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aksat;

/**
 *
 * @author CLAB_31
 */
public class strclass {

    public int len(String s) {
        return s.length();
    }

    public char chat(String s, int i) {
        return s.charAt(i);
    }

    public int compare(String s, String z) {
        return s.compareTo(z);
    }

    public boolean equ(String s, String z) {
       return  s.equals(z);
    }
    
    public String conc(String s, String y){
        return s.concat(y);
    }
      
    public int index(String s,char c){
        return s.indexOf(c);
    }
    
    public int lastIndex(String s,char c){
        return s.lastIndexOf(c);
    }
    
    public String subst(String s,int i){
        return s.substring(i);
    }
    
    public String subst(String s,int i,int j){
        return s.substring(i,j);
    }
    
    public String repl(String s,char z,char i){
       return s.replace(z, i);
    } 
    
            
}
