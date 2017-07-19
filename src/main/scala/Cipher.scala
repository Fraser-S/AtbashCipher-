class Cipher {
  def encryptText(text: String):String ={
    text.map(x => encryptLetter(x))
  }

  def encryptLetter(letter: Char):Char = letter match{
    case lower if letter.isLower => (('z' - lower) + 'a').toChar
    case upper if letter.isUpper => (('Z' - upper) + 'A').toChar
    case _ => letter
  }
}
