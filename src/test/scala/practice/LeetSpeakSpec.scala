package practice

import org.scalatest.{FlatSpec, Matchers}

class LeetSpeakSpec extends FlatSpec with Matchers {
  "toLeet" should "return the string in leet speak" in {
    val leetSpeak = new LeetSpeak
    leetSpeak.toLeet("LEET") shouldBe "1337"
  }

}
