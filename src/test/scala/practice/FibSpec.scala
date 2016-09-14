package practice

import org.scalatest.{FlatSpec, Matchers}

class FibSpec  extends FlatSpec with Matchers {
  "getFibValue" should "return the correct value" in {
    val fib = new Fib
    fib.getFibValue(0) shouldBe 0
    fib.getFibValue(1) shouldBe 1
    fib.getFibValue(2) shouldBe 1
    fib.getFibValue(3) shouldBe 2
    fib.getFibValue(4) shouldBe 3
  }
}

//011235
