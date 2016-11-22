package traductor;

public abstract class Persona implements IPersona{
    
    private String nombre;
    private String apellido;
    private int edad;
    private String foto;
    
    public Persona(String no, String ap, int ed, String fot){
        this.nombre = no;
        this.apellido = ap;
        this.edad = ed;
        this.foto = fot;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String ape){
        this.apellido = ape;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int ed){
        this.edad = ed;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public abstract String getUsuario();
    public abstract void setUsuario(String usu);
    public abstract String getPassword();
    public abstract void setPassword(String pas);
    public abstract String getCorreo();
    public abstract void setCorreo(String cor);
    public abstract int getNivel();
    public abstract void setNivel(int niv);
}
