package aula02;

public class Caneta{
    String model;
    String color;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println(" Modelo: "+ this.model);
        System.out.println(" Uma caneta " + this.color);
        System.out.println(" Ponta: " + this.ponta);
        System.out.println(" Carga: " + this.carga);
        System.out.println(" está tampada? " + this.tampada);
     
    }

    void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO! sua caneta está tampada");
        } else {
            System.out.println("Rabiscado papai");
        }
    }

    void tampada(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}