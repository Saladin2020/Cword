/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cword;

import cword.counterWord.CW;
import java.io.IOException;
import java.util.ArrayList;
import readWord.readWord;

/**
 *
 * @author User
 */
public class Cword {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        CW c = new CW();
        ArrayList<readWord> list = new ArrayList<>();
        readWord rwd = new readWord();
        /*rwd.readText("D:\\Saladin.txt");
        System.err.println(rwd.getWord());
        for(String str : rwd.getSplWord()){
            c.insertWord(str);
        }
        c.Travalsal();
         */

        rwd.readURL("http://www.lazada.co.th/?utm_source=google&utm_medium=sem_brand&utm_campaign=%5BSEM-000000000000-00000-TH000-0%5D%3A+EN%7CCB_Lazada&utm_content=lazada.&utm_term=%5BSEM-000000000000-00000-TH000-0%5D%3A+EN+Lazada+%7BE%7D_xxto0000000at0000_c_aud-155560556661:kwd-40942277449&adjust_tracker=t2v78t_5n20iw&adjust_campaign=145954808&adjust_adgroup=13268487008&adjust_creative=lazada._e&adjust_label=%7B%22ClientID%22%3A%22470-818-3371%22%7D&gclid=Cj0KEQjw4rbABRD_gfPA2-uQqroBEiQA58MNdJbVJtI4roZOKu0nwYgX4cOkHx2iXn8gEL4dEv87YVgaAppy8P8HAQ#!");
        list.add(rwd);
        
        //rwd = new readWord();
        //rwd.readURL("http://www.bbc.com/news");
        //list.add(rwd);
        
        //rwd = new readWord();
        //rwd.readURL("http://edition.cnn.com/");
        //list.add(rwd);

        //System.err.println(rwd.getWord());
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            for (String str : list.get(i).getSplWord()) {
                c.insertWord(str);
            }
            sum = sum + list.get(i).getSplWord().length;
        }
        System.err.println("SUM : " + sum);
        //System.err.println("-----------------------Traversal");
        //c.Traversal();
        System.err.println("-----------------------Sort by value");
        c.MaxFre();
        System.err.println("-----------------------Searching");
        c.Searching("clinton");
        c.Searching("clinton's");
        c.Searching("Donald");
        c.Searching("trump");
        c.Searching("battle");
        c.Searching("aleppo");
    }

}
