package com.qi.matchcase

class Schoole {
  var schoolName=""
  var address=""

}
object Schoole{
  def apply(): Schoole = new Schoole()

  def apply(name:String,address:String)={
    val result=new Schoole
    result.schoolName=name
    result.address=address
    result
  }
}

object SchooleTest2{
  def main(args: Array[String]): Unit = {
    val sobj=Schoole()
    val  sobj2=Schoole("智游","第五大街")
  }
}
