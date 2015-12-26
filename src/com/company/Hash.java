package com.company;

public class Hash{
    int a;
    int b;

    Hash (int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + a;
        result = prime * result + b;
        return result;
        }

    @Override
    public boolean equals (Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Hash other = (Hash) obj;
        if (a != other.a) return false;
        if (b != other.b) return false;
        return true;
    }
}

class HashDemo {

    public static void main(String[] args) {
        Hash object1 = new Hash (5, 10);
        Hash object2 = new Hash (5, 10);

        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
        System.out.println(object1.equals(object2));
    }
}
