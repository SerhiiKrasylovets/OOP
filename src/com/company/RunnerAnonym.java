package com.company;

public class RunnerAnonym{
    public static void main(String[] args) {

        TypeQuest unique = new TypeQuest(){
            public void addNewType(){System.out.println("new request with free answer");}
        };


        unique.addNewType();

        new TypeQuest(71){
            private String name = "DragDrop";
            public void addNewType(){System.out.println("added " + getName());}
            String getName(){return name;}

        }.addNewType();

        TypeQuest standard  = new TypeQuest(35);

        standard.addNewType();
    }
}
