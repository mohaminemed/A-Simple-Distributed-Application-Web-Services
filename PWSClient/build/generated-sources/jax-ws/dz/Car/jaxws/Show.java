
package dz.Car.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "show", namespace = "http://Car.dz/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "show", namespace = "http://Car.dz/")
public class Show {

    @XmlElement(name = "name", namespace = "")
    private double name;

    /**
     * 
     * @return
     *     returns double
     */
    public double getName() {
        return this.name;
    }

    /**
     * 
     * @param name
     *     the value for the name property
     */
    public void setName(double name) {
        this.name = name;
    }

}
