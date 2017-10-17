import java.util.Arrays;

import static org.junit.Assert.fail;

/**
 * Created by Bouguedra Adem on 17/10/2017.
 */
public class VecteurTest {
    @org.junit.Test
    /**
     * @param
     */
    public void trier() throws Exception {
        Vecteur vec=new Vecteur();
        int vect[]={1,4,3,5};
        int res []={1,3,4,5};
        vec.trier(vect);
        if (!Arrays.equals(vect,res)) {
            fail("faux");
        }

    }

    @org.junit.Test
    public void min_max() throws Exception {
        Vecteur vec=new Vecteur();
        int max=9;
        int min=1;
        int vect[]={4,8,3,9,1};
        int min_max[]={0,0,0};
        vec.min_max(vect,min_max);
        if (min!=min_max[1] && max!=min_max[2])fail("resulta faux");

    }

}