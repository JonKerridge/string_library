package jonkerridge.string_library_test

import jonkerridge.string_library.StringMethods
import org.junit.Test

class Test1 {
  @Test
  public void test(){
    def sm = new StringMethods()
    String s1 = "Hello"
    String s2 = "Jon"
    String hj = sm.addWithSpace(s1, s2)
    println "\nThe result is $hj \n\n"
    assert (hj == "Hello Jon") : "Failed: got $hj expected :Hello Jon:"
  }

}
