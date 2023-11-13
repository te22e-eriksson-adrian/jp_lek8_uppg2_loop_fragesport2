import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        int poäng = 0;

        /* System.out.println("Detta är en frågesport!");
        System.out.println("     ");
        System.out.println("Använd tangentbordet för att mata in svaren 'ja' eller 'nej' på frågorna.");
        
        //Frågor (5 stycken)
        System.out.println("     ");
        System.out.println("Fråga 1: Är det jämnt datum idag?");
        System.out.print("Ditt svar: ");
        String svar1 = tangentbord.nextLine();
        if (svar1.equalsIgnoreCase("ja"))
        {
            poäng++;
        }
        System.out.println("     ");
        System.out.println("Fråga 2: Är det nuvarande året jämnt?");
        System.out.print("Ditt svar: ");
        String svar2 = tangentbord.nextLine();
        if (svar2.equalsIgnoreCase("nej"))
        {
            poäng++;
        }
        System.out.println("     ");
        System.out.println("Fråga 3: Var det förra året jämnt?");
        System.out.print("Ditt svar: ");
        String svar3 = tangentbord.nextLine();
        if (svar3.equalsIgnoreCase("ja"))
        {
            poäng++;
        }
        System.out.println("     ");
        System.out.println("Fråga 4: Kommer nästa år att vara udda?");
        System.out.print("Ditt svar: ");
        String svar4 = tangentbord.nextLine();
        if (svar4.equalsIgnoreCase("nej"))
        {
            poäng++;
        }
        System.out.println("     ");
        System.out.println("Fråga 5: Var det senaste presidentvalet i USA år 2020?");
        System.out.print("Ditt svar: ");
        String svar5 = tangentbord.nextLine();
        if (svar5.equalsIgnoreCase("ja"))
        {
            poäng++;
        } */
        
        System.out.println("     ");
        System.out.println("Fortsättning: Nu kommer flersvarsfrågor där man svarar med siffrorna 1, 2 eller 3.");
        System.out.println("     ");
        System.out.println("Fråga 6: Vilken av dessa städer är den största räknat i befolkning?");
        System.out.println("Svarsaltrnativ: /n 1. Chongqing (Kina) /n 2. Rio de Janeiro (Brazilien) /n 3. Tokyo (Japan)");
        System.out.print("Ditt svar: ");
        int svar6 = tangentbord.nextInt();
        tangentbord.nextLine();
        switch (svar6){
            case 1:
            System.out.println("Du svarade fel, rätt svar är Tokyo. Du får noll poäng.");
            break;
            case 2:
            System.out.println("Du svarade fel, rätt svar är Tokyo. Du får 0 poäng.");
            break;
            case 3:
            System.out.println("Du svarade rätt och får 1 poäng.");
            poäng++;
            break;
            default:
            System.out.println("Du gjorde en inkorrekt inmatning, var så snäll och starta om programmet och läsa instruktionerna på nytt för att kunna besvara frågan på ett korrekt stätt.");
        }

        System.out.println("     ");
        System.out.println("Fråga 7: Vilken av dessa städer är den mest folktäta?");
        System.out.println("Svarsaltrnativ: /n 1. Hanoi (Vietnam) /n 2. Mumbai (Indien) /n 3. Carson City (Nevada, U.S.A.)");
        System.out.print("Ditt svar: ");
        int svar7 = tangentbord.nextInt();
        tangentbord.nextLine();
        switch (svar7){
            case 1:
            System.out.println("Du svarade fel, rätt svar är Mumbai. Du får noll poäng.");
            break;
            case 2:
            System.out.println("Du svarade rätt och får 1 poäng.");
            poäng++;
            break;
            case 3:
            System.out.println("Du svarade fel, rätt svar är Mumbai. Du får noll poäng.");
            break;
            default:
            System.out.println("Du gjorde en inkorrekt inmatning, var så snäll och starta om programmet och läsa instruktionerna på nytt för att kunna besvara frågan på ett korrekt stätt.");
        }

        //Resultat
        System.out.println("     ");
        System.out.println("Din slutpoäng är: "+poäng+"/7");
        tangentbord.close();
    }
}
