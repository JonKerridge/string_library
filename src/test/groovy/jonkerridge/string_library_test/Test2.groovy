package jonkerridge.string_library_test

import jonkerridge.string_library.StringMethods
import org.junit.Test

class Test2 {
  @Test
  public void test(){
    def sm = new StringMethods()
    String s = "was I tac a ro rac a ti saw"
    String rev = sm.reverseString(s)
    println "The result from \n$s \nis \n$rev \n"
    assert (rev == "was it a car or a cat I saw") : "Failed: \n!$rev!\n!$s!\n"
  }

}
