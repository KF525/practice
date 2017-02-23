package practice


class PhoneNumbersToWords {
  def convertToWords(number: Long) =
    findWordCombinations(number.toString, "", Seq())

  def findWordCombinations(number: String, word: String, collection: Seq[String]): Seq[String] =
    number match {
      case done if done == "" => collection :+ word
      case _ =>
        val letters = lettersMap.getOrElse(number.head, Seq())
        letters.flatMap(letter => findWordCombinations(number.tail, word + letter, collection))
  }

  def lettersMap =
    Map('1' -> Seq('a','b','c'),
        '2' -> Seq('d','e','f'),
        '3' -> Seq('g','h','i'),
        '4' -> Seq('j','k','l'),
        '5' -> Seq('m','n','o'),
        '6' -> Seq('p','q','r'),
        '7' -> Seq('s','t','u'),
        '8' -> Seq('v','w','x'),
        '9' -> Seq('y','z')
    )
}

class PhoneNumbersToWords2 {
  def convertToWords(number: Long) =
    findWordCombinations(number.toString, Seq(""))

  def findWordCombinations(number: String, collection: Seq[String]): Seq[String] =
    number match {
      case "" => collection
      case _ =>
        val letters = lettersMap.getOrElse(number.head, Seq())
        letters.flatMap(letter => findWordCombinations(number.tail, collection.map(x => x + letter)))
    }

  def lettersMap =
    Map('1' -> Seq('a','b','c'),
      '2' -> Seq('d','e','f'),
      '3' -> Seq('g','h','i'),
      '4' -> Seq('j','k','l'),
      '5' -> Seq('m','n','o'),
      '6' -> Seq('p','q','r'),
      '7' -> Seq('s','t','u'),
      '8' -> Seq('v','w','x'),
      '9' -> Seq('y','z')
    )
}


// what is the performance of flatMap
// loop over chars/result
// bad input? nulls?
// To make it more performative: string builder
// Not tail rec. Think about making it tail rec!
// think about what signature should be