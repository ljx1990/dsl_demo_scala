// Listing 6.3 Account model in Scala

package ch6.trade
package api

abstract class AccountType(name: String)
case object CLIENT extends AccountType("Client")
case object BROKER extends AccountType("Broker")

import java.util.Date

import ch6.trade.api.Util._

abstract class Account(no: String, name: String, openDate: Date) {
  val accountType: AccountType

  private var closeDate: Date = _
  var creditLimit: BigDecimal = 100000

  def close(date: Date) = {
    closeDate = date
  }
}

case class ClientAccount(no: String, name: String,
  openDate: Date = TODAY) extends Account(no, name, openDate) {
    val accountType = CLIENT
  }

case class BrokerAccount(no: String, name: String,
  openDate: Date = TODAY)   extends Account(no, name, openDate) {
    val accountType = BROKER
  }

object Accounts {
  case object NOMURA extends ClientAccount("Nom-123", "Nomura")
}

