package AdvancedJava.JAXB;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.MathContext;

public class JsonExample {
        private String str;
        private BigDecimal number;

    public void serialize() throws IOException {
        final JsonExample example = new JsonExample();
        example.setStr( "Some string" );
        example.setNumber( new BigDecimal( 12.33d, MathContext.DECIMAL64 ) );
//        try( final StringWriter writer = new StringWriter() ) {
//            Json.createWriter(writer).write(
//                    Json.createObjectBuilder()
//                            .add("str", example.getStr() )
//                            .add("number", example.getNumber() )
//                            .build()
//            );
//        }
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
