package better.testing.palindrome

import scala.annotation._

trait PalindromeCheckers {

  def checkReverse(s: String): Boolean =
    s == s.reverse

  def checkWithOwnAlgorithm(s: String): Boolean = ???
}

