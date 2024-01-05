package Chap_03

object helloworld {

  def main(args: Array[String]): Unit = {
    // var 定义的变量是不允许重新赋值的，相当于 const *pt 的意思;
    var greetStrings = new Array[String](3)

    // 这里的赋值操作，其实调用的是update方法
    greetStrings.update(0,"hello")
    greetStrings(0) = "Hello"
    greetStrings(1) = ","
    greetStrings(2) = "world!\n"

    for i <- 0 to 2 do
      /**
       * 圆括号的作用是本质上array的调用会执行array.apply(i) 的调用，
       */
      print(greetStrings(i))


    // 创建数组的精简化
    var numNames = Array("zero","one","two")

    // scala 的list 设计成了允许函数式编程的风格，不允许变更；
    var onwTwoThree = List(1,2,3)

    var oneTwo = List(1,2,3,4)
    var threeFour = List(3,4)
    // 会拼接，而不会过滤重复选项；
    var oneTwoFour = oneTwo ::: threeFour

    for i <- oneTwoFour.indices do
      println(oneTwoFour(i));
    println("------------------------------")
    // 在数组上面添加
    oneTwoFour = 5::oneTwo
    for i <- oneTwoFour.indices do
      println(oneTwoFour(i))

    println("------------------------------")

    // 空列表的方式是Nil
    var oneTwoThree = 1 :: 2 :: 3 :: Nil

    // 空数组
    List.empty;
    Nil;

    // 创建一个新list
    List("Cool","Tools","rule")

    var thrill = "Will" :: "Fill" :: "until" :: Nil

    val i = thrill.count(s => s.length == 4)

    var thrillCopy = thrill;


    thrillCopy.drop(2).foreach(println)

    thrillCopy.dropRight(2).foreach(println)

    thrillCopy.exists(s => s == "unitl")

    thrillCopy.filter(s => s.length == 4)

    thrillCopy.forall(s => s.equals("l"))

    thrillCopy.foreach(s => print(s))

    thrillCopy.foreach(print)

    println(thrillCopy.head)

    // 返回最后一个之外的所有元素
    println(thrillCopy.init)

    thrill.isEmpty;

    thrill.length

    thrill.map(s => s + "y")

    // 相当于wm_concat
    thrill.mkString(",")

    thrill.filterNot(s => s.length == 4)

    thrill.reverse // 翻转列表

    //thrill.sortBy((s,t) => s.charAt(0).toLower())

    thrill.tail;

    
















  }

}
