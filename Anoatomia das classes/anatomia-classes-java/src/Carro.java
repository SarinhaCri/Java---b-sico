public class Carro {
    //  Atributos (Características do carro)
    String cor;
    String marca;
    String modelo;
    int velocidadeAtual;
    
    //  Construtor (Cria o carro com características iniciais)
    public Carro(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0; // O carro começa parado
    }

    // Método para acelerar o carro
    public void acelerar(int aumento) {
        velocidadeAtual += aumento;
        System.out.println("O carro acelerou para " + velocidadeAtual + " km/h.");
    }

    //  Método para frear o carro
    public void frear(int reducao) {
        velocidadeAtual -= reducao;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0; // Garante que a velocidade não fique negativa
        }
        System.out.println("O carro reduziu para " + velocidadeAtual + " km/h.");
    }

    // Método para mostrar as informações do carro
    public void mostrarInformacoes() {
        System.out.println("Carro: " + marca + " " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }

    // Método principal (main) para testar a classe
    public static void main(String[] args) {
        // Criando um carro
        Carro meuCarro = new Carro("Vermelho", "Ferrari", "F8 Tributo");

        // Exibindo as informações iniciais
        meuCarro.mostrarInformacoes();

        // Acelerando o carro
        meuCarro.acelerar(50);
        meuCarro.acelerar(30);

        // Freando o carro
        meuCarro.frear(40);

        // Mostrando as informações finais
        meuCarro.mostrarInformacoes();
    }
}