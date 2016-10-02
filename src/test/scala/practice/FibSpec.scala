package practice

import org.scalatest.{FlatSpec, Matchers}

class FibSpec  extends FlatSpec with Matchers {
  val fib = new Fib

  "getFibValue" should "return the correct value" in {
    fib.getFibValue(0) shouldBe 0
    fib.getFibValue(1) shouldBe 1
    fib.getFibValue(2) shouldBe 1
    fib.getFibValue(3) shouldBe 2
    fib.getFibValue(4) shouldBe 3
  }

  "getFibValueNR" should "return the correct value" in {
    fib.getFibValueNR(0) shouldBe 0
    fib.getFibValueNR(1) shouldBe 1
    fib.getFibValueNR(2) shouldBe 1
    fib.getFibValueNR(3) shouldBe 2
    fib.getFibValueNR(4) shouldBe 3
  }

  "getFibValueStream" should "return the correct value" in {
    fib.getFibValueStream(0) shouldBe 0
    fib.getFibValueStream(1) shouldBe 1
    fib.getFibValueStream(2) shouldBe 1
    fib.getFibValueStream(3) shouldBe 2
    fib.getFibValueStream(4) shouldBe 3
  }
}

//011235
