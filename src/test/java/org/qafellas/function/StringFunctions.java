package org.qafellas.function;

public class StringFunctions {

    public String toUpperCase(String str){
        return str.toUpperCase();
    }

    public String reverseString(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public boolean contains(String str, String letter){
        return str.contains(letter);
    }
}
