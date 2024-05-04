import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

 class Main {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(1997, 9, 10);
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);

        long totalDias = ChronoUnit.DAYS.between(fechaNacimiento, fechaActual);
        long totalHoras = totalDias * 24;
        long totalSegundos = totalHoras * 3600;

        System.out.println("Tienes " + periodo.getYears() + " años, " + periodo.getMonths() + " meses, " + totalHoras + " horas y " + totalSegundos + " segundos.");
    }
}
