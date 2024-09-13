package Oblig;

import java.util.NoSuchElementException;

public class Oppgave_1 {



        public static int max(int[] a) {
            if (a.length < 1) {
                throw new NoSuchElementException("Tabell a er tom!");
            } else {
                int m = 0;

                for(int i = 1; i < a.length; ++i) {
                    if (a[i] > a[m]) {
                        m = i;
                    }
                }

                return a[m];
            }
        }

        public static void main(String[] args) {
            int[] arr = new int[]{1, 3, 2, 7, 5, 4, 2};
            System.out.println(max(arr));
        }
    }
