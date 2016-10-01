package practice

class WordCloud {
    def buildCloud(data: String): Map[String, Int] = {
      val stringWithoutPunct = data.replaceAll("\\p{P}(?=\\s|$)", "")
      val dataList = stringWithoutPunct.split(' ').map(_.toLowerCase())
      val cloudMap = Map[String, Int]()
      dataList.foldLeft(Map[String, Int]())((m, s) =>
        if (m.get(s).isDefined) {
          val currentValue = m.getOrElse(s, 0)
          val newValue = currentValue + 1
          m ++ Map(s -> newValue)
        } else
        m ++ Map(s -> 1)
      )
    }
}