package aula03;

public class Caneta{
    public String model;
    public String color;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println(" Modelo: "+ this.model);
        System.out.println(" Uma caneta " + this.color);
        System.out.println(" Ponta: " + this.ponta);
        System.out.println(" Carga: " + this.carga);
        System.out.println(" está tampada? " + this.tampada);
     
    }

    public void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO! sua caneta está tampada");
        } else {
            System.out.println("Rabiscado papai");
        }
    }

    protected void tampada(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}