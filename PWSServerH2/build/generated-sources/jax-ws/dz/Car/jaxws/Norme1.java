
package dz.Car.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "norme1", namespace = "http://Car.dz/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "norme1", namespace = "http://Car.dz/")
public class Norme1 {

    @XmlElement(name = "var", namespace = "")
    private String var;

    /**
     * 
     * @return
     *     returns String
     */
    public String getVar() {
        return this.var;
    }

    /**
     * 
     * @param var
     *     the value for the var property
     */
    public void setVar(String var) {
        this.var = var;
    }

}
