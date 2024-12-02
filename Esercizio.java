import java.util.Scanner;

class Esercizio {
    public static void main(String args[])
    {
        int n;
        float somma;
        float media;
        float limiteCrediti = 6;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Inserire il numero di studenti: ");
            n = Integer.parseInt(scanner.nextLine());
        } while ( n <= 0 );
        
        String[] studenti = new String[n];
        float[] voti = new float[n];
        float[] crediti = new float[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nome " + (i + 1) + "° studente: ");
            studenti[i] = scanner.nextLine();
            
            System.out.println("Voto " + (i + 1) + "° studente: ");
            voti[i] = Float.parseFloat(scanner.nextLine());
            
            System.out.println("Crediti " + (i + 1) + "° studente: ");
            crediti[i] = Float.parseFloat(scanner.nextLine());
        }
        
        somma = 0;
        for (int i = 0; i < n; i++) {
            somma = somma + voti[i];
        }
        media = somma / n;
        
        System.out.println("Lista di studenti con votazione superiore alla media " + 
                          media + " e con almeno " + limiteCrediti + " crediti.");
        
        for (int i = 0; i < n; i++) {
            if (voti[i] > media && crediti[i] >= limiteCrediti) {
                System.out.println("Lo studente " + studenti[i] + " ha voto " + voti[i] +
                                    " e " +crediti[i] + " crediti");
            }
        }
    }
}
