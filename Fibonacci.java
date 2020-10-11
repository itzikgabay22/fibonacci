import java.math.BigInteger;

public class Fibonacci {

  public static BigInteger fib(BigInteger n) {
    // handle with negative numbers - return -1 or  throw an exception if need.
    if (n.compareTo(BigInteger.ZERO) == -1){
      throw new IllegalArgumentException("Please Enter Only Positive Number. Negetive Numbers Not Allowed");
      }
    BigInteger a = BigInteger.ZERO;
    BigInteger b = BigInteger.ONE;
    BigInteger sum = BigInteger.ZERO;
    if( n == BigInteger.ZERO || n == BigInteger.ONE) {
      return n;
    }

    for (BigInteger i = BigInteger.TWO ; i.compareTo(n)  <= 0 ; i = i.add(BigInteger.ONE))
    {
      sum = a.add(b);
      a = b;
      b = sum;
    }
    return sum;
  }
  
}

