/**
 * Classe vecteur contient des methode pour manupiler des vecteur
 */
public class Vecteur {

    /**
     * trier un vecteur
     * @param vect
     */
    public void trier(int  vect[]){
        int i;
        int  j;
        int permute;
        for (i=1;i<vect.length-1;i++) {
            j=i;
            while (vect[j]>vect[j+1] && j>0){
                permute=vect[j];
                vect[j]=vect[j+1];
                vect[j+1]=permute;
                j--;
            }
        }
    }

    /**
     *clacule le min et max d'un vecteur
     * @param vect
     * @param min_max
     * @return
     */
    public int [] min_max(int vect[],int min_max[]){
        int i;
        min_max[1]=vect[1];
        min_max[2]=vect[1];
        for (i=1;i<vect.length;i++){
            if(vect[i]<min_max[1])min_max[1]=vect[i];
            if(vect[i]>min_max[2])min_max[2]=vect[i];
        }
        return min_max ;

    }
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
