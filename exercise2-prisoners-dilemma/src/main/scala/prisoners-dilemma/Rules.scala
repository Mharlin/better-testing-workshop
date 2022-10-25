package prisoners_dilemma

type Points = Int

sealed trait Move
case object Defect extends Move
case object Cooperate extends Move

type MoveSet = (Move, Move)
type ScoreSet = (Points, Points)
case class Rules(temptationToDefect: Points,
                 rewardForMutualCooperation: Points,
                 punishmentForMutualDefection: Points,
                 suckersPenalty: Points)

object Rules {
  def score(rules: Rules, moves: MoveSet): ScoreSet =
    moves match {
      case (Defect, Cooperate) =>
        (rules.temptationToDefect, rules.suckersPenalty)
      case (Cooperate, Defect) =>
        (rules.suckersPenalty, rules.temptationToDefect)
      case (Cooperate, Cooperate) =>
        (rules.rewardForMutualCooperation, rules.rewardForMutualCooperation)
      case (Defect, Defect) =>
        (rules.punishmentForMutualDefection, rules.punishmentForMutualDefection)
    }
}

