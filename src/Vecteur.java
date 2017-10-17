/**
 * Classe vecteur contient des methode pour manupiler des vecteur
 */
public class Vecteur {


    /**
     *calculer la somme de deux vecteur et gennrer une exeption si la taille des des vect #
     * @param vect1
     * @param vect2
     * @param vect_res
     * @throws ExptionClass
     */

    public void somme_vect (int vect1[],int vect2[],int vect_res[]) throws  ExptionClass{
        if (vect1.length!=vect2.length) throw new ExptionClass();
        else {
           for (int i=1;i< vect1.length;i++) {
               vect_res[i] = vect1[i] + vect2[i];
           }
        }
    }

    /**
     * inverser une vecteur
     * @param vect
     */
    public void invers_vect(int vect[]){
        int i;
        int permute;
        for (i=1;i<(vect.length)/2;i++){
            permute=vect[vect.length-i+1];
             vect[vect.length-i+1]=vect[i];
             vect[i]=permute;
        }
    }

    /**
     * c'est une formule ce forme d'une methode qui calcule le modulo 3 d'un nombre
      * @param num
     */
    public void formule(int num){
        num=num%3;
    }


    public void ap_formule(int vect[]){
        for (int i=1;i<vect.length;i++) {
            formule(vect[i]);
        }
    }

}
