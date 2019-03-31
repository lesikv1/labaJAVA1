package BinarClass;
import AbstractClass.BinarClass;
import InterfaceClass.Function;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Subtract")
@XmlRootElement
public class Subtract extends BinarClass {

    public Subtract(){
        super();
        return;
    }

    public Subtract(Function leftFunc, Function rightFunc){
        super(leftFunc,rightFunc);
        return;
    }

    @Override
    public double calcFunc(double x) {
        return this.leftFunc.calcFunc(x) - this.rightFunc.calcFunc(x);
    }

    @Override
    public Function diff() {
        return new Divide(this.leftFunc.diff(),this.rightFunc.diff());
    }

    @Override
    public String toString(){
        return this.leftFunc.toString() + " - " + this.rightFunc.toString();
    }

}