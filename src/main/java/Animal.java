public class Animal {

    public String talk(){
        return "Meeeee";
    }

    public String size(){
        return "Unknown";
    }

    private String color(){
        return "default colour";
    }
    protected boolean hasFur(){
        return true;
    }
    public final boolean hasTail(){
        return true;
    }
    protected boolean canSwim(){
        return true;
    }
}
