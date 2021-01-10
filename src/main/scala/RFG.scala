import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession

object RFG {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().appName("sparketl").master("local[6]").getOrCreate()
    val sc = spark.sparkContext
    sc.setLogLevel("warn")
    val scRDD: RDD[String] = sc.textFile("./data/1.txt")

    val resultRDD = scRDD.map(x=>x.toInt*10)
    resultRDD.foreach(println(_))


  }

}
