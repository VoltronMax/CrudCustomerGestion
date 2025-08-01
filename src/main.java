import Controller.CustomerManager;
import model.Cliente;

import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        CustomerManager manager = new CustomerManager();
        var sc = new Scanner(System.in);

        int option;

        do {
            System.out.println("""
                    1. Agregar nuevo cliente
                    2. Buscar cliente por ID
                    3. Eliminar cliente por ID
                    4. Mostrar clientes
                    5. Salir

                    """);
            System.out.println("Ingresa una opcion ");

            while (!sc.hasNextLine()) {
                System.out.println("Ingrese una opcion valida");
                sc.nextLine();
            }

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("ID");
                    Long id = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Nombre");
                    var name = sc.nextLine();
                    System.out.println("Correo");
                    var email = sc.nextLine();
                    System.out.println("Telefono");
                    var phone =sc.nextLine();

                    var newClient = new Cliente(id, name, email, phone);
                    manager.addClient(newClient);
                    System.out.println("Cliente agregado");
                }

                case 2 -> {
                    System.out.println("Ingrese el id a buscar");
                    var idSearch = sc.nextLong();
                    sc.nextLine();
                    manager.searchCustomerID(idSearch).ifPresentOrElse(System.out::println, () -> System.out.println("Cliente no encontrado"));
                    System.out.println ();
                }

                case 3 -> {
                    System.out.println("Ingrese el id del cliente a eliminar");
                    long idDelete = sc.nextLong();
                    manager.removeClientId(idDelete);
                    var remove = manager.removeClientId(idDelete);
                    System.out.println(remove ? "Usuario eliminado" : "Usuario no encontrado");
                }

                case 4 -> manager.showClient();


            }
        } while (!sc.hasNextLine());
    }
}



