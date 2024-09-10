public class ControleRemoto implements Controlador {
    //Atributos

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Constructor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //Métodos Especiais 
    private int getVolume() {
        return volume;
    }
    private boolean isLigado() {
        return ligado;
    }
    private boolean isTocando() {
        return tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- Menu -----");
       System.out.println("Está ligado? " + this.isLigado());
       System.out.println("Está tocando? " + this.isTocando());
       System.out.print("Volume: " + this.getVolume() + " ");
       for (int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
       }
       System.out.println("");
    }

    @Override
    public void fecharMenu() {
       System.out.println("Fechando Menu");
    }

    @Override
    public void aumentarVolume() {
       if (ligado) {
            this.setVolume(this.getVolume() + 5);
       }
    }

    @Override
    public void abaixarVolume() {
        if (this.isLigado() && getVolume() > 0) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && getVolume() > 0) {
            this.setVolume(0);
        } 
    }

    @Override
    public void desligarMudo() {
      if (this.isLigado() && this.getVolume() == 0){
        this.setVolume(20);
      }
    }

    @Override
    public void play() {
      if (this.isLigado() && !(this.isTocando())){
        this.setTocando(true);
      }
    }

    @Override
    public void pause() {
        if(this.ligado && this.isTocando()){
            this.setTocando(false);
        }
    }
    
    
}
