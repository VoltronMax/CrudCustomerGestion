package model;

public class Cliente {

    private Long id;
    private String name;
    private String email;
    private String phone;

    public Cliente (Long id, String name, String email, String phone){
        this.id = id;
        this.name =name;
        this.email = email;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("""
                .:Cliente:.
                \nNombre: %s
                \nCorreo: %s
                \nTelefono: %s
                \nId: %d
                """, name, email, phone, id);
    }
}
