
package dz.Car.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calcul", namespace = "http://Car.dz/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcul", namespace = "http://Car.dz/")
public class Calcul {

    @XmlElement(name = "tab", namespace = "")
    private ArrayList<Integer> tab;

    /**
     * 
     * @return
     *     returns ArrayList<Integer>
     */
    public ArrayList<Integer> getTab() {
        return this.tab;
    }

    /**
     * 
     * @param tab
     *     the value for the tab property
     */
    public void setTab(ArrayList<Integer> tab) {
        this.tab = tab;
    }

}
