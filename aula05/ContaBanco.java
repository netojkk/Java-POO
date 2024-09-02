public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Constructor
    public ContaBanco() {
        this.setSaldo(0f);
        this.setStatus(false);
        this.setTipo("indefinido");
        
    }
    public void statusConta(){
        System.out.println("---------------------------");
        System.out.println("Informações da sua Conta! ");
        System.out.println("Número da Conta: " + this.getNumConta());
        System.out.println("Tipo da Conta: " + this.getTipo());
        System.out.println("Dono(a) da Conta: " + this.getDono());
        System.out.println("Saldo da Conta: " + this.getSaldo());
        System.out.println("Conta aberta: " + this.getStatus());
        

    }

    //Sets and Getters
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return saldo;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }

    public void setDono(String dono){
        this.dono = dono;
    }
    public String getDono(){
        return dono;
    }

    
    //Metodos Especiais
    public void abrirConta(String tipoConta){
        this.setTipo(tipoConta);
        this.setStatus(true);
        if (tipoConta == "CC") {
            this.setSaldo(50f);
        } else if (tipoConta == "CP") {
            this.setSaldo(150f); 
        }
    }
    public void fecharConta(){
        if (getSaldo() > 0 || getSaldo() < 0){
            System.out.println(" ERRO!! Retire seu dinheiro ou pague suas dívidas para fechar a conta!!");
        } else {
            this.setStatus(false);
            System.out.println("Sua conta foi fechada com sucesso!");
        }
    }
    public void depositar(float quantiaDep){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + quantiaDep);;
        }
    }
    public void sacar(float quantiaSaque){
        if (getStatus()) {
            if (this.getSaldo()>= quantiaSaque) {
                this.setSaldo(getSaldo() - quantiaSaque);
                System.out.println("Saque realizado com sucesso!");
            }else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("ERRO! Abra uma conta para concluir operações");
        }


        //Da minha forma
        /*  if (getSaldo() > 0 && quantiaSaque <= getSaldo() && getStatus() == true){
             saldo -= quantiaSaque;
        } else {
             System.out.println("Você não conseguiu sacar "+ quantiaSaque + " Saldo insuficiente!");
         }
        */
    }
    public void pagarMensal(){

        int mensalidade = 0;
        if (this.getTipo() == "CC") {
            mensalidade = 12;
        } else if (this.getTipo() == "CP") {
            mensalidade = 20;
        }{
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - mensalidade);
            System.out.println("Mensalidade paga com sucesso por " + getDono());
        } else{
            System.out.println("ERRO! Abra uma conta para concluir operações");
        }
        }
        


        //MEU JEITO
        /*if (this.tipo == "CP"){
            float saldoRetirar = 20f;
            saldo -= saldoRetirar;
            System.out.println("O pagamento mensal foi efetuado. " + saldoRetirar +" foram debitados");
        } else if (this.tipo == "CC") {
            float saldoRetirar = 12f;
            saldo -= saldoRetirar;
            System.out.println("O pagamento mensal foi efetuado. " + saldoRetirar +" foram debitados");
        } 
        */
    }

    
}
