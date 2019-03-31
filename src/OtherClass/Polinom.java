package OtherClass;

import BinarClass.Multiply;
import InterfaceClass.Function;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

@XmlType(name = "Polinom")
@XmlRootElement
public class Polinom extends Function {
    private int powPolin=0;
    private Function subFunction;
    private Polinom nextPolinom;

    public Polinom(){
        subFunction = new X();
        nextPolinom = null;
    }

    public Polinom(int powPolin){
        this.powPolin = powPolin;
        nextPolinom = null;
        return;
    }

    public Polinom(int powPolin, Function subFunction, Polinom nextPolinom){
        this.powPolin = powPolin;
        this.subFunction = subFunction;
        this.nextPolinom = nextPolinom;
        return;
    }

    @Override
    public String toString(){
        return " (" + subFunction.toString() + ") ^ " + Integer.toString(powPolin) + ((nextPolinom == null) ? "" : nextPolinom.toString());
    }

    @Override
    public double calcFunc(double x) {
        return Math.pow(subFunction.calcFunc(x),powPolin) + ((nextPolinom == null) ? 0.0 : nextPolinom.calcFunc(x));
    }

    @Override
    public Function diff() {
        return new Multiply(new Const(powPolin),new Polinom(powPolin-1));
    }
}
