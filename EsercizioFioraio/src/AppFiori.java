import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppFiori {
    public static void main(String[] args) throws Exception {

        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        while (cont) {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Descrivi il fiore:");

            System.out.print("Nome:                         ");
            String nome = sc.nextLine();

            System.out.println("Tipologia:");
            System.out.println("0. ANNUALE");
            System.out.println("1. PERENNE");
            System.out.println("2. BULBOSO");
            System.out.println("3. ARBUSTIVO");
            System.out.println("4. TREPPIANTE");
            System.out.println("5. ACQUATICO");
            byte tipologiaNum = sc.nextByte();
            TipologiaFiori tipologiaFiore = TipologiaFiori.values()[tipologiaNum];

            System.out.print("Prezzo:                       ");
            double prezzo = sc.nextDouble();

            System.out.print("Quantità:                     ");
            short quantita = sc.nextShort();
            sc.nextLine();

            System.out.print("Colore principale:            ");
            String colorePrincipale = sc.nextLine();

            System.out.print("Inizio disponibilità:         ");
            String inizioDisponibilitaStr = sc.nextLine();
            LocalDate inizioDisponibilita = LocalDate.parse(inizioDisponibilitaStr, formatter);

            System.out.print("Fine disponibilità:           ");
            String fineDisponibilitaStr = sc.nextLine();
            LocalDate fineDisponibilita = LocalDate.parse(fineDisponibilitaStr, formatter);

            System.out.print("Profumo (true/false):         ");
            boolean profumo = sc.nextBoolean();

            System.out.print("Artificiale (true/false):     ");
            boolean artificiale = sc.nextBoolean();


            System.out.println("--------------------------------------");

            System.out.println("Nome: " + nome);
            System.out.println("Tipologia: " + tipologiaFiore);
            System.out.println("Prezzo: " + prezzo + "€");
            System.out.println("Quantità: " + quantita);
            System.out.println("Colore principale: " + colorePrincipale);
            System.out.println("Inizio disponibilità: " + inizioDisponibilita.format(formatter));
            System.out.println("Fine disponibilità: " + fineDisponibilita.format(formatter));
            System.out.println("Profumo: " + profumo);
            System.out.println("Artificiale: " + artificiale);

            System.out.println("--------------------------------------");

            System.out.println("Vuoi continuare a inserire un altro fiore? (true/false):");
            cont = sc.nextBoolean();
            sc.nextLine();
        }

        sc.close();
        System.out.println("Hai terminato di inserire i dati!");
    }
}
