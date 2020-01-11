
package dz.Car.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "setN", namespace = "http://Car.dz/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setN", namespace = "http://Car.dz/")
public class SetN {

    @XmlElement(name = "n2", namespace = "")
    private int n2;

    /**
     * 
     * @return
     *     returns int
     */
    public int getN2() {
        return this.n2;
    }

    /**
     * 
     * @param n2
     *     the value for the n2 property
     */
    public void setN2(int n2) {
        this.n2 = n2;
    }

}
