package Amir.gl41;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Personnel marc = new Personnel.Builder("Ilya", "Arshavinn", "batal", LocalDate.of(1991, 9, 12)).Add_num("06 666").build();
    	Personnel doe = new Personnel.Builder("john", "doe", "batal", LocalDate.of(1991, 9, 12)).build();
    	Personnel hoover = new Personnel.Builder("edgar", "hoover", "batal", LocalDate.of(1991, 9, 12)).build();
    	Personnel angleton = new Personnel.Builder("james", "angleton", "batal", LocalDate.of(1991, 9, 12)).Add_num("07 67 54").build();
    	CompositePersonnel equipe = new CompositePersonnel();
    	equipe.Add(marc);
    	equipe.Add(doe);
    	equipe.Add(hoover);
    	equipe.Add(angleton);
    	equipe.print();
    	equipe.Add(angleton);
    	Affichage a = new Affichage(equipe);

    }
}
