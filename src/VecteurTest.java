import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

/**
 * Created by Bouguedra Adem on 17/10/2017.
 */
public class VecteurTest {
    @Test
    public void somme_vect() throws Exception {
        Vecteur vec=new Vecteur();
        int vect1[]={1,4,3,5};
        int vect2[]={2,1,4,6};
        int eres []={3,5,7,11};
        int rres []= new int[4];
        vec.somme_vect(vect1,vect2,rres);
        assertArrayEquals(eres,rres);

    }

    @Test
    public void invers_vect() throws Exception {
        Vecteur vec=new Vecteur();
        int vect1[]={1,4,3,5};
        int eres []={5,3,4,1};
        vec.invers_vect(vect1);
        assertArrayEquals(eres,vect1);



    }

    @Test
    public void formule() throws Exception {

    }

    @Test
    public void ap_formule() throws Exception {
        Vecteur vec=new Vecteur();
        int vect1[]={1,4,3,5};
        int eres []={1,1,0,2};
        vec.ap_formule(vect1);
        assertArrayEquals(eres,vect1);



    }

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