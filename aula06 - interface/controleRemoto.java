public class controleRemoto {
    //Atributos

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Constructor
    public controleRemoto() {
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    //Métodos Especiais 
    public int getVolume() {
        return volume;
    }
    public boolean isLigado() {
        return ligado;
    }
    public boolean isTocando() {
        return tocando;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
}
