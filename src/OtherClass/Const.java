package OtherClass;

import InterfaceClass.Function;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Const")
@XmlRootElement
public class Const extends Function {
    private double constant = 0.0d;

    public Const(){
        this.constant = 0.0d;
    }

    public Const(double constant){
        this.constant = constant;
        return;
    }

    public double getConst(){
        return this.constant;
    }

    public void setConst(double constant){
        this.constant = constant;
        return;
    }

    @Override
    public double calcFunc(double x) {
        return this.constant;
    }

    @Override
    public Function diff() {
        return new Const(0);
    }

    @Override
    public String toString(){
        return Double.toString(this.constant);
    }
}
