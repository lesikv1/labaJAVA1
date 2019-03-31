package AbstractClass;
import InterfaceClass.Function;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import javax.xml.bind.annotation.XmlElement;

public abstract class BinarClass extends Function {
    @XmlElement(name = "leftFunc")
    protected Function leftFunc;
    @XmlElement(name = "rightFunc")
    protected Function rightFunc;

    public BinarFunc(){
        this.leftFunc = null;
        this.rightFunc = null;
    }

    public BinarFunc(Function leftFunc,Function rightFunc){
        this.leftFunc = leftFunc;
        this.rightFunc = rightFunc;
        return;
    }

    public abstract Function diff();
}
