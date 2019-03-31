package UnarClass;

import AbstractClass.UnarClass;
import BinarClass.Multiply;
import OtherClass.X;
import InterfaceClass.Function;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Sin")
@XmlRootElement
public class Sin extends UnarClass {

    public Sin(){
        super(new X());
        return;
    }

    public Sin(Function subFunction){
        super(subFunction);
        return;
    }

    @Override
    public double calcFunc(double x) {
        return Math.sin(subFunction.calcFunc(x));
    }

    @Override
    public Function diff() {
        if(subFunction instanceof X)
            return new Cos(new X());

        return new Multiply(new Sin(new X()),new Multiply(new Cos(), subFunction.diff()));
    }
}