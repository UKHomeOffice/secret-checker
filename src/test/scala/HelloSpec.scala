import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "getSecretForRepo" should "identify secrets in the current master branch" in {
    ???
  }

  "getSecretForRepo" should "identify secrets in other current branches" in {
    ???
  }

  "getSecretForRepo" should "identify secrets in the master branch history, that isn't in the latest version of the branch" in {
    ???
  }

  "getSecretForRepo" should "identify secrets in the other branches history, that isn't in the latest version of the branch" in {
    ???
  }
}
