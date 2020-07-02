package java_other;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntandBigdemical {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1299213921392193192391293129129321392193");// sử dụng khi long k đáp ứng đc
        BigInteger b = new BigInteger("21323812382112339219392137218391239129321931283218382138213");
        BigInteger c = a.add(b); // +
        a.subtract(b) ; // -
        a.multiply(b) ; // x
        a.divide(b); // /
        System.out.println(c);
        BigDecimal d = new BigDecimal("1.1232138112379123792137219739213971") ; // sử dụng khi double k đáp ứng đc
    }
}
