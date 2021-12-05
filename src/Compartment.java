public abstract class Compartment {

    public abstract String notice();
}

class FirstClass extends Compartment{

    @Override
    public String notice() {
        return("Best to travel") ;
    }
}
class Ladies extends Compartment{

    @Override
    public String notice() {
        return ("only for ladies");
    }
}
class Luggage extends Compartment{

    @Override
    public String notice() {
        return ("only for luggage");
    }
}
class General extends Compartment{

    @Override
    public String notice() {
        return ("can travel in low price");
    }
}
class TestCompartment{
    public static void main(String[] args) {
        Compartment[] arr=new Compartment[10];
        double store = Math.random()*5;
        int store1 = (int)store;
        if(store1==1){
            arr[1]=new FirstClass();
            System.out.println(arr[1].notice());
        }
        else if(store1==2){
            arr[2]=new Luggage();
            System.out.println(arr[2].notice());

            }
        else if(store1==3){
            arr[3]=new General();
            System.out.println(arr[3].notice());
        }
        else if(store1==4){
            arr[4]=new Ladies();
            System.out.println(arr[4].notice());
        }
        else{
            System.out.println("Train is cancelled");
        }
    }
}
