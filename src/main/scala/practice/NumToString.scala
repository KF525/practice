package practice

class NumToString {
  def convertToString(num: Int): String = {
    if (num == 0) "zero"

    val hundreds: Either[Unit, Option[String]] =
      if (num/100 > 0) {
        Right(onesMap.get(num/100))
      } else Left(())


    val tens: Either[Unit, Option[String]] =
      if (num % 100 / 10 == 0) {
        Right(Some("")) }
      else if (num % 100 / 10 > 1) {
        Right(tensMap.get(num % 100 / 10))
      }
      else {
        Right(onesMap.get(num%100))
      }


    val ones: Either[Unit, Option[String]] =
      if (num % 10 > 0 && num % 100 / 10 != 1) {
        Right(onesMap.get(num % 10))
      } else {
        Left(())
      }

    val hundredsString = hundreds match {
      case Right(Some(num)) => num + " hundred "
      case Right(None) => "Unable to find value"
      case Left(()) => ""
    }

    val tensString = tens match {
      case Right(Some(num)) => num
      case Right(None) => "Unable to find value"
      case Left(()) => ""
    }

    val onesString = ones match {
      case Right(Some(num)) => num
      case Right(None) => "Unable to find value"
      case Left(()) => ""
    }

    hundredsString + tensString + onesString
  }


  val onesMap = Map(
    0 -> "",
    1 -> "one",
    2 -> "two",
    3 -> "three",
    4 -> "foud",
    5 -> "five",
    6 -> "six",
    7 -> "seven",
    8 -> "eight",
    9 -> "nine",
    10 -> "ten",
    11 -> "eleven",
    12 -> "twelve",
    13 -> "thirteen",
    14 -> "fourteen",
    15 -> "fifteen",
    16 -> "sixteen",
    17 -> "seventeen",
    18 -> "eighteen",
    19 -> "nineteen"
  )

  val tensMap = Map(
    2 -> "twenty",
    3 -> "thirty",
    4 -> "forty",
    5 -> "fifty",
    6 -> "sixty",
    7 -> "seventy",
    8 -> "eighty",
    9 -> "ninety"
  )
}
