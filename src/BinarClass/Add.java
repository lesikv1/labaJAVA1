package BinarClass;

import AbstractClass.BinarClass;
import InterfaceClass.Function;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Add")
@XmlRootElement
public class Add extends BinarClass {

    public Add(){
        super();
        return;
    }

    public Add(Function leftFunc,Function rightFunc){
        super(leftFunc,rightFunc);
        return;
    }

    @Override
    public double calcFunc(double x) {
        return this.leftFunc.calcFunc(x) + this.rightFunc.calcFunc(x);
    }

    @Override
    public Function diff() {
        return new Add(this.leftFunc.diff(),this.rightFunc.diff());
    }

    @Override
    public String toString(){
        return this.leftFunc.toString() + " + " + this.rightFunc.toString();
    }
}
