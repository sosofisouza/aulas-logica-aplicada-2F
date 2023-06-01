public class Pessoa extends Animal{
    //Atributos da classe - forma

    String sobrenome;
    //Método da classe - comportamento/funções/ações
    public void falar(){
        System.out.println("falei");
    }
    public String falar (String volume){
        return "falei" + volume;
    }
    //sobrescrita do método

    @Override
    public void comer() {
        System.out.println("pessoa comeu");
    }
}
