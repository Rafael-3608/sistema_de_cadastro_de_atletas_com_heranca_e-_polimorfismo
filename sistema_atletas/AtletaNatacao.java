package sistema_atletas;
public class AtletaNatacao extends Atleta{
    private double peso;
    private String genero;
    public AtletaNatacao(String nome, double peso, int idade, String genero){
        super(nome, idade);
        this.peso = peso;
        this.genero = genero;
    }
    @Override 
    public void identificarAtleta(){
        super.identificarAtleta();
        System.out.println("Modalidade - Natação");
        System.out.println("");
        System.out.println("Peso do(a) Atleta: " + this.peso);
        if (this.idade <= 19) {
            System.out.println("Nadador(a) Junior");
        }
        else if (this.idade <= 29) {
            System.out.println("Nadador(a) Sênior");
        }
        else if (this.idade >= 30) {
            System.out.println("Nadador(a) Master");
        }
        else{
            System.out.println("Erro: peso inválido");
        }
        System.out.println("Gênero do(a) atleta: " + this.genero);
        System.out.println("nadador(a) está nadando na piscina dos 100 metro rasos!");
    }
}
