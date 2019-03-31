package BinarClass;

import AbstractClass.BinarClass;
import OtherClass.Const;
import InterfaceClass.Function;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "Divide")
@XmlRootElement
public class Divide extends BinarClass {

    public Divide(){
        super();
        return;
    }

    public Divide(Function leftFunc, Function rightFunc){
        super(leftFunc,rightFunc);
        return;
    }

    @Override
    public double calcFunc(double x) {
        if(this.rightFunc instanceof Const && this.rightFunc.calcFunc(0) == 0){
            System.out.println("Error, denominator is zero. Return 0.0d");
            return 0.0;
        }
        return this.leftFunc.calcFunc(x) / this.rightFunc.calcFunc(x);
    }

    @Override
    public Function diff() {
       return new Subtract(new Divide(new Multiply(this.leftFunc.diff(),this.rightFunc), new Multiply(this.leftFunc,this.rightFunc.diff())),new Multiply(this.rightFunc,this.rightFunc));
    }

    @Override
    public String toString(){
        return this.leftFunc.toString() + " / " + this.rightFunc.toString();
    }
}