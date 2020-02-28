package com.qi.ImplicitTest

class RichInt(val i:Int) {

def printLnMoney()={
  println(s"￥$i")
}

  def toFloat()={println("Int在RichInt中换成Float")}

}

object ImplicitTest{
  def main(args: Array[String]): Unit = {
    val a:Int=123
    a.printLnMoney()

  }
}
