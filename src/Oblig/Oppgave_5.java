package Oblig;

public class Oppgave_5 {

    public static void rotasjon(char [] a){
        if(a == null){
            return;
        }
        char last = a[a.length - 1];

        for(int i = a.length - 1; i > 0; i--){
            a[i] = a[i - 1];
        }
        a[0] = last;
    }

    public static void main(String[] args) {
        char [] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        rotasjon(a);

        for(char c : a){
            System.out.print(c + " ");
        }
    }

}
