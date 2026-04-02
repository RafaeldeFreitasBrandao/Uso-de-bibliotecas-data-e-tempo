import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Soma_DataAtual {
    public void calculo(int segundos) {
        // define a data atual
        LocalDate hoje = LocalDate.now();

        // define o horário atual
        LocalDateTime horario = LocalDateTime.now();

        // soma os segundos ao horário atual
        LocalDateTime resultado = horario.plusSeconds(segundos);

        // exibe o resultado
        System.out.println("Data e hora atual: " + horario.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("Somando " + segundos + " segundos...");
        System.out.println("Nova data e hora: " + resultado.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }
}