public class baum {
    //VARIABELN
    private knoten wurzel;

    //GETTER UND SETTER
    public void setWurzel(knoten wurzel) {
        this.wurzel = wurzel;
    }

    public knoten getWurzel(){
        return wurzel;
    }

    //CONSTRUCKTORS
    baum(knoten wurzel){
        setWurzel(this.wurzel);
    }
    //METHODEN

    
    public void löschen(){

    }

    public void einfügenInt(int x){
        if(getWurzel() == null){
            knoten wurzel = new knoten(null, null, null, x);
            setWurzel(wurzel);
        }else{
            einfügen(getWurzel(),x);
        }
    }


    public void einfügen(knoten parent, int wert){
        if(parent.getWert() > wert || parent.getWert() == wert){
               if(parent.getlK() == null){
                knoten links = new knoten(parent, null, null , wert);
                parent.setlK(links);
               }else{
                einfügen(parent.getlK(), wert);
               }
        }
        if(parent.getWert() < wert){
            if(parent.getrK() == null){
                knoten rechts = new knoten(parent, null, null, wert);
                parent.setrK(rechts);
            }
        }

    }

    public void traversieren(){
        
    }




}
