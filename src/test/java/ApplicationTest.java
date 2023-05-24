import org.example.Dresseur;
import org.example.Singe;
import org.example.Spectateur;
import org.example.Tour;
import org.example.TourAcrobatie;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {




    @Test
    public void dresserSinge(){
        Spectateur spectateur = new Spectateur();
        List<Tour> tours1 = new ArrayList();
        tours1.add(new TourAcrobatie("Marcher sur les mains"));

        List<Tour> tours2 = null;

        Singe singe1 = new Singe(1,tours1);
        Singe  singe2 = new Singe (2,tours2);

        singe1.addObserver(spectateur);
        singe2.addObserver(spectateur);


      assertEquals("spectateur applaudit pendant le tour d'acrobatie 'Marcher sur les mains' du singe 1",spectateur.update(new TourAcrobatie("Marcher sur les mains"),singe1));
      assertEquals("",spectateur.update(null,singe2));


    }

}
