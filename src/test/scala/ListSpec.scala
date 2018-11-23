import org.scalatest.{FlatSpec, Matchers}

class ListSpec extends FlatSpec with Matchers {
  //test driven development --> write tests first before coding function
  val list1: List[Int] = List(1, 1, 2, 3, 5, 8)
  "A list" should "1. find the last element" in {
    ListFunction.getLastElement(list1) shouldBe 8
  }

  it should "2. find the last but one element" in {
    ListFunction.getPenultimateElement(list1) shouldBe 5
  }

  it should "3. find the kth element" in {
  ListFunction.getKthElement(list1,1) shouldBe 1
    ListFunction.getKthElement(list1,4) shouldBe 3
    ListFunction.getKthElement(list1,6) shouldBe 8
    }
  it should "4. find the number of elements in a list" in {
    ListFunction.countElements(list1) shouldBe 6
  }
}
