package prisoners_dilemma

import org.scalacheck._
import Package._

object RuleGenerators {

//  T = Temptation to defect
//  R = Reward for cooperation
//  P = Punishment payoff
//  S = Suckers payoff

// Example of a valid rule: Rules(temptationToDefect = 3, rewardForMutualCooperation = 2, punishmentForMutualDefection = 1, suckersPenalty = 0)
// Implement rule generator. The values for the different points should be random but follow these rules 2R > (T +  S)
  def ruleGen(max: Points): Gen[Rules] = ???

  implicit val arbRules: Arbitrary[Rules] = ???

}

object RuleTest extends Properties("Prisoner's Dilemma") {
  import Prop._
  import Gen._

  import RuleGenerators._

  //Exerise start by uncommenting and implementing the property and the generator

//  property("Defection is always better for me") =
//     forAll {(rules: Rules, theirMove: Move) =>
//     }


}
