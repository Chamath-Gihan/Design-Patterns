package org.example;


public class HumanFactory {

    public Human getHuman(String humanType) {
        if(humanType.equalsIgnoreCase("MALE")){
            return new Male();
        } else if (humanType.equalsIgnoreCase("FEMALE")) {
            return new Female();
        }
        return null;
    }
}
