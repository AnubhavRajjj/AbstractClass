public abstract class Instrument {

    public abstract String play();
}
class Piano extends Instrument{

    @Override
    public String play() {
        return ("tan tan tan");
    }
}
class Flute extends Instrument{

    @Override
    public String play() {
        return ("toot toot toot");
    }
}
class Guitar extends Instrument{

    @Override
    public String play() {
        return ("tin tin tin");
    }
}

class PlayingInstruments{
    public static void main(String[] args) {
        Instrument[] arr= new Instrument[10];
        double play=Math.random()*5;
        int playing=(int)play;
        if(playing==0){
            System.out.println("incorrect value");
        }
        else if(playing==1){
            arr[1]=new Piano();
        }
        else if(playing==2){
            arr[2]=new Flute();
        }
        else if(playing==3){
            arr[3]=new Guitar();
        }
        for(int j=1;j<=3;j++){
            if (arr[j] instanceof Piano){
                System.out.println(arr[j].play());
            }
            else if(arr[j] instanceof Flute){
                System.out.println(arr[j].play());
            }
            else if(arr[j] instanceof Guitar){
                System.out.println(arr[j].play());
            }
        }
    }
}