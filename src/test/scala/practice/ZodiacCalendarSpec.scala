package practice

import org.scalatest.{FlatSpec, Matchers}

class ZodiacCalendarSpec extends FlatSpec with Matchers {
  "findChineseZodiac" should "return the animal and element that corresponds with the year" in {
    val zodiacCalendar = new ZodiacCalendar
    zodiacCalendar.findChineseZodiac(1963) shouldBe (Water, Rabbit)
  }
}
