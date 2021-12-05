package com.automobile;

public abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}
class Hero extends Vehicle {
    int speed;
    int i;

    Hero(int speed,int i){
        this.speed=speed;
        this.i=i;

    }

    @Override
    public String getModelName() {
        return ("Hero Honda");
    }

    @Override
    public String getRegistrationNumber() {
        return ("BR0001");
    }

    @Override
    public String getOwnerName(){
        return ("Smriti Srivastava");
    }
    public int getSpeed(){
        return speed;
    }
    public void radio(){
        System.out.println("INFORMATION-: TO ON THE RADIO,PRESS 1 & 2 ");
        if(i==0){
            System.out.println("radio is off");
        }
        else{
            System.out.println("radio is onn");
        }

    }
}
class Honda extends Vehicle{
    int speed1;
    int j;

    Honda(int speed1,int j){
        this.speed1=speed1;
        this.j=j;
    }

    @Override
    public String getModelName() {
        return ("BULLET");
    }

    @Override
    public String getRegistrationNumber() {
        return ("BR00001");
    }

    @Override
    public String getOwnerName() {
        return ("Anubhav Raj");
    }
    public int getSpeed(){
        return speed1;
    }
    public void cdPlayer(){
        System.out.println("INFORMATION-:PRESS 0 TO TURN OFF THE CD PLAYER");
        if(j==1){
            System.out.println("TURN ON THE CD PLAYER");
        }
        else{
            System.out.println("TURN OFF THE CD PLAYER");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Hero obj = new Hero(90,1);
        obj.radio();
        System.out.println(obj.getOwnerName());
        System.out.println(obj.getModelName());
        System.out.println(obj.getRegistrationNumber());
        System.out.println(obj.getSpeed());
        Honda obj1=new Honda(95,1);
        obj1.cdPlayer();
        System.out.println(obj1.getOwnerName());
        System.out.println(obj1.getModelName());
        System.out.println(obj1.getRegistrationNumber());
        System.out.println(obj1.getSpeed());
    }


}


