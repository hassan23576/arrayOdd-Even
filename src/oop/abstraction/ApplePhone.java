package oop.abstraction;

public class ApplePhone implements Phone{

    public void OS(){
        System.out.println("Apple has OS software");
    }

    public void siri(){
        System.out.println("Apple has siri chatbot");
    }

    public void iMessage(){
        System.out.println("apple has iMessage");
    }

    @Override
    public void TurnOn() {


    }

    @Override
    public void TurnOff() {

    }

    @Override
    public void MakeCall() {

    }

    @Override
    public void text() {

    }

}
