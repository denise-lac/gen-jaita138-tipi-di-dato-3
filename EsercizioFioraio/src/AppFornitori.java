import java.util.Scanner;
public class AppFornitori {

    public static void main(String[] args) throws Exception {

        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        while (cont) {

            System.out.println("Inserisci i dati del fornitore:");

            System.out.print("Nome:                         ");
            String nome = sc.nextLine();

            System.out.println("Categoria:");
            System.out.println("0. PIANTE");
            System.out.println("1. VASELLAME");
            System.out.println("2. CONCIME");
            System.out.println("3. GIARDINAGGIO");
            byte categoriaNum = sc.nextByte();
            CategoriaFornitore categoria = CategoriaFornitore.values()[categoriaNum];
            sc.nextLine();

            System.out.println("Partita iva:                ");
            String piva= sc.nextLine();
            
            System.out.print("Prezzo:                       ");
            double prezzo = sc.nextDouble();
            sc.nextLine();

            System.out.print("Luogo:                        ");
            String luogo = sc.nextLine();

            System.out.print("Telefono:                     ");
            String telefono = sc.nextLine();

            System.out.print("Email:                        ");
            String email = sc.nextLine();

            System.out.print("Lingua Principale:            ");
            String linguaPrincipale = sc.nextLine();

            System.out.print("IBAN:                         ");
            String iban = sc.nextLine();

            System.out.print("Nome del referente:           ");
            String nomeReferente = sc.nextLine();

            System.out.print("Note:                         ");
            String note = sc.nextLine();

            System.out.println("--------------------------------------");

            System.out.println("Nome: " + nome);
            System.out.println("Categoria: " + categoria);
            System.out.println("Partita iva: " + piva);
            System.out.println("Prezzo: " + prezzo + "€");
            System.out.println("Luogo: " + luogo);
            System.out.println("Telefono: " + telefono);
            System.out.println("Email: " + email);
            System.out.println("Lingua principale: " + linguaPrincipale);
            System.out.println("IBAN: " + iban);
            System.out.println("Nome del referente: " + nomeReferente);
            System.out.println("Note: " + note);

            System.out.println("--------------------------------------");

            System.out.println("Vuoi continuare a inserire altri fornitori? (true/false):");
            cont = sc.nextBoolean();
            sc.nextLine();
        }

        sc.close();
        System.out.println("Hai terminato di inserire i dati!");
    }

}
