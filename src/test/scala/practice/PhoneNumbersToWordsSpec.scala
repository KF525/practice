package practice

import org.scalatest.{FlatSpec, Matchers}

class PhoneNumbersToWordsSpec extends FlatSpec with Matchers {
  val phoneNumbersToWords = new PhoneNumbersToWords2

  "convertToWords" should "" in {
      phoneNumbersToWords.convertToWords(12) shouldBe Seq("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
      phoneNumbersToWords.convertToWords(832) shouldBe Seq("vgd", "vge", "vgf", "vhd", "vhe", "vhf", "vid", "vie", "vif", "wgd", "wge", "wgf", "whd", "whe", "whf", "wid", "wie", "wif", "xgd", "xge", "xgf", "xhd", "xhe", "xhf", "xid", "xie", "xif")
      phoneNumbersToWords.convertToWords(912) shouldBe Seq("yad", "yae", "yaf", "ybd", "ybe", "ybf", "ycd", "yce", "ycf", "zad", "zae", "zaf", "zbd", "zbe", "zbf", "zcd", "zce", "zcf")
  }
}

