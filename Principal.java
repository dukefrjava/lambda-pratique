package lambda;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList(
            "Ana",
            "Bruno",
            "Carlos",
            "Amanda",
            "Beatriz",
            "Arthur"
        );

        // IMPLEMENTANDO A INTERFACE
        FiltroNome filtro = nome -> nome.startsWith("A");

        // APLICANDO NA STREAM API
        nomes.stream().filter(filtro::testar).forEach(System.out::println);
    }
}
