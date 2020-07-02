package BTVN5;

import BTVN.InputOutputStream1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class Bai4 {
    public static String nhapchuoi() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        String s = br.readLine();
        return s;
    }
    public static String Convert(String s){
        char[] chars = s.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') {
                found = false;
            }
        }
        return String.valueOf(chars);
    }
    public static void ConvertToChar(String s){
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length ; i++) {
            System.out.println(strings[i]);
        }
    }
    public static void ConvertToSpeech(String s){
        char ch[] = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            switch(ch[i]) {
                case 'a':
                    System.out.println(ch[i]);
                    break;
                case 'e':
                    System.out.println(ch[i]);
                    break;
                case 'i':
                    System.out.println(ch[i]);
                    break;
                case 'o':
                    System.out.println(ch[i]);
                    break;
                case 'u':
                    System.out.println(ch[i]);
                    break;
            }
        }
    }
    public static void ConvertToCharLength(String s){
        String[] strings = s.split(" ");
        int count = 0;
        for (int i = 0; i < strings.length ; i++) {
            ++count;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        InputOutputStream1 dt = new InputOutputStream1();
        String Name = null;
        try {
            do {
                System.out.println("Nhap chuoi cua ban : ");
                Name = dt.nhapchuoi();
            } while (Name == null);
            System.out.println("chuoi sau khi chuyen thanh hoa tung tu : " + Convert(Name));
            System.out.println("chuoi sau khi cat ra tung tu: ");
            ConvertToChar(Name);
            System.out.println("In ra nguyen am trong chuoi: ");
            ConvertToSpeech(Name);
            System.out.println("So tu co trong chuoi: ");
            ConvertToCharLength(Name);


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
