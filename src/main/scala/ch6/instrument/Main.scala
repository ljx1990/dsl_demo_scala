package ch6.trade
package driver

import ch6.trade.dsl._

object Main {
  import TradeImplicits._
  import api._
  import Accounts._
  import Currencies._
  import Instruments._
  import Markets._

  val fixedIncomeTrade =
    200 discount_bonds IBM for_client NOMURA on NYSE at 72.ccy(USD)


  def main(args: Array[String]): Unit = {
    import api.FixedIncomeTradingService._
    println(cashValue(200 discount_bonds IBM for_client NOMURA on NYSE at 72.ccy(USD)))

    fixedIncomeTrade taxes

  }

}
