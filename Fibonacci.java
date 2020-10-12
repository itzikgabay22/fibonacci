import java.math.BigInteger;

public class Fibonacci {
  // check if BigInteger is an even or an odd number
  public  static boolean isEven(BigInteger n){
      if(n.mod(new BigInteger("2")).equals(BigInteger.ZERO))
        return true;
      return false;
    }

  public static BigInteger fib(BigInteger n) {
    boolean isNegative = n.compareTo(BigInteger.ZERO) == -1;
    // handle with negative numbers - treat it like a positive number - and make it negative when the number is an even.
    if (isNegative == true){
        n = n.negate();
      }
    BigInteger a = BigInteger.ZERO;
    BigInteger b = BigInteger.ONE;
    BigInteger sum = BigInteger.ZERO;

    // fib(0) = 0 , fib(1) = 1
    if( n.equals(BigInteger.ZERO)  || n.equals(BigInteger.ONE) ) {
      return n;
    }
    //fib(n) = fib(n-1) + fib (n-2)
    //a = fib(n-2)
    //b = fib(n-1)
    //sum = fib(n)
    for (BigInteger i = BigInteger.TWO ; i.compareTo(n)  <= 0 ; i = i.add(BigInteger.ONE))
    {
      sum = a.add(b);
      a = b;
      b = sum;
    }
    // handle negative numbers as mentioned.
    if(isNegative && isEven(n) ){
      sum = sum.negate();
    }
    return sum;
  }
  
}

