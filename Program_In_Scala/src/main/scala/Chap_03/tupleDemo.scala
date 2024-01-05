package Chap_03

object tupleDemo {

  def main(args: Array[String]): Unit = {

    // 元祖，其实就是c里面的struct;

    var pair = (99,"Luftballons")

    var num = pair(0)

    var what = pair(1)

    // 可变集 和不可变集合

    var jetSet = Set("boeing","Airbus")
    // 不写清楚，这里是使用了一个新的set 里面包含三个参数，然后把jetSet指向他
    jetSet += "Lear"
    var query = jetSet.contains("Cessna")

    import scala.collection.mutable
    val movieSet = mutable.Set("Spotlight","Moonlight")
    movieSet.add("par");


    import scala.collection.mutable
    //创建一个可变映射
    val treasureMap = mutable.Map.empty[Int, String]

    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "Find big X on Ground")
    treasureMap += (3 -> "Dig.")
    val step2 = treasureMap(2)

    // 不可变映射 不可变映射不能使用put
    val romanNumeral = Map(1 -> "i", 2 -> "II", 3 -> "III")

    val four_1 = romanNumeral(3)

    val adjectives = List("one", "two", "red", "blue")
    val nouns = adjectives.map(adj => adj + "Fish")

    val nouns_1 =
      for adj <- adjectives yield
        adj + "Fish"

    println(nouns == nouns_1)

    val length = nouns.map(nouns => nouns.length)

    length.foreach(println)

    val lengths =
      for noun <- nouns yield
        noun.length

    val ques = Vector("Who", "What")
    val usingMap = ques.map(q => q.toLowerCase() + "?")

    val usingForYield =
      for q <- ques yield
        q.toLowerCase() + "?"

    //usingMap.foreach(println)

    val startsW = ques.find(q => q.startsWith("W"))
    print(startsW)

    val option = startsW.map(w => w.toUpperCase)
    print(option)

    val optional =
      for st <- startsW yield
        st.toUpperCase

    print(option)

    val containX = ques.find(q => q.endsWith("X"))

    // 当是some(x) 的时候，则会bi'a
    val option1 = containX.map(q => q.toUpperCase)
    println(option1)


  }

  def printingtArgs(args: List[String]): Unit =
    args.foreach(println);

  def printargs(args:List[String]) = args.mkString("\n")


}
