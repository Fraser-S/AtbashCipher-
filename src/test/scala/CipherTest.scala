
import org.scalatest._

class CipherTest extends FlatSpec with Matchers{
  val cipher = new Cipher()

  "Encrypt letter" should "convert a lowercase letter" in{
    cipher.encryptLetter('f') shouldBe 'u'
  }

  it should "convert an uppercase letter" in{
    cipher.encryptLetter('W') shouldBe 'D'
  }

  it should "keep symbols" in{
    cipher.encryptLetter('@') shouldBe '@'
  }

  "Encrypt text" should "encrypt a word" in{
    cipher.encryptText("foobar") shouldBe "ullyzi"
  }

  it should "encrypt a sentence" in {
    cipher.encryptText("this is an example of the atbash cipher") shouldBe "gsrh rh zm vcznkov lu gsv zgyzhs xrksvi"
  }

  it should "decrypt an encrypted text" in {
    cipher.encryptText("draziw") shouldBe "wizard"
  }

}