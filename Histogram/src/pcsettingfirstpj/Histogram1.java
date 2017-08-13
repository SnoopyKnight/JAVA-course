package pcsettingfirstpj;

import java.util.Scanner;


public class Histogram1 {

        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                String Input = keyboard.next();
        String input = Input.toLowerCase();
//		System.out.println(input);
        
        int len = input.length();
//      System.out.println(len);
        char[] list = getKeyList();
        int[] count = new int[list.length];
        for(int i =0; i< list.length; i++){
                int tempCount =0;
                for(int j = 0; j< input.length(); j++){
                        if(list[i]==input.charAt(j)){
                                count[i]++;
                                tempCount++;
                                continue;
                        }
                }
                if(tempCount>0){
                        System.out.println(list[i] + " " + tempCount);
                }
        }                
        }
        
        public static char[] getKeyList(){
//              String list ="abcdefghijklmnopqrstuvwxyz";
//              list += list.toUpperCase();
//              list+="0123456789";
                String list ="";
                for(char i = '0'; i<='9'; i++){
                        list+= String.valueOf(i);
                }
                for(char i = 'A'; i<='Z'; i++){
                        list+= String.valueOf(i);
                }
                for(char i = 'a'; i<='z'; i++){
                        list+= String.valueOf(i);
                }
              System.out.println(list);
                return list.toCharArray();
        }
}


