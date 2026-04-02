
class Calcular_Tempo {

    private int dia = 0;
    private int hora = 0;
    private int minuto = 0;
    private int resto_minuto = 0;

    // calcula o tempo em dias, horas, minutos e segundos
    public void calcular_dia(int tempo) {
        // calcula os dias
        int dia = tempo / 86400;
        int resto_dia = tempo % 86400;
        //calcula as horas
        int hora = resto_dia / 3600;
        int resto_hora = resto_dia % 3600;
        // calcula os minutos
        int minuto = resto_hora / 60;
        int resto_minuto = resto_hora % 60;
        // exibe o tempo final
        System.out.println("[dias:" + dia + "|horas:" + hora + "|minutos:" + minuto + "|segundos:" + resto_minuto + "]");
    }


}
