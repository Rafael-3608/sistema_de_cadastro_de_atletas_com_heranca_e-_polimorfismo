package sistema_atletas;
public class AtletaCorrida extends Atleta{
    private double peso;
    private String genero;

    public AtletaCorrida(String nome, double peso, int idade ,String genero){
        super(nome, idade);
        this.peso = peso;
        this.genero = genero;
    }

    @Override 
    public void identificarAtleta(){
        super.identificarAtleta();
        System.out.println("Modalidade - Corrida dos 100 metros");
        System.out.println("");
        System.out.println("Peso do(a) atleta: " + this.peso);
        if (this.peso <= 70) {
            System.out.println("Sprinter Leve");
        }
        else if(this.peso > 70){
            System.out.println("Sprinter Potência");
        }
        System.out.println("Gênero do(a) atleta: " + this.genero);
        System.out.println("Corredor(a) está correndo!");
    }
}
