import org.apache.spark.{SparkConf, SparkContext}
import org.scalatest._
import io.gatling.core.Predef._

class SparkSpec extends FunSpec with Matchers with BeforeAndAfterAll {
  implicit lazy val sc: SparkContext = new SparkContext(new SparkConf().setAppName("SparkSpec").setIfMissing("spark.master", "local[*]"))

  describe("I'm a Spark provided test") {
    it("run smth") {
      sc.parallelize(1 to 100).repartition(100).foreach(println)
    }
  }
}
