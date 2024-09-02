package aula02;

public class aula02 {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.model = "bic põe no ar";
        c1.color = "Azul";
        c1.ponta = 1.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.model = "Sintur";
        c2.color = "Red";
        c2.ponta = 0.5f;
        c2.tampada();
        c2.status();
        c2.rabiscar();
        
    }
}
