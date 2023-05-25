public class Pessoa {
    //Atributos da classe - forma
    String nome;
    String sobrenome;
    //Método da classe - comportamento/funções/ações
    public void falar(){
        System.out.println("falei");
    }
    public String falar (String volume){
        return "falei" + volume;
    }
}
