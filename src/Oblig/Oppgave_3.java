package Oblig;

public class Oppgave_3 {

    public static int antallVerdier(int[] a) {

        int antallVerdier = 0;

        for (int i = 0; i < a.length; i++) {
            boolean funnet = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    funnet = true;
                    break;
                }
            }
            if (!funnet) {
                antallVerdier++;
            }
        }
        return antallVerdier;
    }

    public static void main(String[] args) {

        int[] liste = {2, 5, 1, 6, 7, 3, 4, 9, 8, 2, 5, 1, 6};
        System.out.println(antallVerdier(liste));
        System.out.println("Is the numbers of the numbers sorted in list");
    }
}

// Besvart i sin helhet med hjelp hjelp av chatGPT.