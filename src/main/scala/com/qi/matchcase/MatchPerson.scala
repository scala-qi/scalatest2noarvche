package com.qi.matchcase

class MatchPerson {

  var name=""
  var age=0
  var birthday=""

}
object MatchPerson{
  def apply(name:String,age:Int,birthday:String)={
    val result=new MatchPerson()
    result.name=name
    result.age=age
    result.birthday=birthday
    result
  }

  def unapply(arg: MatchPerson): Option[(String,Int,String)] ={
    if (arg==null){
      None
    }else{
      Some(arg.name,arg.age,arg.birthday)
    }
  }
}
