package com.qi.matchcase

abstract class AbstractTest {

  var attr1=""
  var attr2=""
  var attr3:Int

  def method1()=println("调用普通方法1")
  def method2()=println("调用普通方法2")
  def method3():Int
}

class ChildClass extends AbstractTest{
  override def method1(): Unit = super.method1()

  override def method2(): Unit = super.method2()

  override var attr3: Int = 32

  override def method3(): Int = {
    33
  }

  val obj=new AbstractTest {
    override def method3(): Int = 22

    override var attr3: Int = 11

  }
}


