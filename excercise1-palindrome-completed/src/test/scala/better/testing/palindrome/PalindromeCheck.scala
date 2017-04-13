package better.testing.palindrome

import Generators._
import org.scalacheck._
import org.scalacheck.Prop.forAll
import org.scalacheck.Arbitrary.arbitrary
import org.scalatest.prop.PropertyChecks
import org.scalatest.PropSpec

object Generators {

  val palindromeGen: Gen[String] = for {
    base <- arbitrary[String]
    middle <- Gen.option(arbitrary[Char])
  } yield base + middle.getOrElse("") + base.reverse

  val maybePalindromeGen: Gen[String] = Gen.oneOf(palindromeGen,arbitrary[String])

}

object PalindromeCheck extends Properties("Palindrome") with PalindromeCheckers {
  property("checkReverse") = forAll(palindromeGen) { s =>
    checkReverse(s)
  }

  property("checkIndices") = forAll(maybePalindromeGen) { s =>
    checkIndices(s) == checkReverse(s)
  }
}

class PalindromeSpecifications extends PropSpec with PropertyChecks with PalindromeCheckers {
  import org.scalatest._
  import Matchers._

  property("checkReverse") { forAll(palindromeGen) { s =>
    checkReverse(s) shouldBe true
  }}

  property("checkIndices") { forAll(palindromeGen) { s =>
    checkIndices(s) shouldBe true
  }}

  property("checkIndices returns false when not palindrome") { forAll(maybePalindromeGen) { s =>
    checkIndices(s) shouldBe checkReverse(s)
  }}
}
