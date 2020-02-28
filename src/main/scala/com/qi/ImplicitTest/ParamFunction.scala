package ImplicitTest

object ParamFunction {

  def printCalc(x:Int,y: Int,f:(Int,Int)=>Int): Unit ={

    val calcResult=f(x,y)
    println(s"${x}和${y}经过函数${f}的计算,结果为:${calcResult}")
  }

  val subtract=(x:Int,y:Int)=>x-y

  def main(args: Array[String]): Unit = {

    printCalc(10,4,_+_)

    println(10,4,(x:Int,y:Int)=>x*y)

    printCalc(10,4,subtract)

    moneyConvert(43,x=>s"€$x")
    moneyConvert(43,x=>s"${"$"}$x")

  }

  def genSequence()={
    var varseq=0
    val addOne=()=>{
      varseq+=1
      varseq
    }
    addOne
  }

  def normal(x:Int,y:String)={

      y match {
        case "中国"=>print(s"￥${x}")
        case "英国"=>print(s"€${x}")
        case _=>print(s"no$x")
      }
  }


  def moneyConvert(x:Int,f:(Int)=>String)={

    print(f(x))
  }


  def multiplyTimes(x:Int,y:Int):Int={

    y match {
      case 1=>x
      case _=>x*multiplyTimes(x,y-1)
    }
  }


def sumList(l:List[Int]):Int={

  l match {
    case Nil=>0
    case _=>l.head+sumList(l.tail)
  }
}


}
