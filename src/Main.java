public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro();

        // Definindo valores para os atributos
        meuCarro.setMarca("Toyota");
        meuCarro.setModelo("Corolla");

        // Exibindo as informações do carro
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
    }
}