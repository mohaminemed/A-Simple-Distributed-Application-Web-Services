
package dz.Car.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "setNorme2", namespace = "http://Car.dz/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setNorme2", namespace = "http://Car.dz/")
public class SetNorme2 {

    @XmlElement(name = "n2", namespace = "")
    private double n2;

    /**
     * 
     * @return
     *     returns double
     */
    public double getN2() {
        return this.n2;
    }

    /**
     * 
     * @param n2
     *     the value for the n2 property
     */
    public void setN2(double n2) {
        this.n2 = n2;
    }

}
