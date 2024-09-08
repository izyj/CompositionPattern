package Model;

import Interface.Salarie;

public class Employe implements Salarie {

    private String lastName ;

    private  String firstName;

    public Employe(){

    }

    public Employe(String lName, String fName){

        this.lastName = lName;
        this.firstName = fName;
    }
    @Override
    public void work() {

        System.out.println(firstName+ " "+lastName +" is working");

    }

    @Override
    public void meeting() {
        System.out.println(firstName+ " "+lastName +" is having a meeting");
    }

    @Override
    public void deplacement() {
        System.out.println(firstName+ " "+lastName +" is on the move");
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
