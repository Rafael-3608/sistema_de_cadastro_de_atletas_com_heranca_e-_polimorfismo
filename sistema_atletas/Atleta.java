package sistema_atletas;
public class Atleta{
        String nome;
        int idade;
       

        public Atleta (String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }
        public void identificarAtleta(){
            System.out.println("Nome do atleta é: "+ nome);
            System.out.println("Idade do atleta é: "+ idade);
        }

    }