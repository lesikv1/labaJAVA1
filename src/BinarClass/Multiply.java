package BinarClass;

import AbstractClass.BinarClass;
import InterfaceClass.Function;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "Multiply")
@XmlRootElement
public class Multiply extends BinarClass {

    public Multiply(){
        super();
        return;
    }

    public Multiply(Function leftFunc, Function rightFunc){
        super(leftFunc,rightFunc);
        return;
    }

    @Override
    public double calcFunc(double x) {
        return this.leftFunc.calcFunc(x) * this.rightFunc.calcFunc(x);
    }

    @Override
    public Function diff() {
        return new Add(new Multiply(this.leftFunc.diff(),this.rightFunc), new Multiply(this.leftFunc,this.rightFunc.diff()));
    }

    @Override
    public String toString(){
        return this.leftFunc.toString() + " * " + this.rightFunc.toString();
    }
}