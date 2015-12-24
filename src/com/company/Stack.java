package com.company;

class Stack {
    private int stck[];
    private int tos;

    Stack(int size) {
        tos = -1;
        stck = new int[size];
    }

    void push(int item) {
        if (tos == stck.length-1) System.out.println("Stack is full");
        else stck[++tos] = item;}

    int pop() {
        if (tos < 0) {System.out.println("Stack is not full");return 0;}
        else return stck[tos--];}
}

class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        for (int i=0; i<5; i++) mystack1.push(i);
        for (int i=0; i<8; i++) mystack2.push(i);

        System.out.println("Stack 1 contains:");
        for (int i=0; i<5; i++)
        System.out.print(mystack1.pop() + " ");

        System.out.println('\n' + "Stack 2 contains:");
        for (int i=0; i<8; i++)
        System.out.print(mystack2.pop() + " ");
    }
}
