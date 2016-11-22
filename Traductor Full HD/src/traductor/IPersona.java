package traductor;

public interface IPersona {
    
    public String getNombre();
    public void setNombre(String nom);   
    public String getApellido();   
    public void setApellido(String ape);   
    public int getEdad();   
    public void setEdad(int ed);
    public String getFoto();
    public void setFoto(String fo);
    public abstract String getUsuario();
    public abstract void setUsuario(String usu);
    public abstract String getPassword();
    public abstract void setPassword(String pas);
    public abstract String getCorreo();
    public abstract void setCorreo(String cor);
    public abstract int getNivel();
    public abstract void setNivel(int niv);
}
