package jonkerridge.string_library_test

import jonkerridge.string_library.StringMethods
import org.junit.Test

class Test3 {
  @Test
  public void test(){
    def sm = new StringMethods()
    String s = "Jon loves Sue"
    String jux = sm.juxtapose(s)
    println "The result from \n$s \nis \n$jux \n"
    assert (jux == "Sue loves Jon ") : "Failed: \n!$jux!\n!$s!\n"
  }

}
