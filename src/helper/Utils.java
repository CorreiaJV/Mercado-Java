package helper;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Utils {
	// Formatando data e Números
	// Criando o modelo a ser seguido:
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	static NumberFormat nf = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

	// Criando as funções para a formatar os dados de acordo com o modelo:
	public static String dateParaString(Date data) {
		return Utils.sdf.format(data);
	}
	public static Date stringParaData(String data) {
		try {
			return Utils.sdf.parse(data);
		} catch (ParseException e) {
			return null;
		}
	}

	public static String doubleParaString(Double valor) {
		return Utils.nf.format(valor);
	}

	public static Double stringParaDouble(String valor) {
		try {
			return (Double) Utils.nf.parse(valor);
		} catch (ParseException e) {
			return null;
		}
	}
	public static void pausar(int segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
		} catch (InterruptedException e) {
			System.out.println("Erro ao pausar por " +segundos + "segundos");
		}
	}
}
