package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramLists {
    public static void main(String[] args) {

        // Criando uma lista de inteiros
        // è obrigatório o uso da Wrapper class Integer
        List<String> list = new ArrayList<>(); // instanciamento de Classe

        list.add("Maria"); // posição 0
        list.add("Alex"); // 1
        list.add("Bob"); // 2
        list.add("Anna"); // 3
        list.add(2, "Marco");

        System.out.println(list.size()); // Tamanho da lista
        // list.remove("Anna"); // Remove um dado a partira da comparação deste com outro.


        for (String x: list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        // list.remove(1); // Remove um elemento nesta posição
        list.removeIf( x -> x.charAt(0) == 'M');
        for (String x: list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        // retorna -1 se não foi encontrado
        System.out.println("---------------------");
        // Filtra a lista para exibir apenas nomes que começam com a letra A
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
