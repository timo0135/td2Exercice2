import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormationTest {

    @Test
    public void Formatest(){
        Formation ftest = new Formation(1);
        Matiere m1 = new Matiere("philo");
        Matiere m2 = new Matiere("anglais");
        Matiere m3 = new Matiere("français");
        ftest.ajouter(m1,1);
        ftest.ajouter(m2,3);
        System.out.println(ftest);
        System.out.println(ftest.getCoeff(m3));
    }
}