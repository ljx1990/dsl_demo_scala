// Listing 6.21 The Portfolio DSL contract

package ch6.trade
package dsl

import ch6.trade.api._

trait Portfolio {
  val bal: Balances
  import bal._

  def currentPortfolio(account: Account): Balance
}

