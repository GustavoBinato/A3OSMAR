package model;
        
import java.util.Date;

public class PrevisaoSurfe {

    private Date data;
    private String local;
    private String ondulacao;
    private String vento;
    private float temperatura;
    private float precipitacao;

    public PrevisaoSurfe(Date data, String local, String ondulacao, String vento, float temperatura, float precipitacao) {
        this.data = data;
        this.local = local;
        this.ondulacao = ondulacao;
        this.vento = vento;
        this.temperatura = temperatura;
        this.precipitacao = precipitacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getOndulacao() {
        return ondulacao;
    }

    public void setOndulacao(String ondulacao) {
        this.ondulacao = ondulacao;
    }

    public String getVento() {
        return vento;
    }

    public void setVento(String vento) {
        this.vento = vento;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getPrecipitacao() {
        return precipitacao;
    }

    public void setPrecipitacao(float precipitacao) {
        this.precipitacao = precipitacao;
    }
}
