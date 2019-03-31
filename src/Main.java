import BinarClass.*;
import OtherClass.*;
import UnarClass.*;
import Simpson.Simpson;
import InterfaceClass.Function;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    final String fileName = "Function.xml";

    System.out.println("\t\tx = 2\n");
    System.out.println("Test for unarFunc: new Cos(new Sin(new X()))");

    Function test = new Cos(new Sin(new X()));
    System.out.println(test.toString() + " = " + test.calcFunc(2.0));
    System.out.println();
    System.out.println(test.diff().toString());
    System.out.println();
    System.out.println("Simpson : "+ Simpson.action(2.0, 0.6));
    System.out.println();

    System.out.println("Test for binarFunc Multiply: new Multiply(new Cos(new Sin(new X())),new Cos(new Sin(new X())))");
    Function test2 = new Multiply(new Cos(new Sin(new X())),new Cos(new Sin(new X())));
    //Element test2XML = test2.toXML(document);
    System.out.println(test2.toString() + " = " + test2.calcFunc(2.0));
    System.out.println();
    System.out.println(test2.diff().toString());
    System.out.println();
    Function.WriteToXML(fileName,test2);

    System.out.println("Test for binaкFunc Add: new Add(new Cos(new Sin(new X())),new Cos(new Sin(new X())))");
    Function test3 = new Add(new Cos(new Sin(new X())),new Cos(new Sin(new X())));
    System.out.println(test3.toString() + " = " + test3.calcFunc(2.0));
    System.out.println();
    System.out.println(test3.diff().toString());

  }
}
