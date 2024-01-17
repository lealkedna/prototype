// Classe Laptop como protótipo
class Laptop implements Cloneable {
    private String marca;
    private String processador;
    private int memoriaRAM;
    private int armazenamento;

    // Construtor
    public Laptop(String marca, String processador, int memoriaRAM, int armazenamento) {
        this.marca = marca;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }


    public void exibirConfiguracao() {
        System.out.println("Marca: " + marca +
                ", Processador: " + processador +
                ", Memória RAM: " + memoriaRAM + " GB" +
                ", Armazenamento: " + armazenamento + " GB");
    }

    @Override
    public Laptop clone() throws CloneNotSupportedException {
        return (Laptop) super.clone();
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
}
