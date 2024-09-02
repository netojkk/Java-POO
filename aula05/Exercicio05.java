public class Exercicio05 {
    public static void main(String[] args) {
        ContaBanco netoConta = new ContaBanco();
        netoConta.abrirConta("CP");
        netoConta.setDono("Neto Pressão");
        netoConta.statusConta();


        ContaBanco GigiConta = new ContaBanco();
        GigiConta.abrirConta("CC");
        GigiConta.setDono("Gigi Pressão");
        GigiConta.statusConta();
    
    }
}
