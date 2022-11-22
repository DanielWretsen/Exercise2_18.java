
import java.util.Scanner;

        public class Ovning2_18 {

            public static void main(String[] args) {
                // Skapa inläsningsmöjlighet från datorns tangentbord
                Scanner input = new Scanner( System.in );

                System.out.println("Ange priset exklusive moms: ");
                int priceWithoutTax = input.nextInt();

                System.out.println("Ange aktuell momssats som procent (0, 6, 12, 25): ");
                int taxRateInPercentage = input.nextInt();

                int tax = priceWithoutTax * taxRateInPercentage / 100;

                System.out.println( "Vid priset " + priceWithoutTax + " SEK och momssatsen " + taxRateInPercentage + "%");
                System.out.println( "blir mervärdesskatten: " + tax + " SEK");

                // Stäng resursen som läser in data från tangentbordet
                input.close();

            }
        }

    }
}