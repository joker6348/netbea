package aksat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author CLAB_31
 */
public class palindrome {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter word");
        String s="",r=br.readLine();
        int l=r.length();
        
        for(int x=l-1;x>=0;x--)
        {
            char c=r.charAt(x);
            s=s+c;
           
        }
        System.out.println(s);
        if(s.equals(r))
            System.out.println("y");
        else
            System.out.println("n");
    }
}
