import java.util.ArrayList;
public class Curators extends ArrayList<Curator>{
    public void addCurator(Curator curator){
        this.add(curator);
    }
    public Curator getCurator(int index){
        return this.get(index);
    }
    public void setCurator(int index, Curator curator){
        this.set(index, curator);
    }
}
