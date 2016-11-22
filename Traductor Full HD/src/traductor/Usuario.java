package traductor;

public class Usuario extends Persona{
    
    private String usuario;
    private String password;
    private String correo;
    private int nivel;
    
    public Usuario(String nom, String ape, int eda, String usu, 
            String pas, String cor, int niv, String fo){
        super(nom, ape, eda, fo);
        this.usuario = usu;
        this.password = pas;
        this.correo = cor;
        this.nivel = niv;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String us){
        this.usuario = us;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String pa){
        this.password = pa;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setCorreo(String co){
        this.correo = co;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    public void setNivel(int ni){
        this.nivel = ni;
    }
}
