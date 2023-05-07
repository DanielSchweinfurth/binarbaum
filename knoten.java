

public class knoten {
    //VARIABLEN
    private knoten parent;
    private knoten rK;
    private knoten lK;
    private int wert;

    //GETTER UND SETTER
    public void setParent(knoten parent){
        this.parent = parent;
    }

    public knoten getParent() {
        return parent;
    }

    public void setWert(int wert){
        this.wert = wert;
    }

    public int getWert(){
        return wert;
    }

    public void setlK(knoten lK) {
        this.lK = lK;
    }

    public knoten getlK() {
        return lK;
    }

    public void setrK(knoten rK) {
        this.rK = rK;
    }

    public knoten getrK() {
        return rK;
    }
    // CONSTRUCKTOREN
    knoten(knoten parent, knoten rechts, knoten links, int wert){
        setParent(parent);
        setrK(rechts);
        setlK(links);
        setWert(wert);
    }

    //METHODEN

    public void status(){
        System.out.println("der Wert beträgt: " + getWert());

        if(getParent() == null){
            System.out.println("Der Knoten ist die Wurzel");
        }
            System.out.println("parent Knoten ist: " + getParent());

        if(getrK() == null){
            System.out.println("Kein rechten Tochterknoten. ");
        }else{
            System.out.println("rechter Tochterknoten: "+ getrK());
        }

        if(getlK() == null){
            System.out.println("Kein linken Tochterknoten.");
        }else{
            System.out.println("linker Tochterknoten: " + getlK()  );
        }

        
    }
}
