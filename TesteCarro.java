import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Carro monza = new Carro();

        System.out.println("Digite a placa:");
        String placa = sc.next();
        // monza.setPlaca(placa);

        System.out.println("Digite o ano:");
        int ano = sc.nextInt();
        // monza.setAno(ano);

        System.out.println("Digite o modelo:");
        String modelo = sc.next();
        // monza.setModelo(modelo);

        Carro monza = new Carro(placa, modelo, ano);

        monza.buzinar();
        monza.acelerar();

        System.out.println(
                "Monza, ano: " + monza.getAno() + ", modelo: " + monza.getModelo() + ", placa: " + monza.getPlaca());

        // Carro palio = new Carro();
        // ... o mesmo para o palio

        sc.close();
    }
}
