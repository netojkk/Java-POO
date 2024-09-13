package aula07;

public class Lutador {
    // Atributos

    private String name;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // construtor
    
    public Lutador(String nome, String nacional, int id, float alt, float pe, int vit, int der, int emp) {
        setName(nome); 
        nacionalidade = nacional;
        idade = id;
        altura = alt;
        setPeso(pe);
        vitorias = vit;
        derrotas = der;
        empates = emp;

    }

    // Metodos Publicos
    public void apresentar() {
        System.out.println("Aprensentando o....");
        System.out.println("Lutador: " + this.getName());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void status() {
        System.out.println("====================================");
        System.out.println(this.getName() + " de peso " + this.getCategoria());
        System.out.println("====================================");
        System.out.println("Que ganhou " + this.getVitorias() + " vezes,");
        System.out.println("que perdeu " + this.getDerrotas() + " vezes");
        System.out.println("e empatou " + this.getEmpates() + " vezes");
        
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Metodos Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String peso) {
        if (this.getPeso() < 52.2f) {
            categoria = "inválido";

        } else if (this.getPeso() <= 70.3f) {
            this.categoria = "leve";
        } else if (this.getPeso() <= 83.9f) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2f) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "inválido";
        }
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
