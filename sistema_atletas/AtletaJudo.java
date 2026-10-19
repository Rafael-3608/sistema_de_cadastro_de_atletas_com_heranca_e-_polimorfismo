package sistema_atletas;
public class AtletaJudo extends Atleta {
    private double peso;
    private String genero;
    public AtletaJudo(String nome, double peso, int idade, String genero){
        super(nome, idade);
        this.peso = peso;
        this.genero = genero;
    }
    @Override 
    public void identificarAtleta(){
        super.identificarAtleta();
        System.out.println("Modalidade - Judô");
        System.out.println("");
        System.out.println("Peso do(a) atleta: " + this.peso);
        if (this.peso <= 66) {
            System.out.println("Categoria peso Ligeiro/ Meio-Leve");
        }
        else if (this.peso <= 81) {
            System.out.println("Categoria peso Médio");
        }
        else if (this.peso > 81) {
            System.out.println("Categoria peso Pesado");
        }
        else{
            System.out.println("Peso inválido");
        }
        System.out.println("Gênero do(a) atleta: " + this.genero);
        System.out.println("Lutador(a) subiu no tatame e está lutando!");
    }
}
