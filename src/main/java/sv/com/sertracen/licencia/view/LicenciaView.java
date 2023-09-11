package sv.com.sertracen.licencia.view;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author msanchez
 */
@Named
@SessionScoped
public class LicenciaView implements Serializable {

    private int numPaso;
    private int porcentajeAvance;
    private Boolean aceptarTerminos;
    private Boolean declaracion;
    private Boolean continuar;
    private String numLic;
    private String numCtrl;
    private String descripcionPaso;
    private String correo;
    private String numCelular;

    {
        numPaso = 0;
        porcentajeAvance = 0;
        aceptarTerminos = false;
        continuar = false;
        declaracion = false;
    }

    public int getNumPaso() {
        return numPaso;
    }

    public Boolean getAceptarTerminos() {
        return aceptarTerminos;
    }

    public void setAceptarTerminos(Boolean aceptarTerminos) {
        this.aceptarTerminos = aceptarTerminos;
    }

    public int getPorcentajeAvance() {
        return porcentajeAvance;
    }

    public String getNumLic() {
        return numLic;
    }

    public void setNumLic(String numLic) {
        this.numLic = numLic;
    }

    public String getNumCtrl() {
        return numCtrl;
    }

    public void setNumCtrl(String numCtrl) {
        this.numCtrl = numCtrl;
    }

    public Boolean getContinuar() {
        return continuar;
    }

    public Boolean getDeclaracion() {
        return declaracion;
    }

    public void setDeclaracion(Boolean declaracion) {
        this.declaracion = declaracion;
    }

    public String getDescripcionPaso() {
        return descripcionPaso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    //=====================================================
    public void iniciarRefrenda() {
        numPaso = 1;
    }

    public void siguientePaso() {
        numPaso += 1;
        System.out.println("Paso numero " + numPaso);
    }

    public void siguientePaso(int porcentaje) {
        siguientePaso();
        porcentajeAvance = porcentaje;
        switch (porcentaje) {
            case 4:
                descripcionPaso = "Número de verificación";
                break;
        }

    }

    public void cancelarRefrenda() {
        numPaso = 0;
        porcentajeAvance = 0;
        aceptarTerminos = false;
    }

    public void enviarToken() {

    }
}
