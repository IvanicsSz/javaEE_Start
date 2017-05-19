package AdvancedJava.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.MathContext;

@XmlAccessorType( XmlAccessType.FIELD )
 @XmlRootElement( name = "example" )
 public class JaxbExample {
         @XmlElement(required = true) private String str;
         @XmlElement(required = true) private BigDecimal number;


    public void serialize() throws JAXBException, IOException {
        final JAXBContext context = JAXBContext.newInstance( JaxbExample.class );
        final Marshaller marshaller = context.createMarshaller();
        final JaxbExample example = new JaxbExample();
        example.setStr( "Some string" );
        example.setNumber( new BigDecimal( 12.33d, MathContext.DECIMAL64 ) );
        try( final StringWriter writer = new StringWriter() ) {
            marshaller.marshal( example, writer );
        }
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }
}