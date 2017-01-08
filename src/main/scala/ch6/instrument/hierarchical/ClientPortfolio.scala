// Listing 6.22 A DSL implementation of Portfolio

package ch6.trade
package dsl

import ch6.trade.api.Currencies._
import ch6.trade.api.Util._
import ch6.trade.api._

trait ClientPortfolio extends Portfolio {
  val bal = new BalancesImpl
  import bal._

  override def currentPortfolio(account: Account) = {

    // lookup database to get the amount credited for this account &
    // the currency in which it is booked
    val amount = 10000 //.. stubbed
    val ccy = HKD //.. stubbed
    val asOfDate = TODAY
    
    balance(amount, ccy, asOfDate)
  }
}

object ClientPortfolio extends ClientPortfolio
