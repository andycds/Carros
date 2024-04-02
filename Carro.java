public class Carro {
    private String placa;
    private String modelo;
    private int ano;

    public Carro(String placa, String modelo, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void buzinar() {
        System.out.println("Fom fom");
    }

    public void acelerar() {
        System.out.println("Vrum, vrum...");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}