package practice

case class StockDetails(buy: Int, sell: Int, current: Int)

trait StockFinder {
  def returnBestDeal(stockList: List[Int]): Int = stockList match {
    case z if (stockList.isEmpty || stockList.size == 1)  => 0
    case _ => lookForBestDeal(stockList.tail, new StockDetails(stockList.head, 0, 0)).current
  }

  def lookForBestDeal(stockList: List[Int], stockDetails: StockDetails): StockDetails = stockList match {
    case Nil => stockDetails
    case h::Nil => updateDetails(h::Nil, stockDetails)
    case h::t => updateDetails(h::t, stockDetails)
  }

  def updateDetails(priceList: List[Int], stockDetails: StockDetails): StockDetails = priceList.head match {
    case s if (stockDetails.sell == 0 || priceList.head > stockDetails.sell) =>
      val buy = stockDetails.buy
      val newCurrent = s - buy
      if (stockDetails.current == 0 || newCurrent > stockDetails.current) {
        lookForBestDeal(priceList.tail, stockDetails.copy(sell = s, current = s - buy))
      } else {
        lookForBestDeal(priceList.tail, stockDetails)
      }
    case b if (priceList.head < stockDetails.buy) =>
      lookForBestDeal(priceList.tail, stockDetails.copy(buy = b))
    case _ => lookForBestDeal(priceList.tail, stockDetails)
  }
}
