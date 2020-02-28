package com.qi.matchcase

trait TraitTest {

  var attr1=""
  var attr2:String

  def method1()=println("执行TrainTest实现方法method1")

  def method2()
}

trait TraitTest1{

  def method1=println("执行TrainTest1实现的方法method1")

  def method3()
}

class TraintTestImpl extends TraitTest with TraitTest1{
  override var attr2: String = "ccc"

  override def method2(): Unit =println("执行实现类中的实现方法method2")

  override def method3(): Unit = println("执行实现类中的实现方法method3")


}
