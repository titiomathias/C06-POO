// Matheus de Alencar Costa Oliveira - Matrícula: 456 - Curso: Engenharia de Software

import br.com.pcmania.Cliente;
import br.com.pcmania.Computador;
import br.com.pcmania.HardwareBasico;
import br.com.pcmania.MemoriaUSB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opt = -1;
        Scanner sc = new Scanner(System.in);

        // Cliente
        Cliente cliente = new Cliente("Cliente", 12345678901L);

        // Promoção 1
        HardwareBasico[] hardwares1;
        hardwares1 = new HardwareBasico[3];
        hardwares1[0] = new HardwareBasico("Pentium Core i3 (Mhz)", 2200);
        hardwares1[1] = new HardwareBasico("Memória RAM (Gb)", 8);
        hardwares1[2] = new HardwareBasico("HD (Gb)", 500);
        Computador computador1 = new Computador("Apple", 456, "Linux Ubuntu", 32, hardwares1);
        MemoriaUSB usb1 = new MemoriaUSB("Pen-drive (Gb)", 16);
        computador1.addMemoriaUSB(usb1);

        // Promoção 2
        HardwareBasico[] hardwares2;
        hardwares2 = new HardwareBasico[3];
        hardwares2[0] = new HardwareBasico("Pentium Core i5 (Mhz)", 3370);
        hardwares2[1] = new HardwareBasico("Memória RAM (Gb)", 16);
        hardwares2[2] = new HardwareBasico("HD (Gb)", 1000);
        Computador computador2 = new Computador("Samsung", 1690, "Windows 8", 64, hardwares2);
        MemoriaUSB usb2 = new MemoriaUSB("Pen-drive (Gb)", 32);
        computador2.addMemoriaUSB(usb2);

        // Promoção 3
        HardwareBasico[] hardwares3;
        hardwares3 = new HardwareBasico[3];
        hardwares3[0] = new HardwareBasico("Pentium Core i7 (Mhz)", 4500);
        hardwares3[1] = new HardwareBasico("Memória RAM (Gb)", 32);
        hardwares3[2] = new HardwareBasico("HD (Gb)", 2000);
        Computador computador3 = new Computador("Dell", 6134, "Windows 10", 64, hardwares3);
        MemoriaUSB usb3 = new MemoriaUSB("HD Externo (Gb)", 1000);
        computador3.addMemoriaUSB(usb3);

        // Interface para o cliente
        System.out.println(" ███████████    █████████  ██████   ██████                       ███           ");
        System.out.println("░░███░░░░░███  ███░░░░░███░░██████ ██████                       ░░░            ");
        System.out.println(" ░███    ░███ ███     ░░░  ░███░█████░███   ██████   ████████   ████   ██████  ");
        System.out.println(" ░██████████ ░███          ░███░░███ ░███  ░░░░░███ ░░███░░███ ░░███  ░░░░░███ ");
        System.out.println(" ░███░░░░░░  ░███          ░███ ░░░  ░███   ███████  ░███ ░███  ░███   ███████ ");
        System.out.println(" ░███        ░░███     ███ ░███      ░███  ███░░███  ░███ ░███  ░███  ███░░███ ");
        System.out.println(" █████        ░░█████████  █████     █████░░████████ ████ █████ █████░░████████");
        System.out.println("░░░░░          ░░░░░░░░░  ░░░░░     ░░░░░  ░░░░░░░░ ░░░░ ░░░░░ ░░░░░  ░░░░░░░░");
        System.out.println("[+] By: Matheus de Alencar Costa Oliveira (GES: 456 - Turma B) - github.com/titiomathias [+]\n");

        while (opt != 0){
            System.out.println("\n# Promoção 1");
            computador1.mostraPCConfigs();

            System.out.println("\n# Promoção 2");
            computador2.mostraPCConfigs();

            System.out.println("\n# Promoção 3");
            computador3.mostraPCConfigs();

            System.out.print("\nDigite o código da promoção que deseja escolher (0 para sair): ");
            opt = sc.nextInt();

            switch (opt){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    cliente.addComputador(computador1);
                    break;
                case 2:
                    cliente.addComputador(computador2);
                    break;
                case 3:
                    cliente.addComputador(computador3);
                    break;
                default:
                    System.out.println("Opção indisponível. Tente novamente!");
                    break;
            }
        }

        System.out.println("\n" +
        "# Dados para finalização de compra: ");
        // Dados do cliente
        System.out.println("\nDados do cliente:");
        cliente.getInformationClient();
        // Computadores adquiridos
        System.out.println("\nComputadores adquiridos:");
        cliente.getInformationPc();
        // Valor total da compra
        System.out.println("\nValor total da compra: R$" + cliente.calculaTotalCompra());
    }
}