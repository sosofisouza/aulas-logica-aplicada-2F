public class Solo {
    //Atributos
    String tipo;
    String cor;
    String susbtancia;
    boolean fertil;

    //Métodos
    public Planta gerarPlanta(Semente s1){
        Planta p1 = new Planta(s1); //construtor - método com o mesmo nome da classe
        return p1;
    }
}
