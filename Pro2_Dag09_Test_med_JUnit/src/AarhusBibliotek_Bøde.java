import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AarhusBibliotek_Bøde {


    public int beregnbøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {
        Long days = ChronoUnit.DAYS.between(beregnetDato, faktiskDato);
        int bøde = 0;

        if (days > 0){
            if (days >= 1 && days <= 7) {
                bøde = 20;
            } else if (days >= 8 && days <= 14){
                bøde = 60;
            } else if (days >= 15){
                bøde = 90;
            }

            if (!voksen){
                bøde = bøde / 2;
            }
        }
        return bøde;
    }


}
