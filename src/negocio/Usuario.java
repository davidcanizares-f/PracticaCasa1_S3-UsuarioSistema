package negocio;

public class Usuario {
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    public void setUsername(String username){
        if(username !=null && !username.isBlank()){
            this.username = username;
        }
    }
    public void setCorreo(String correo){
        if(correo !=null && !correo.isBlank()){
            this.correo = correo;
        }
    }
    public void setNivel(int nivel){
        if(nivel >= 0){
            this.nivel = nivel;
        }
    }


}
