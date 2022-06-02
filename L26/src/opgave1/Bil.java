package opgave1;

import java.util.Objects;

public class Bil {

    private String registreringsNummer;
    private String maerke;
    private String model;
    private String farve;

    public Bil(String registreringsNummer, String maerke, String model, String farve) {
        this.registreringsNummer = registreringsNummer;
        this.maerke = maerke;
        this.model = model;
        this.farve = farve;
    }

    public String getRegistreringsNummer() {
        return registreringsNummer;
    }

    public void setRegistreringsNummer(String registreringsNummer) {
        this.registreringsNummer = registreringsNummer;
    }

    public String getMaerke() {
        return maerke;
    }

    public void setMaerke(String maerke) {
        this.maerke = maerke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    @Override
    public String toString() {
        return "Bil: " + "" +
                "Registreringsnummer: '" + registreringsNummer + '\'' +
                ", Mærke: '" + maerke + '\'' +
                ", Model: '" + model + '\'' +
                ", Fave: '" + farve + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bil bil = (Bil) o;
        return registreringsNummer.equals(bil.registreringsNummer) && maerke.equals(bil.maerke);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registreringsNummer, maerke);
    }
}
