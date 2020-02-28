package com.qi.matchcase

case class CaseClassTest(pattr1:String,pattr2:String) {

  var attr="attr"
  def a()="cc"
}

object TestCaseClass{
  def main(args: Array[String]): Unit = {
    val cc=CaseClassTest("test1","test2")
    println(cc.attr)
    println(cc.a())
    println(cc.pattr1)
    println(cc.pattr2)

    cc match {
      case CaseClassTest(_,"test2")=>println("匹配成功")
      case _=>println("匹配不成功")
    }

    println(cc)
    println(MatchPerson("zhangsan",22,"33"))

    cc.attr="222"
println("=========================")
    cc match {
      case CaseClassTest("2","2")=>println("匹配成功")
      case _=>println("匹配不成功")
    }


  }

  class Person(name:String,age:Int,birthday:String)

  case class Student(name:String,age:Int,birthday:String) extends Person(name,age,birthday){

  }
}
