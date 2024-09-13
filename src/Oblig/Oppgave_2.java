package Oblig;

public class Oppgave_2 {

    public static void main(String[] args) {
        int[] a = {3, 3, 4, 5, 5, 6, 7, 7, 8};

        try {
            int antallUlike = antallUlikeSortert(a);
            System.out.println("Antall ulike verdier " + antallUlike);
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }

    public static int antallUlikeSortert(int[] a){
        if(a.length == 0){
            return 0;
        }
        for(int i = 1; i < a.length; i++){
            if(a[i] < a[i - 1]){
                throw new IllegalStateException("The array is not sorted ascending.");
            }
        }
        int antallUlike = 1;

        for(int i = 1; i < a.length; i++){
            if(a[i] != a[i - 1]){
                antallUlike++;
            }
        }
        return antallUlike;
    }
}
