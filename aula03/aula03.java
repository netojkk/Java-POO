package aula03;

public class aula03 {
    public static void main(String[] args){
        Caneta c1 = new Caneta(); 
        c1.model = "Gigi caneta";
        c1.color = "Pink";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
        c1.status();       
        c1.rabiscar();
    }
}
