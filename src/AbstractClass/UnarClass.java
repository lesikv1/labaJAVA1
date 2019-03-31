package AbstractClass;

import InterfaceClass.Function;
import javax.xml.bind.annotation.XmlElement;
import java.util.*;

public abstract class UnarClass extends Function {
    @XmlElement(name = "subFunction")
    protected Function subFunction = null;

    public UnarFunc(){
        return;
    }

    public UnarFunc(Function decompositionFunc){
        this.subFunction = decompositionFunc;
        return;
    }

    public double calcFunc(double x){
        return subFunction.calcFunc(x);
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName().toLowerCase() + "(" + subFunction.toString() + ")";
    }

    public abstract Function diff();
}
