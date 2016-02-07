package io;
import java.io.*;

class Student implements Serializable {

        protected static String faculty;
        private String name;
        private int id;
        private transient String password;
        private static final long serialVersionUID = 1L;

        public Student(String nameOfFaculty, String name, int id, String password){
            faculty = nameOfFaculty;
            this.name = name;
            this.id = id;
            this.password = password;}

        public String toString(){return "\nfaculty " + faculty + "\nname " + name + "\nID " + id + "\npassword " + password;}
    }

  class DemoSerialization {
        public static void main(String[] args) {
            Student goncharenko = new Student("MMF", "Goncharenko", 1, "G017s9");
            System.out.println(goncharenko);
            File fw = new File("demo.dat");
            try {
                ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
                ostream.writeObject(goncharenko);
                ostream.close();}
            catch (IOException e) {System.err.println(e);}

            Student.faculty = "GEO";
            File fr = new File("demo.dat");
            try {
                ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
                Student unknown =(Student)istream.readObject();
                istream.close();
                System.out.println(unknown);}
            catch (ClassNotFoundException ce) {System.err.println(ce);System.err.println("Класс не существует");}
            catch (FileNotFoundException fe) {System.err.println(fe);System.err.println("Файл не найден");}
            catch (IOException ioe) {System.err.println(ioe);System.err.println("Ошибка доступа");}
        }
    }