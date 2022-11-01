package better.testing.palindrome

import org.scalacheck.*
import org.scalacheck.Prop.forAll
import org.scalacheck.Arbitrary.arbitrary
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class PalindromeCheck extends AnyFlatSpec with ScalaCheckPropertyChecks with Matchers with PalindromeCheckers {
  val palindromeGen: Gen[String] = for {
    s <- arbitrary[String]
  } yield s

  it should "check reverse" in {
    forAll(palindromeGen) { s =>
      checkReverse(s) shouldBe true
    }
  }
}
