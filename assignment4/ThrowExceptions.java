package vasundhara.assignment4;

import java.util.regex.Matcher;

public class ThrowExceptions {
    public void m1() throws MyFirstException,MySecondException,MyThirdException
    {
          throw new MyFirstException();
          //throw new MySecondException();
          //throw new MyThirdException;
    }
}
