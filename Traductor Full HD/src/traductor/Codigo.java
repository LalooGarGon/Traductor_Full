package traductor;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Codigo {

    private String cadena;

    public Codigo(String ca) {
        this.cadena = ca;
    }

    public void mandarPdf() {
        Document docu = new Document();
        try {
            PdfWriter.getInstance(docu, new FileOutputStream("Users.pdf"));
            docu.open();
            Paragraph parrafo = new Paragraph("LIST OF USERS");
            parrafo.setAlignment(Element.ALIGN_CENTER);
            docu.add(parrafo);

            Paragraph parrafo2 = new Paragraph("\n");
            parrafo2.setAlignment(Element.ALIGN_CENTER);
            docu.add(parrafo2);
            
            Paragraph parrafo3 = new Paragraph(cadena);
            docu.add(parrafo3);
            
            docu.close();
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(PruebaTraductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
