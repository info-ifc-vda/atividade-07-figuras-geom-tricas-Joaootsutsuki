public class Main {
    public static void main(String[] args) {

        FiguraGeometrica c = new Circulo(5);
        FiguraGeometrica t = new Triangulo(6, 4, 5, 6, 7);
        FiguraGeometrica q = new Quadrado(4);

        System.out.println("Círculo:");
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
        System.out.println();

        System.out.println("Triângulo:");
        System.out.println("Área: " + t.calcularArea());
        System.out.println("Perímetro: " + t.calcularPerimetro());
        System.out.println();

        System.out.println("Quadrado:");
        System.out.println("Área: " + q.calcularArea());
        System.out.println("Perímetro: " + q.calcularPerimetro());
    }
}
