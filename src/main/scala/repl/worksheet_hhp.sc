object worksheet_hhp{
  def hello(name:String):String ={
    s"Hello, ${name}"
  }
  hello("黄海鹏")
  def curriedAdd(a:Int)(b:Int) ={a+b};
  curriedAdd(1)(2);
  def addOne = curriedAdd(1)_;
  addOne(4);

  //计算n!
  def factorial(n:Int):Int =
    if(n<=0)1
    else n*factorial(n-1)

  factorial(5)

  def sum(f:Int =>Int)(a:Int)(b:Int):Int = {
    @annotation.tailrec
    def loop(n:Int,acc:Int):Int={
      if(n>b){
        return acc;
      }else{
        return loop(n+1,acc + f(n))
      }
    }
    val ret = loop(a,0)

    return ret;
  }
  sum(x=>x*x)(1)(5)

}
