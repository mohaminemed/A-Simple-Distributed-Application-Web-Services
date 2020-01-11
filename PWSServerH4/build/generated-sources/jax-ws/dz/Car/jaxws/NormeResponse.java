
package dz.Car.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "normeResponse", namespace = "http://Car.dz/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "normeResponse", namespace = "http://Car.dz/")
public class NormeResponse {

    @XmlElement(name = "return", namespace = "")
    private String _return;

    /**
     * 
     * @return
     *     returns String
     */
    public String getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(String _return) {
        this._return = _return;
    }

}
