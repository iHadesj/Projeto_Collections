public class Pessoas implements Comparable<Pessoas>{
    public String nome;
    public String genero;
    public Pessoas(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }
    @Override
    public int compareTo(Pessoas pessoas) {
        return this.nome.compareTo(pessoas.getNome());
    }
    public String getNome() {
        return nome;
    }
    public String getGenero(){
        return genero;
    }
}