public class Cat implements IAnimal {

    String Name;
    int Age;
    int Legs = 4;

    public Cat(String name, int age){
        Name = name;
        Age = age;
    }

    public int getLegs() {
        return Legs;
    }

    public void setLegs(int legs) {
        Legs = legs;
    }

    public int Age(){
        return Age;
    }
}
