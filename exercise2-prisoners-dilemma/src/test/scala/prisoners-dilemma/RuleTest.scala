package prisoners_dilemma

import org.scalacheck.*
import Package.*
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

object RuleGenerators {

  //  T = Temptation to defect
  //  R = Reward for cooperation
  //  P = Punishment payoff
  //  S = Suckers payoff

  // Example of a valid rule: Rules(temptationToDefect = 3, rewardForMutualCooperation = 2, punishmentForMutualDefection = 1, suckersPenalty = 0)
  // Implement rule generator. The values for the different points should be random but follow these rules:
  // T > R > P > S and 2R > (T +  S)
  def ruleGen(max: Points): Gen[Rules] = ???

  implicit val arbRules: Arbitrary[Rules] = ???

}

class RuleTest extends AnyFlatSpec with ScalaCheckPropertyChecks with Matchers {

  import RuleGenerators._

  behavior of "Prisoner's Dilemma"

  it should "defection is always better for me" in {

    //Exerise start by uncommenting and implementing the property and the generator
    //    forAll { (rules: Rules, theirMove: Move) =>
    //
    //    }
  }
}
