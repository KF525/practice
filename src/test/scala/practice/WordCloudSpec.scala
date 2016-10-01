package practice

import org.scalatest.{FlatSpec, Matchers}

class WordCloudSpec extends FlatSpec with Matchers {
  "buildCloud" should "return a hash with the word and number of occurrences" in {
    val wordCloud = new WordCloud
    val cloud = wordCloud.buildCloud("Add milk and eggs, then add flour and sugar.")
    cloud should contain theSameElementsAs Map("add" -> 2, "milk" -> 1, "and" -> 2, "then" -> 1, "eggs" -> 1, "flour" -> 1, "sugar" -> 1)
  }
}
