import org.scalacheck.{Arbitrary, Gen}
import org.scalatest._
import org.scalatest.prop.PropertyChecks

object PersonGen {
  val personGen: Gen[Person] = Gen.resultOf(Person)
}

class PersonSpec extends PropSpec with PropertyChecks {
  import Matchers._
  import PersonGen._

  property("person age") {
    forAll(personGen) { p: Person => p.age should be >= 18 }}
}
