package Controller;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import model.Cliente;

public class CustomerManager {
    private Map<Long, Cliente> clients;

    public CustomerManager(){
        clients = new HashMap<>();
    }

    public void addClient(Cliente client){
        clients.put(client.getId(), client);
    }

    public Optional<Cliente> searchCustomerID(Long id){
        return Optional.ofNullable(clients.get(id));
    }

    public Boolean removeClientId(Long id){
        return clients.remove(id) != null;
    }

    public void showClient(){
        if (clients.isEmpty()){
            System.out.println("No hay na");
        }

        var listado = clients.values().stream()
                .map(Cliente::toString)
                .collect(Collectors.joining("\n"));

        System.out.println(listado);
    }

}
