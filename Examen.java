import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("ingrese el valor total de la compra ");
        double  valor =scanner.nextDouble();
        

        double descuento =0;

        if (valor >= 200000) {
            descuento=valor*0.15;

        }else if (valor >=50000) {
            descuento=valor*0.02;

        }else if (valor >= 20000){
            descuento=valor*0.015;
        }

        double valorTotal = valor - descuento;
        System.out.println("Factura\n" +
        "Nombre del cliente: " + nombre + "\n" +
        "Valor total de la compra: $" + valor + "\n" +
        "Descuento: $" + descuento + "\n" +
        "Total a pagar: $" + valorTotal + "\n" +
        "¡Gracias por su compra!");


    }
}