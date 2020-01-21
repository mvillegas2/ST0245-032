package taller1;

public class Fecha {
    int dia, mes, ano;

    public Fecha (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int dia() { return dia; }

    public int mes() {
        return mes;
    }

    public int ano() {
        return ano;
    }

    public String obtenerFecha() {
        return Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(ano);
    }

    public boolean igual(Fecha otra) {
        if ((dia == otra.dia()) && (mes == otra.mes()) && (ano == otra.ano())) {
            return true;
        } else return false;
    }

    public String comparar(Fecha otra) {
        if (ano>otra.ano()){
            return "La fecha " + otra.obtenerFecha() + " está antes.";
        } else if (ano<otra.ano()) {
            return "La fecha " + otra.obtenerFecha() + " está después.";
        } else {
            if (mes>otra.mes()) {
                return "La fecha " + otra.obtenerFecha() + " está antes.";
            } else if (mes<otra.mes()) {
                return "La fecha " + otra.obtenerFecha() + " está después.";
            } else if (dia>otra.dia()) {
                return "La fecha " + otra.obtenerFecha() + " está antes.";
            } else if (dia<otra.dia()) {
                return "La fecha " + otra.obtenerFecha() + " está después.";
            } else return "Las fechas son iguales.";
        }
    }
}
