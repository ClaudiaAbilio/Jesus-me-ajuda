/*
 Atividade 3 - UC9 - Claudia Abilio - V1
 */

public class Medicao {

    private String data;
    private String hora;
    private int sistolica;
    private int diastolica;
    private boolean stress;

    public Medicao(String data, String hora, int sistolica, int diastolica, boolean stress) {
        this.data = data;
        this.hora = hora;
        this.sistolica = sistolica;
        this.diastolica = diastolica;
        this.stress = stress;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getSistolica() {
        return sistolica;
    }

    public void setSistolica(int sistolica) {
        this.sistolica = sistolica;
    }

    public int getDiastolica() {
        return diastolica;
    }

    public void setDiastolica(int diastolica) {
        this.diastolica = diastolica;
    }

    public boolean isStress() {
        return stress;
    }

    public void setStress(boolean stress) {
        this.stress = stress;
    }

    @Override
    public String toString() {
        return data + "," + hora + "," + sistolica + "," + diastolica + "," + (stress ? "Sim" : "Nao");
    }
}
