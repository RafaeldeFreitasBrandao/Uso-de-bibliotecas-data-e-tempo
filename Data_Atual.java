// imports para a variável "hoje"
import java.time.LocalDate; // classe para representar uma data
import java.time.Month;
import java.time.format.DateTimeFormatter;
// imports para a variável "mês"
import java.time.format.TextStyle;
import java.util.Locale;

//imports para a variável "horário"
import java.time.LocalDateTime;


class Data_Atual {

    public void mostrar()

    {
        //define a data atual
        LocalDate hoje = LocalDate.now();

        // define o mês atual escrito em portugês
        Month mes = LocalDate.now().getMonth();
        Locale brasil = new Locale("pt", "BR");

        // define o horário atual
        LocalDateTime horario = LocalDateTime.now();

        //formata a variável "hoje" em formato brasileiro
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        String atual = hoje.format(formatoBR);

        //exibe a data atual (hoje)
        System.out.println("data de hoje: " + atual);
        //exibe o dia atual (hoje)
        System.out.println("dia: " + hoje.getDayOfMonth());
        //exibe o mês atual em portugês (mes)
        System.out.println("Mês: " + mes.getDisplayName(TextStyle.FULL, brasil));
        //exibe o ano atual (hoje)
        System.out.println("ano: " + hoje.getYear());
        //exibe o horario atual (hoje)
        System.out.println("horário (hora;minuto;segundo): " + horario.format(DateTimeFormatter.ofPattern("H:m:s"))+ "\n");

    }
}