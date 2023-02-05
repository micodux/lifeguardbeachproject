package net.Beaches.project.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="coastal")
public class CoastalReport {
    @XmlElement(name ="coastalvalid")
     private String time;
    @XmlElement(name="title")
    private String title;
    @XmlElement(name ="label")
    private String label;
    @XmlElement(name="text")
    private String text;

    
    public String getTime() {
        return time;
    }


    public void setTime(String time) {
        this.time = time;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getLabel() {
        return label;
    }


    public void setLabel(String label) {
        this.label = label;
    }


    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }

    // private String xmlData;

//   public CoastalReport(String xmlData) {
//     this.xmlData = xmlData;
//   }

//   public String getXmlData() {
//     return xmlData;
//   }

//   public void setXmlData(String xmlData) {
//     this.xmlData = xmlData;
//   }
// }


    public CoastalReport(String time, String title, String label, String text) {
        this.time = time;
        this.title = title;
        this.label = label;
        this.text = text;
    }
}
