package OtherClass;

import InterfaceClass.Function;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "X")
@XmlRootElement
public class X extends Function {

    public X() {
    }

    public String getX() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double calcFunc(double x) {
        return x;
    }

    @Override
    public Function diff() {
        return new Const(1);
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
