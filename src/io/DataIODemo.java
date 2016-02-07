package io;
import java.io.*;

class DataIODemo {
    public static void main(String[] args)
        throws IOException {
            try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat")))
            {
                dout.writeDouble(98.6);
                dout.writeInt(1000);
                dout.writeBoolean(true);
            }
            catch (FileNotFoundException e){System.out.println("Cannot open output");return;}
            catch (IOException e){System.out.println("IO Error: " + e);}
            try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat")))
            {
                double d = din.readDouble();
                int i = din.readInt();
                boolean b = din.readBoolean();
                System.out.println("Values are: " + d + " " + i + " " + b);
            }
            catch (FileNotFoundException e){System.out.println("Cannot open input file");return;}
            catch (IOException e) {System.out.println("IO Error: " + e);}
        }
    }
