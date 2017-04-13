package better.testing.palindrome

import Generators._
import org.scalacheck._
import org.scalacheck.Prop.forAll
import org.scalacheck.Arbitrary.arbitrary
import org.scalatest.prop.PropertyChecks
import org.scalatest.PropSpec

object Generators {
  val palindromeGen: Gen[String] = for {
    s <- arbitrary[String]
  } yield s
}

object PalindromeCheck extends Properties("Palindrome") with PalindromeCheckers {
  property("checkReverse") = forAll(palindromeGen) { s =>
    checkReverse(s)
  }
}

class PalindromeSpecifications extends PropSpec with PropertyChecks with PalindromeCheckers {
  import org.scalatest._
  import Matchers._

  property("checkReverse") { forAll(palindromeGen) { s =>
    checkReverse(s) shouldBe true
  }}
}
