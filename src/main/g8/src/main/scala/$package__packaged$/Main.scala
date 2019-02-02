import org.apache.spark.sql.SparkSession

object ne {

  def main(args: Array[String]) {
    val fil = "input\\europe.csv"

    val spark = SparkSession
    .builder
    .appName("Scala-Northern-E")
    .getOrCreate()

    val neDF = spark.read.csv(fil)
    neDF.show()
  }
}
