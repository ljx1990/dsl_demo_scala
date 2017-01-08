// Listing 6.23 Another implementation of Portfolio DSL

package ch6.trade
package dsl

import ch6.trade.api._

trait Auditing extends Portfolio {
  val semantics: Portfolio

  val bal: semantics.bal.type
  import bal._

  override def currentPortfolio(account: Account) =
    inBaseCurrency(semantics.currentPortfolio(account))._1
}
