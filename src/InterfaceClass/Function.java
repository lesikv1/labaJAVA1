package InterfaceClass;

import BinarClass.*;
import OtherClass.*;
import UnarClass.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;


public abstract class Function {
    public abstract double calcFunc(double x);
    public abstract Function diff();

    public static void WriteToXML(String file, Function function){
        try(FileOutputStream fos = new FileOutputStream(file)) {
            WriteToXML(fos,function);
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }

    }

    public static void WriteToXML(FileOutputStream fos, Function function) throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(Add.class, Multiply.class, Divide.class, Subtract.class, Cos.class, Sin.class, Tg.class, Exp.class, X.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(function, fos);
    }
}
