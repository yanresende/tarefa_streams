import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Pessoa {
    private String nome;
    private String genero;

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}

public class FiltrarMulheres {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("Carlos", "Masculino"));
        pessoas.add(new Pessoa("Juliana", "Feminino"));

        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> "Feminino".equalsIgnoreCase(pessoa.getGenero()))
                .collect(Collectors.toList());

        System.out.println("Lista de mulheres:");
        mulheres.forEach(System.out::println);
    }
}
