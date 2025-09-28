
package TP5Ejercicio13;

public class Usuario {
    private String nombre;
    private String mail;
    
    public Usuario(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }else {
            System.out.println("Nombre inválido.");
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if(mail != null && !mail.trim().isEmpty()) {
            this.mail = mail;
        } else {
            System.out.println("Mail inválido.");
        }
    }
    @Override
    public String toString() {
        return "Nombre Usuario: " + nombre + "  Mail: " + mail;
    }
}
