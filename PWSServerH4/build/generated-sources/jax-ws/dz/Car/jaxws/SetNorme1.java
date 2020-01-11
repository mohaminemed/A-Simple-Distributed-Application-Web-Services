
package dz.Car.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "setNorme1", namespace = "http://Car.dz/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setNorme1", namespace = "http://Car.dz/")
public class SetNorme1 {

    @XmlElement(name = "n1", namespace = "")
    private double n1;

    /**
     * 
     * @return
     *     returns double
     */
    public double getN1() {
        return this.n1;
    }

    /**
     * 
     * @param n1
     *     the value for the n1 property
     */
    public void setN1(double n1) {
        this.n1 = n1;
    }

}
