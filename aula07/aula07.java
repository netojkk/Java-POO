package aula07;

public class aula07 {
    public static void main(String[] args) {
        Lutador lut[] = new Lutador[6];
        lut[0] =  new Lutador("neto pressao", "Brasil", 18, 1.85f, 74, 10, 0, 1);
        lut[1] = new Lutador("Gigi princesa", "Colombiana", 19, 1.60f, 53, 8, 2, 0);
        lut[2] = new Lutador("PutsScript", "França", 29, 1.68f, 57.8f, 14, 2, 3);
        lut[3] = new Lutador("Dead Code", "Austrália",  28, 1.93f, 101.5f, 13, 0, 2);
        lut[4] = new Lutador("Cobol", "EUA",  28, 1.73f, 81.5f, 8, 3, 5);
        lut[5] = new Lutador("Dead Code", "Austrália",  28, 1.76f, 65.5f, 9, 2, 2);

        
        
        Luta ufc = new Luta();
        ufc.marcarLuta(lut[0], lut[4]);
        ufc.lutar();
        
        
        // lut[0].status();
        // lut[4].status();
    }

}
