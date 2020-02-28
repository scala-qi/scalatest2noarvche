package com.qi

package object ImplicitTest {

  implicit def abc(i:Int)={
      new RichInt(i)
  }

  implicit val i:Int=4543

}
