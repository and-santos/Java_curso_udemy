package application;

public class ProgramForEach {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};


        for (int i=0; i< vect.length; i++) {
            System.out.println(vect[i]);
        }

        // for each
        // Para cada objeto obj contido no vetor vect, faça:
        // Equivalente ao for anterior.
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
