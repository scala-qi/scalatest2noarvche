package com.qi.matchcase

object MatchCaseTest {

  def matchTest1(m:Int)={
    val x=1
    val y=2
    m match {
      case `x`=>println(s"匹配上了x")
      case `y`=>print(s"匹配上了y")
      case v1 if v1>10=>print("匹配上了一个大于10的值")
      case _=>print("前面都没有匹配上")
    }
  }

  def mathPerson(p:MatchPerson)={
    p match {
      case MatchPerson("张三",age,birthday)=>print(s"张三的年龄是:${age},生日是:${birthday}")
      case MatchPerson(_,20,_)=>println(s"p的年龄是二十岁，基本信息：${p.name},${p.age},${p.birthday}")
      case MatchPerson(name,age,birthday)=>println(s"name：$name,age:$age,birthday:$birthday")

    }
  }

  def mathArray(a:Array[Int])={
    a match {
      case Array(2,5,_,forth,_)=>print(s"第四个元素值是${forth}")
      case _=>print("匹配不成功")
    }
  }

  def matchTuple(a:(Int,String,Int))={
    a match {
      case (1,"33",third)=>print(s"匹配成功,并且第三个元素值为$third")
      case _=>print("元组匹配不上")
    }
    val map =Map(1->"123",2->"345",3->567)
    for((a,b)<-map) println(s"key:$a,value:$b")

  }

  def matchType(x:Any)={
    x match {
      case _:Int=>println(s"x的值是$x")
      case _=>println("s的值不是Int")
    }

    x match {
      case _:Int=>println("x是Int")
      case _:String=>println("x是String")
      case _:Double=>println("x是double")
      case _:Array[Int]=>println("x是Array[Int]")
      case _:MatchPerson=>println("x是MatchPerson")
    }
  }

  def matchVar(x:List[String]): Unit ={
    x match {
      case List(_,one,two,three@_,four@_)=>println(s"长度是5,尾部是:${List(one,two,three,four)}")
      case _=>println("匹配不成功")
    }
  }

  def regexmatch(x:String)={
    val regex="(.*) (\\d+) (\\d+)".r

    x match {
      case regex(name,age,birthday)=>println(s"name: $name,age:$age,birthday:$birthday")
      case _=>println("匹配不成功")
    }
  }


  def main(args: Array[String]): Unit = {
    regexmatch("张三 24 20120809")
  }


}
