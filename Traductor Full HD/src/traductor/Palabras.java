
package traductor;

public class Palabras {
    private int nivel;
    private String tipo;
    private String sapanish;
    private String english;
    private String ima;
    private String audio;

    public Palabras(int nivel, String tipo, String sapanish, String english, String ima, String audio) {
        this.nivel = nivel;
        this.tipo = tipo;
        this.sapanish = sapanish;
        this.english = english;
        this.ima = ima;
        this.audio = audio;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSapanish() {
        return sapanish;
    }

    public void setSapanish(String sapanish) {
        this.sapanish = sapanish;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Palabras{" + "nivel=" + nivel + ", tipo=" + tipo + ", sapanish=" + sapanish + ", english=" + english + ", ima=" + ima + ", audio=" + audio + '}';
    }

    public String getIma() {
        return ima;
    }

    public void setIma(String ima) {
        this.ima = ima;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
    
    
}
