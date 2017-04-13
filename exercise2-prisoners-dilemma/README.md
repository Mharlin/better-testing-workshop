Prisoner's dilemma
============================

Exercise 2 for Better Testing with less code workshop

Write the specification for the Rules in RuleTest.scala

First step:

Suggested rules to implement
* Defection is always better for me
* The best possible global outcome is both cooperate
* The game is fair - same rules with swapped moves between the players give the same result


Second step:
In StandardBirds implement the following

Nice
* The most important condition is that the strategy must be "nice", that is, it will not defect before its opponent does (this is sometimes referred to as an "optimistic" algorithm). Almost all of the top-scoring strategies were nice; therefore, a purely selfish strategy will not "cheat" on its opponent, for purely self-interested reasons first.

Retaliating
* However, Axelrod contended, the successful strategy must not be a blind optimist. It must sometimes retaliate. An example of a non-retaliating strategy is Always Cooperate. This is a very bad choice, as "nasty" strategies will ruthlessly exploit such players.

Forgiving
* Successful strategies must also be forgiving. Though players will retaliate, they will once again fall back to cooperating if the opponent does not continue to defect. This stops long runs of revenge and counter-revenge, maximizing points.

Non-envious
* The last quality is being non-envious, that is not striving to score more than the opponent.