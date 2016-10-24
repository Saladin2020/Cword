/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cword.counterWord;

/**
 *
 * @author User
 */
public class Data {

        private String str;
        private int count;

        public Data() {
            this.str = "";
            this.count = 0;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }

        public void setStr(String str) {
            this.str = str;
        }

        public String getStr() {
            return str;
        }

    }
