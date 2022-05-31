
import java.util.Date
import scala.io.Source


object FarmManager {
  def main(args: Array[String]): Unit = {

    val harvestCsv = if (args.length > 1) args(0) else "src/resources/harvest.csv"
    val pricesCsv = if (args.length > 1) args(0) else "src/resources/prices.csv"


    case class Harvest(gatherer: String, date: Date, fruit: String, amount: Double)

    val harvest = Source.fromFile(harvestCsv).getLines().drop(0).toSeq
    for (line <- harvest) {
      val harvestLine = line.foreach(println)

      val prices = Source.fromFile(harvestCsv).getLines().drop(0).toSeq
      for (line <- harvest) {
        val pricesLine = line.foreach(println)
      }

      /*val grouped = prices.groupBy(_.head).view.mapValues(_.map(_.last.toDouble).sum)

      val result = grouped.maxBy(_._2)
      val mostEarningFruit = result._1
      val mostEarningValue = result._2
      println(s"$mostEarningFruit is the best selling fruit overall with total value of $mostEarningValue")*/

    }
  }
}