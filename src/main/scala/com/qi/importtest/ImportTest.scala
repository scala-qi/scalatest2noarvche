package com.qi.importtest

import java.util

object ImportTest {

  def main(args: Array[String]): Unit = {

    val hmap=new scala.collection.mutable.HashMap[String,String]();
    println(hmap.getClass.toString)

    import java.util.HashMap

    import scala.collection.mutable.{HashMap=>_}

    val omap=new HashMap[String,String]()
    println(omap.getClass.toString)

    import java.util.{HashMap=>Jmap}

    val jmap=new Jmap[String,String]();

    jmap.put("aaa","ccc")
    println(jmap.getClass.toGenericString)
    println(jmap.get("aaa"))
  }

}
