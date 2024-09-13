package Oblig;

public class Oppgave_7_1 {

    public static String plait(String s, String t){
        String result = "";

        int i = 0, j = 0;

        while(i < s.length() || j < t.length()){
            if(i < s.length()){
                result = result + s.charAt(i);
                i++;
            }
            if(j < t.length()){
                result = result + t.charAt(j);
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(plait("ABC", "DEF"));
        System.out.println(plait("IJKLMN", "OPQ"));
        System.out.println(plait("", "AB"));
    }
}
