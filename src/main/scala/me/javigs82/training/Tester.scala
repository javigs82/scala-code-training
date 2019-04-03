package me.javigs82.training

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success}


object Tester extends App {

  def addTwo(n: Int): Future[Int] = Future {
    n + 2
  }

  val givenTwo = addTwo(2) map(e => String.valueOf(e))

  givenTwo.onComplete({
    case Success(value) => println(value)
    case Failure (e) => e.printStackTrace()
  })

  def yieldExample(): Range = {
    lazy val limit = 8 * 3 * 2
    1.to(limit)
  }
}


